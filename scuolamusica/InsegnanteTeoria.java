package scuolamusica;

public class InsegnanteTeoria extends Insegnante{
	
	private String specializzazioneTeoria;

	public InsegnanteTeoria(){
		super();
	}

	public InsegnanteTeoria(String nome, String cognome, int eta, String materia, String specializzazioneTeoria){
		super(nome, cognome, eta, materia);
		this.specializzazioneTeoria = specializzazioneTeoria;
	}

	public String toString(){
		return super.toString() + "  Specializzazione: " + specializzazioneTeoria + ","; 
	}
}
