package Day09;
import Libro.*;

public class UsaLibro {

	public static void main(String[] args) {
		 
		Libro mioLibro = new Libro("Misery", "Stephen King", 1975, 13.29);
		mioLibro.mostraInfo();
		mioLibro.setTitolo("Pet Cemetery");
		mioLibro.mostraInfo();

	}
	
}
