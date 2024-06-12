package collection_test;
import java.util.*;

public class Test {
	
	public static void main(String args[]) {
		
			List<Integer> arrayList = new ArrayList<Integer>();
			// Boxing
			// arrayList.add(new Integer(20));
			arrayList.add(20);
			arrayList.add(9);
			arrayList.add(3);
			arrayList.add(17);
			//arrayList.remove(3); // Elimino numero 17
			//arrayList.remove(new Integer(3)); // Elinimo numero 3
			
	//		System.out.println("Lista stampata con enhanced for");
	//		for(Integer numero : arrayList) {
	//			System.out.println(numero);
	//		}
			
	//		System.out.println("Lista stampata con for");
	//		for(int i = 0; i < arrayList.size(); i++) {
	//			System.out.println(arrayList.get(i));
	//		}
			// il puntatore al primo elemento dell'arrayList lo devo far restituire dall'array stesso
			Iterator iter = arrayList.iterator();
			System.out.println("Lista stampata con iterator e while");
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}
			
	//		[4] [63] [84] [23]
	//		 0    1    2    3
	//		[4] [63] [23]
	//		 0	 1    2	
			List<Integer> array1 = new ArrayList<Integer>();
			Iterator iter1 = array1.iterator();
			System.out.println("Lista stampata con iterator e while");
			while(iter1.hasNext()) {
				System.out.println(iter1.next());
			}
			
			List<Integer> array2 = new ArrayList<Integer>();
			array2.add(2);
			array2.add(4);
			array2.add(10);
			array2.add(5);
			array2.add(15);
			array2.add(3);
			
			for(int i = 0; i<array2.size(); i++) {
				if(array2.get(i) % 2 == 1) {
					array2.remove(i);
				}
			}
			for(Integer numero : array2) {
				System.out.println(numero);
			}
			
			List<String> array3 = new LinkedList<String>();
			array3.add("Ciao");
			array3.add("Mamma");
			array3.add("Pasta");
			array3.add("Palla");
			
			System.out.println("Lista stampata con enhanced for");
			for(String parola : array3) {
				System.out.println(parola);
			}
			
			System.out.println("Lista stampata con for");
			for(int i = 0; i < array3.size(); i++) {
				System.out.println(array3.get(i));
			}
			
			System.out.println("Lista stampata con iterator e while");
			Iterator<String> iter2 = array3.iterator();
			while(iter2.hasNext()) {
				System.out.println(iter2.next());
			
			
			System.out.println("Lista stampata con list iterator");
			ListIterator<String> iterBidi = array3.listIterator();
			while(iterBidi.hasNext()) {
				System.out.println(iterBidi.next());
			}
			while(iterBidi.hasPrevious()) {
				System.out.println(iterBidi.previous());
			}
			
			Stack<Double> stack = new Stack<Double>();
			stack.push(2.3);
			stack.push(10.4);
			stack.push(7.6);
			stack.push(9.2);
			stack.pop(); // Elimina ultimo elemento inserito
			System.out.println("Lista stampata con enhanced for");
			for(Double numero : stack) {
				System.out.println(numero);
			}
			System.out.println("Elemento in cima allo stack");
			System.out.println(stack.peek());
	//		[9.2]
	//		[7.6]
	//		[10.4]
	//		[2.3]
			System.out.println("Primo elemento inserito nello stack");
			System.out.println(stack.get(0));
			
			Set<Character> setCharater = new HashSet<Character>();
			setCharater.add('B');
			setCharater.add('C');
			setCharater.add('D');
			setCharater.add('A');
			setCharater.add('A');
			setCharater.add('C');
			
			Iterator<Character> itrSet = setCharater.iterator();
			System.out.println("HashSet stampato con iteratore");
			while(itrSet.hasNext()) {
				System.out.println(itrSet.next());
			}
			
			Set<Double> setDouble = new HashSet<Double>();
			setDouble.add(7.9);
			setDouble.add(1.6);
			setDouble.add(17.8);
			setDouble.add(5.6);
			
			Iterator<Double> itrSetDouble = setDouble.iterator();
			System.out.println("HashSet Double stampato con iteratore");
			while(itrSetDouble.hasNext()) {
				System.out.println(itrSetDouble.next());
			}
			
			Set<Integer> setInteger = new HashSet<Integer>();
			setInteger.add(5);
			setInteger.add(8);
			setInteger.add(1);
			setInteger.add(10);
			setInteger.add(10);
			
			Iterator<Integer> itrSetInteger = setInteger.iterator();
			System.out.println("HashSet Integer stampato con iteratore");
			while(itrSetInteger.hasNext()) {
				System.out.println(itrSetInteger.next());
			}
			
			Set<Double> treeSetDouble = new TreeSet<Double>();
			treeSetDouble.add(8.6);
			treeSetDouble.add(24.6);
			treeSetDouble.add(3.6);
			treeSetDouble.add(1.3);
			
			Iterator<Double> itrTreeSetDouble = treeSetDouble.iterator();
			System.out.println("TreeHashSet Double stampato con iteratore");
			while(itrTreeSetDouble.hasNext()) {
				System.out.println(itrTreeSetDouble.next());
			}
			
			Set<String> setLinkedHash = new LinkedHashSet<>();
			setLinkedHash.add("Ciao");
			setLinkedHash.add("a");
			setLinkedHash.add("tutti");
			setLinkedHash.add("Ciao");
			setLinkedHash.add("a");
			setLinkedHash.add("tutti");
			setLinkedHash.add("mamma");
			
			Iterator<String> itrLinkedHashSet = setLinkedHash.iterator();
			System.out.println("setLinkedHash stampato con iteratore ");
			while (itrLinkedHashSet.hasNext()) {
				System.out.println(itrLinkedHashSet.next());
			}
			
			Map<String, String> hm = new HashMap<String, String>();
			hm.put("Cf4", "Paolo Rossi");
			hm.put("Cf1", "Edoardo Gialli");
			hm.put("Cf2", "Mario Bianchi");
			hm.put("Cf3", "Ernesto Verdi");
			// scansione tramite enhanced for
			System.out.println("");
			Set<String> keySet = hm.keySet(); // recupero l insieme delle chiavi di tipo Stringa
			for (String key : keySet) {
				String valore = hm.get(key);
				System.out.println(key + " : " + valore);

			} // scansione dell HasMap tramite for

			System.out.println("scansione dell HasMap tramite for");

			for (int i = 0; i < keySet.size(); i++) {

			String value = hm.get("Cf" + (i + 1));

			System.out.println("Cf" + (i + 1) + " : " + value);

			} // scansione dell hasmap tramite iterator
			System.out.println("scansione dell hasMap tramite itertor");
			Iterator<String> itrMap = keySet.iterator();
			while (itrMap.hasNext()) {
			String str = itrMap.next();
			System.out.println(str + " : " + hm.get(str));

			}

			Map<String, String> tm = new TreeMap<String, String>();

			tm.put("Cf5", "Paola Rossi");

			tm.put("Cf6", "Edoarda Gialli");

			tm.put("Cf7", "Maria Bianchi");

			tm.put("Cf8", "Ernesta Verdi");

			System.out.println("");

			// scansione tramite enhanced for

			Set<String> keySet1 = tm.keySet(); // recupero l insieme delle chiavi di tipo Stringa

			for (String key : keySet1) {

			String value = tm.get(key);

			System.out.println(key + " : " + value);

			} // scansione dell HasMap tramite for
			System.out.println("scansione dell TreeMap tramite for");
			for (int i = 5; i < keySet1.size() + 5; i++) {
			String value = tm.get("Cf" + i);
			System.out.println("Cf" + i + " : " + value);

			} // scansione dell hasmap tramite iterator

			System.out.println("scansione dell TreeMap tramite itertor");

			Iterator<String> itrMap1 = keySet1.iterator();

			while (itrMap1.hasNext()) {

			String str = itrMap1.next();

			System.out.println(str + " : " + tm.get(str));

			}
	
		}
	}
}
