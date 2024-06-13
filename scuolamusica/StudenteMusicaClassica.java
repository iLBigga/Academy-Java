package scuolamusica;

public class StudenteMusicaClassica extends Studente {
	
	private String livelloClassico;

	public StudenteMusicaClassica(){
		super();
	}

	public StudenteMusicaClassica(String nome, String cognome, int eta, String strumento, String livelloClassico){
		super(nome, cognome, eta, strumento);
		this.livelloClassico = livelloClassico;
	}

	@Override
	public String toString(){
		return super.toString() + " livello: " + livelloClassico; 
	}
}
