import java.util.HashMap;
import java.util.Map;

public class hashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> m = new HashMap<String,Integer>();
		m.put("Jane", 2000);
		m.put("Peter",1000);
		m.put("Larry", 52000);
		m.put("Kane", 8500);
		
		System.out.println("Size of hashmap is " +m.size());
		
	}

}
