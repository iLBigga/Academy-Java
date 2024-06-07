package Day09;

public class Libro {
	
	private String titolo;
	private String autore;
	private int annoPubblicazione;
	private Double prezzo;

	public Libro(String titolo, String autore, int annoPubblicazione, double prezzo){
		this.titolo = titolo;
		this.autore = autore;
		this.annoPubblicazione = annoPubblicazione;
		this.prezzo = prezzo;
	}

	public String getTitolo(){
		return titolo;
	}

	public void setTitolo(String titolo){
		this.titolo = titolo;
	}

	public String getAutore(){
		return autore;
	}

	public void mostraInfo(){
		System.out.println("Titolo: " + titolo);
		System.out.println("Autore: " + autore);
		System.out.println("Anno pubblicazione: " + annoPubblicazione);
		System.out.println("Prezzo: " + prezzo + "$");
	}
}
