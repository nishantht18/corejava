
public class callbyreference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number =1;
		
		System.out.println("value of number is " +number);
		
		int num = update(number);
		
		System.out.println("value of number after update is " +number);
	}
	
	public static int update(int number)
	{
		number++;
		return number;
	}

}
