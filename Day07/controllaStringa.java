package Day07;
import java.util.Scanner;

public class controllaStringa {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Inserisic prima parola");
		String a = input.nextLine();

		System.out.println("Inserisci seconda parola");
		String b = input.nextLine();

		String c = "";

		for(int i = 0; i < a.length(); i++){
			if(a.charAt(i) == b.charAt(i)){
				c += a.charAt(i);
			}
		}

		System.out.println(c);

		input.close();

// 		Scanner scanner = new Scanner (System.in);

// System.out.println ("Inserisci prima stringa:");
// String stringa = scanner.nextLine ();

// System.out.println ("Inserisci seconda stringa:");
// String stringa2 = scanner.nextLine ();

// boolean isUguale = false;

// for (int i = 0; i < stringa.length (); i++)
// {
// for (int j = 0; j < stringa2.length (); j++)
// {
// if (stringa.charAt(i) == stringa2.charAt(j))
// {
// isUguale = true;
// break;
// }
// else
// {
// isUguale = false;

// }
// }
// }


// System.out.println (isUguale);

// }
// 	}
	}
}
