package scuolamusica;
public class Studente extends Persona{
	
	private String strumento;

	public Studente(){
		super();
	}

	public Studente(String nome, String cognome, int eta, String strumento){
		super(nome, cognome, eta);
		this.strumento = strumento;
	}

	@Override
	public String toString(){
		return super.toString() + " Strumento: " + strumento; 
	}
}
