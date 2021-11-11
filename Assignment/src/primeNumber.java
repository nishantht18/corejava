import java.util.Scanner;

public class primeNumber {
	
	static boolean checkPrime(int num)
	{
		if(num <=1)
		{
			return false;
		}
		
		for(int i =2;i<num;i++)
		{
			if(num%2==0)
			{
				return false;
			}
		}
		return true;
	}
	
	static void PrintPrime(int num)
	{
		for(int i =2;i<=num;i++)
		{
			if(checkPrime(i))
			{
				System.out.println(i+ "");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		
		PrintPrime(num);
	}

}
