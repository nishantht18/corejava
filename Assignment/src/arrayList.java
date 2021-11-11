import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("2");
		a.add("4");
		a.add("K");
		a.add("J");
		a.add("10");
		a.add("L");
		
		System.out.println("Arraylist before user input");
		
		for(String cards : a)
		{
			System.out.println(cards + "");
		}
		System.out.println();
		Scanner s = new Scanner(System.in);
		System.out.println("Input to remove fom array list");
		String input = s.nextLine();
		a.remove(input);
		
		System.out.println("ArrayList after user input");
		for(String cards : a)
		{
			System.out.println(cards + "");
		}
		s.close();
	}
	

}
