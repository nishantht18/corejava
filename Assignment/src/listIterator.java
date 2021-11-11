import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class listIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new LinkedList<>();
		names.add("Java");
		names.add("Core");
		names.add("Assignment");
		names.add("Practice");
		
		ListIterator<String> namesIterator = names.listIterator();
		
		while(namesIterator.hasNext()) {
			System.out.println(namesIterator.next());
		}
		
		for(String s :names)
		{
			System.out.println(s);
		}
	}

}
