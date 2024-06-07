package Mesi;

import java.util.Scanner;

public class Mesi {

	public static void main(String[] args) {
		// Chiedo all'utente un numero da 1 a 12, dire in che stagione si trova, se mi
		// chiedeo maggio, giugno, settembre e dicembre devo chidergli il giorno cosi da
		// dargli la staigoen giusta

		Scanner input = new Scanner(System.in);

		System.out.print("Inserisci un mese da 1 a 12");
		int mese = input.nextInt();

		int giorno;

		switch (mese) {
			case 1:
			case 2:
				System.out.println("Inverno");
				break;
			case 3:
				System.out.println("Inserisci un giorno");
				giorno = input.nextInt();
				if (giorno < 20) System.out.println("Inverno");
				else System.out.println("Primavera");
				break;
			case 4:
			case 5:
				System.out.println("Primavera");
				break;
			case 6:
				System.out.println("Inserisci un giorno");
				giorno = input.nextInt();
				if (giorno < 21) System.out.println("Primavera");
				else System.out.println("Estate");
				break;
			case 7:
			case 8:
				System.out.println("Estate");
				break;
			case 9:
				System.out.println("Inserisci un giorno");
				giorno = input.nextInt();
				if (giorno < 22) System.out.println("Estate");
				else System.out.println("Autunno");
				break;
			case 10:
			case 11:
				System.out.println("Autunno");
				break;
			case 12:
				System.out.println("Inserisci un giorno");
				giorno = input.nextInt();
				if (giorno < 21) System.out.println("Autunno");
				else System.out.println("Inverno");
				break;
		}

		input.close();
	}
}
