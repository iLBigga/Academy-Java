package scuolamusica;

public class InsegnantePratica extends Insegnante{
	
	private String specializzazionePratica;

	public InsegnantePratica(){
		super();
	}

	public InsegnantePratica(String nome, String cognome, int eta, String materia, String specializzazionePratica){
		super(nome, cognome, eta, materia);
		this.specializzazionePratica = specializzazionePratica;
	}

	@Override
	public String toString(){
		return super.toString() + "  Specializzazione: " + specializzazionePratica + ","; 
	}
}
