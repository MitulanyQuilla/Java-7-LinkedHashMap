import java.util.*;

/**
 * 
 * @author andres.rubiano
 *
 * LinkedHashMap let you to have an Map data structured sort by data was introduced
 */
public class LinkedHashMapExample {
	
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(5, "Rubiano");
		lhm.put(2, "Del");
		lhm.put(8, "Chiaro");
		lhm.put(12, "Andrés");
		lhm.put(9, "Mauricio");
		
		loopByIterator(lhm);
	}
	
	public static void loopByIterator(LinkedHashMap<Integer, String> lhm) {
		if (null == lhm) return;
		
		Set set = lhm.entrySet();
		Iterator i = set.iterator();
		
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.println("Key => " + me.getKey() + " | Value => " + me.getValue());
		}
	}
}