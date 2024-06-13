package scuolamusica;

public class Persona {
	
	private String nome;
	private String cognome;
	private int eta;

	public Persona() {
		super();
	}

	public Persona(String nome, String cognome, int eta){
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	@Override
	public String toString(){
		return "Nome: " + nome + " Cognome: " + cognome + " Età: " + eta;
	}
}
