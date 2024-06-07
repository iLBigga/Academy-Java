package Day09;
import java.util.Scanner;

public class Studenti {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int sufficenza = 6;

		System.out.println("Inserisci il numero totale di studenti");
		int maxStudents = Integer.parseInt(input.nextLine());

		String[] studenti = new String[maxStudents];
		int[] voti = new int[maxStudents];
		Double mediaVoti = 0.0;

		for(int i = 0; i < studenti.length; i++){
			System.out.println("Inserisci il nome dello studente " + (i+1));
			studenti[i] = input.nextLine();
			
			System.out.println("Inserisci il voto dello studente " + (i+1));
			voti[i] = Integer.parseInt(input.nextLine());
			mediaVoti += voti[i];

		}

		input.close();

		mediaVoti /= voti.length;
		System.out.println("Media voti: " + mediaVoti);

		for (int i = 0; i < studenti.length; i++) {
			System.out.println(String.format("Studente: %s Voto: %d %s", studenti[i], voti[i], (voti[i] > sufficenza ? "Promosso" : "Bocciato")));
		}

		int indexW = 0;

		while(indexW < maxStudents){
			System.out.println(String.format("Studente: %s Voto: %d %s", studenti[indexW], voti[indexW], (voti[indexW] > sufficenza ? "Promosso" : "Bocciato")));
			indexW++;
		}

		int indexDW = 0;

		do{
			System.out.println(String.format("Studente: %s Voto: %d %s", studenti[indexDW], voti[indexDW], (voti[indexDW] > sufficenza ? "Promosso" : "Bocciato")));
			indexDW++;
		}while(indexDW < maxStudents);

	}
}
