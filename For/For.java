package For;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// int valore = 60;
		// int n;
		// int contatore = 0;
		// boolean nonTrovato = true;

		// System.out.println("Inserisci lunghezza ciclo");
		// int x = input.nextInt();

		// for(int i = 0; i < x && nonTrovato; i++){
		// System.out.println("Inserisci un numero");
		// n = input.nextInt();
		// if(n > valore){
		// contatore++;
		// }else if(n < 0){
		// System.out.println("NUMERO NON VALIDO");
		// nonTrovato = false;
		// }
		// }

		// System.out.println(contatore);
		// }

		// ==================================================================

		// int valore = 10;
		// int n;
		// int contatore = 0;
		// boolean trovato = false; // Varibile sentinella

		// for (int i = 1; i < valore && !trovato; i++) {

		// System.out.println("Inserisci un valore");
		// n = input.nextInt();

		// if (n <= 0) {
		// System.out.println("VALORE NEGATIVO");
		// trovato = true;

		// } else {

		// for (int j = 0; j < n && !trovato; j++) {
		// System.out.print("*");
		// System.out.print(j);
		// if (j == 9) {
		// System.out.println("\nLimite raggiunto");
		// trovato = true;
		// }
		// }
		// System.out.print("\n");
		// }

		// }

		// ==================================================================

		// boolean ancora = true;
		// int a[] = {5,3,2,6,7};

		// for(int i = 0; i < a.lenght()-1 && ancora; i++){
		// if(a[i] >= a[i+1]){
		// ancora = false;
		// }
		// }

		// ==================================================================

		// int a[] = { 12, 67, 76, 36, 7, 65, 8 };
		// int b[] = { 24, 42, 18, 4, 9, 47, 8 };
		// boolean trovato = false;
		// int contatore = 0;

		// for (int i = 0; i < a.length && !trovato; i++) {
		// for (int j = 0; j < b.length && !trovato; j++) {
		// if (a[i] == b[j])
		// contatore++;
		// }
		// if (i == (a.length / 2) && contatore == 0) {
		// System.out.println("Nessun elemento in comune");
		// trovato = true;
		// }
		// }

		// if (contatore != 0)23
		// System.out.println("Eelementi trovati: " + contatore);

		// ==================================================================

		/******************************************************************************
		 * 
		 * All'utente viene richiesta una sequenza di 10 numeri interi.
		 * Per ogni numero si dovrC visualizzare una riga di * (asterischi)
		 * lunga quanto il valore del numero digitato.
		 * Se si digiterC un negativo dovrC apparire il messaggio "NEGATIVO".
		 * 
		 * 
		 * Nuovi punti: Se il numero digitato è negativo verrà digitato
		 * "NEGATIVO" e la sequenza si arresterà.
		 * 
		 * Se sono più di 9 asterischi si visualizzeranno i 9 asterischi
		 * e la sequenza si arresterà.
		 * 
		 * In coda al programma l'utente dovrà ricevere un messaggio
		 * per capire il motivo per cui il programma è terminato
		 * 
		 *******************************************************************************/

		int valore = 10;
		int n;
		// int contatore = 0;
		boolean trovato = false; // Varibile sentinella

		for (int i = 1; i < valore && !trovato; i++) {

			System.out.println("Inserisci un valore");
			n = input.nextInt();

			if (n <= 0) {
				System.out.println("VALORE NEGATIVO");
				trovato = true;

			} else {

				for (int j = 0; j < n && !trovato; j++) {
					System.out.print("*");
					System.out.print(j);
					if (j == 9) {
						System.out.println("\nLimite raggiunto");
						trovato = true;
					}
				}
				System.out.print("\n");
			}
		}
	}
}

// import java.util.*;

// public class Main
// {
// public static void main (String[]args)
// {

// Scanner scanner = new Scanner (System.in);

// boolean isInvalidNeg = true;
// boolean isInvalidNum = true;

// System.out.println ("Inserisci numeri:");

// for (int i = 1; i <= 10 && isInvalidNeg ; i++)
// {
// int numero = scanner.nextInt ();
// if (numero < 0)
// {
// System.out.println ("NEGATIVO.");
// isInvalidNeg = false;

// System.out.println("Sei uscito a causa di un numero NEGATIVO.");

// }
// else
// {

// for (int j = 0; j < numero && isInvalidNum; j++)
// {
// System.out.printf ("*\n");
// if (j == 9)
// {
// isInvalidNeg = false;
// isInvalidNum = false;
// System.out.println("Sei uscito a causa di un numero TROPPO GRANDE.");

// }

// }

// }

// }

// if(isInvalidNeg == false && isInvalidNum == false){
// System.out.println("Uscito perchè numero troppo grande.");
// } else {
// System.out.println("Uscito a causa del numero negativo.");
// }

// }
// }

// input.close();
// }
// }
