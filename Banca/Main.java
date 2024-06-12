package Banca;

public class Main {
	
	public static void main(String[] args) {
		
		Banca banca1 = new Banca("Intesa San Paolo", "Milano");

		Conto conto1 = new Conto("94729102", "Mario Rossi", 102002.23);
		Conto conto2 = new Conto("94729102", "Sara Koll", 290232.78);

		banca1.addConto(conto1);
		banca1.addConto(conto2);

		conto1.mostraInfo();
		System.out.println();
		// conto2.mostraInfo();
		
		
		conto1.prelievo(290.99);
		conto1.prelievo(45.99);
		conto1.prelievo(1102.99);
		conto1.deposito(11102.99);

		// conto1.deposito(290.99);
		conto1.mostraInfo();
		conto1.verificaMovimenti();

		banca1.mostraConti();
	}
}
