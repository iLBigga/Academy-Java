package Day07;

public class InvertiStringa {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		String parola= "navigare";
		String parolaInvertita = "";

		for (int i = parola.length()-1; i != -1; i--) {
			parolaInvertita += parola.charAt(i);
		}
		System.out.println(parolaInvertita);
		//per scambiare 2 variabili a,b
		//int a;
		//int b;
		//a = a+b; //la somma dei due
		//b = a-b; // b = a-b ==> (a+b)-b
		//a = a-b; // a = a+b-a ==> b

}


}