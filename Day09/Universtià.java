package Day09;

public class Universtià {
	public static void main(String[] args) {
		
		Studente st = new Studente("Mario", "Rossi", "6271992", 6.2);
		st.mostraInfo();
		
		st.setMatricola("48299102");
		st.setVotoMedio(7.4);
		st.mostraInfo();
	}
}
