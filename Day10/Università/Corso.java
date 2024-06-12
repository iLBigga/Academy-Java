package Day10.Università;
import java.util.ArrayList;


public class Corso {

	private String nomeCorso;
	private String codiceCorso;
	private ArrayList<Studente> studenti;

	public Corso(String nomeCorso, String codiceCorso){
		this.nomeCorso = nomeCorso;
		this.codiceCorso = codiceCorso;
		this.studenti = new ArrayList<Studente>();
	}
	
	public void aggiungiStudente(Studente s){
		studenti.add(s);
	}
}