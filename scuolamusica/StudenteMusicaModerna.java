package scuolamusica;

public class StudenteMusicaModerna extends Studente{
	
	private String livelloModerno;

	public StudenteMusicaModerna(){
		super();
	}

	public StudenteMusicaModerna(String nome, String cognome, int eta, String strumento, String livelloModerno){
		super(nome, cognome, eta, strumento);
		this.livelloModerno = livelloModerno;
	}

	@Override
	public String toString(){
		return super.toString() + " livello: " + livelloModerno; 
	}
}
