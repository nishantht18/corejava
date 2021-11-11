
public class passbyreference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =1;
		
		System.out.println("number = " +number);
		
		number = update(number);
		 
		System.out.println("number =" +number);
	}
	
	public static int update(int number)
	{
		number ++;
		return number;
	}
}
