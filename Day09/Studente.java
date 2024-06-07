package Day09;

public class Studente {

	private String nome;
	private String cognome;
	private String matricola;
	private Double votoMedio;

	public Studente(String nome, String cognome, String matricola, Double votoMedio){
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
		this.votoMedio = votoMedio;
	}

	public String getName(){
		return nome;
	}

	public String getCognome(){
		return cognome;
	}

	public String getMatricola(){
		return matricola;
	}

	public Double getVotoMedio(){
		return votoMedio;
	}

	public void setName(String nome){
		this.nome = nome;
	}

	public void setCognome(String cognome){
		this.cognome = cognome;
	}

	public void setMatricola(String matricola){
		this.matricola = matricola;
	}

	public void setVotoMedio(Double votoMedio){
		this.votoMedio = votoMedio;
	}

	public void mostraInfo(){
		System.out.println("Nome: " + nome);
		System.out.println("Cognome: " + cognome);
		System.out.println("Matricola: " + matricola);
		System.out.println("Voto Medio: " + votoMedio);
	}
}
