package Day07;
import java.util.Scanner;

public class Fattoriale {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int fattorialeN = 1;
		System.out.println("Inserisci un numero: ");
		int numero = input.nextInt();
		if (numero <= 0) {
			System.out.println("Numero negativo, non posso calcolare il fattoriale");
		}else {
		
			for (int i = 1; i <= numero; i++) {
				fattorialeN = fattorialeN * i;
			}
			System.out.println(fattorialeN);
		}
			input.close();
	}
	
}