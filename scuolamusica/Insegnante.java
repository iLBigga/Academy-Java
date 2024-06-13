package scuolamusica;

public class Insegnante extends Persona {
	
	private String materia;

	public Insegnante(){
		super();
	}

	public Insegnante(String nome, String cognome, int eta, String materia){
		super(nome, cognome, eta);
		this.materia = materia;
	}

	@Override
	public String toString(){
		return super.toString() + " Insegnante materia: " + materia; 
	}
}
