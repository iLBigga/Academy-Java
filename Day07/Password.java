package Day07;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		// Password
		// I sistemi operativi più recenti richiedono che le password degli utenti soddisfino specifici requisiti di complessità. Consideriamo una password “complessa” se:
		// • la sua lunghezza è di almeno sette caratteri
		// • contiene caratteri appartenenti ai seguenti tre gruppi: lettere dell’alfabeto maiuscolo; lettere dell’alfabeto minuscolo; caratteri numerici (0-9)
		// Scrivere un programma che generi automaticamente e visualizzi una password complessa casuale di lunghezza non superiore a 12 caratteri.

		boolean isComplessa = false;
		boolean isIncorretta = false;

		String password = "AA99a5G08AAAAAAAAAAAAAAA";

		if( (password.length()>=7 && password.length()<=12)){
			for (int i = 0; i<password.length(); i++){
				if (password.charAt(i) >= '\u0030' && password.charAt(i) <= '\u0039' && password.charAt(i) >= '\u0061' && password.charAt(i) <= '\u007A' && password.charAt(i) >= '\u005A'){
					isComplessa = true;
				}
			}
		}else{
			System.out.println("Password incorretta");
			isIncorretta=true;
		}

		if(isIncorretta==false){
			System.out.println(isComplessa);
		}

	// 	Scanner input = new Scanner (System.in);
	// 	int fattorialeN = 1;
	//   System.out.println ("Inserisci un numero: ");
	// 	int numero = input.nextInt ();
	// 	if (numero <= 0)
	//  	{
	// 	System.
	// 	  out.println ("Numero negativo, non posso calcolare il fattoriale");
	//  	 }
	// 		else
	//  	 {

	// 	for (int i = 1; i <= numero; i++)
	// 	  {
	// 		fattorialeN = fattorialeN * i;
	// 	  }
	// 	System.out.println (fattorialeN);
	//   }
	input.close ();

	}
}
