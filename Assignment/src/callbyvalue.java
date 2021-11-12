
public class callbyvalue {

	int change(int b)
	{
		++b;
		return b;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callbyvalue obj = new callbyvalue();
		int a =20;
		
		int x = obj.change(a);
		
		System.out.println("value of a after passing " +a);
		
		System.out.println("value of x ater modifying" +x);
		
	}

}
