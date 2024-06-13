package Banca;

public class Conto {
	
	private String iban;
	private String intestatario;
	private Double saldo;
	private int count;
	private Operazione[] operazioni;

	public Conto(String iban, String intestatario, Double saldo){
		this.iban = iban;
		this.intestatario = intestatario;
		this.saldo = saldo;
		operazioni = new Operazione[10];
	}

	public void setIban(String iban){
		this.iban = iban;
	}

	public void setIntestatario(String intestatario){
		this.intestatario = intestatario;
	}

	public void setSaldo(Double saldo){
		this.saldo = saldo;
	}

	public String getIban(){
		return iban;
	}

	public String getIntestatario(){
		return intestatario;
	}

	public Double getSaldo(){
		return saldo;
	}

	public void mostraInfo(){
		System.out.println("Conto:");
		System.out.println("Intestatario: " + intestatario);
		System.out.println("Iban: " + iban);
		System.out.println(String.format("Saldo: %.2f$", saldo));
	}

	public void prelievo(Double importo){
		System.out.println("PRELIEVO");
		if(importo <= saldo){
			this.saldo -= importo;
			Operazione op = new Operazione(importo, "P");
			if(count == 9){
				for(int i = 0; i < operazioni.length-1; i++){
					operazioni[i] = operazioni[i+1];
				}
				operazioni[count] = op;
			}else{
				operazioni[count++] = op;
			}
			System.out.println("Prelevato: " + importo + "$\n");
		}else{
			System.out.println("Saldo insufficente");
		}
	}

	public void deposito(Double importo){
		System.out.println("DEPOSITO");
		if(importo > 0){
			saldo += importo;
			Operazione op = new Operazione(importo, "D");
			if(count == 9){
				for(int i = 0; i < operazioni.length-1; i++){
					operazioni[i] = operazioni[i+1];
				}
				operazioni[count] = op;
			}else{
				operazioni[count++] = op;
			}
			System.out.println("Depositato: " + importo + "$\n");
		}else{
			System.out.println("Importo non valido");
		}
	}

	public void verificaMovimenti(){
		System.out.println("\nMovimenti conto:\n");
		if(count > 0){
			for(int i = 0; i < count; i++) {
				operazioni[i].mostraInfo();
			}
		}else{
			System.out.println("Nessun movimento");
		}
	}
}
