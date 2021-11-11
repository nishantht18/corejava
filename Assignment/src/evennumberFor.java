

import java.util.Scanner;

public class evennumberFor {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number range");
		
		int num = sc.nextInt();
		
		for(int i =1;i<=num;i++)
		{
		if(i%2==0)
		{
			System.out.println(i+ "");
		}
		
		}

	}
}