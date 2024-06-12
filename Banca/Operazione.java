package Banca;

public class Operazione {
	
	private Double importo;
	private String tipo;

	public Operazione(Double importo, String tipo){
		this.importo = importo;
		this.tipo = tipo;
	}

	public void setImporto(Double importo){
		this.importo = importo;
	}

	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public Double getImporto(){
		return importo;
	}

	public String getTipo(){
		return tipo;
	}

	public void mostraInfo(){
		System.out.println("Importo: " + importo);
		System.out.println("Operazione: " + tipo);
	}
}
