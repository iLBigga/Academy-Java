package scuolamusica;

public class Main {
	
	public static void main(String[] args) {
		
		StudenteMusicaClassica st1 = new StudenteMusicaClassica("Mario", "Rossi", 18, "Pianoforte", "Principiante");
		StudenteMusicaModerna st2 = new StudenteMusicaModerna("Sara", "Moggi", 22, "Batteria", "Medio");
		StudenteMusicaClassica st3 = new StudenteMusicaClassica("Giovanni", "Spogli", 24, "Xilofono", "Esperto");
		StudenteMusicaModerna st4 = new StudenteMusicaModerna("Mario", "Rossi", 18, "Chitarra elettrica", "Medio");

		InsegnanteTeoria in1 = new InsegnanteTeoria("Giorgio", "Spina", 56, "Strumenti a corde", "Pianoforte");
		InsegnantePratica in2 = new InsegnantePratica("Martina", "Carbotti", 44, "Strumenti a fiato", "Xilofono");
		InsegnantePratica in3 = new InsegnantePratica("Francesco", "Pascoli", 38, "Percussioni", "Batteria");

		Corso corsoTeoria1 = new Corso("Corso corde", in1);
		Corso corsoPratica1 = new Corso("Corso percussioni", in3);
		Corso corsoPratica2 = new Corso("Corso fiato", in2);

		corsoTeoria1.addStudente(st1);
		corsoTeoria1.addStudente(st4);

		corsoPratica1.addStudente(st2);

		corsoPratica2.addStudente(st3);


		System.out.println(corsoTeoria1.toString());
	}
}
