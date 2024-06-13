package scuolamusica;
import java.util.ArrayList;

public class Corso {
	
	private String nomeCorso;
	private Insegnante insegnante;
	private ArrayList<Studente> studentiCorso;

	public Corso(){
		super();
	}

	public Corso(String nomeCorso, Insegnante insegnante){
		this.nomeCorso = nomeCorso;
		this.insegnante = insegnante;
		studentiCorso = new ArrayList<>();
	}

	public void addStudente(Studente studente){
		studentiCorso.add(studente);
	}

	public void removeStudente(Studente studente){
		studentiCorso.remove(studente);
	}

	public String toString(){
		return "Corso: " + nomeCorso + " Insegnante: " + insegnante + " Studenti: " + studentiCorso;
	}
}
