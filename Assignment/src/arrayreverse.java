import java.util.Scanner;

public class arrayreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter, i=0,j=0, temp;
		int number[]= new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to enter");
		counter = sc.nextInt();
		
		for(i =0;i<counter;i++)
		{
			System.out.println("Enter the array element" +(i+1)+ ":");
			number[i] = sc.nextInt();
		}
		
		j=i-1;
		i=0;
		while(i<j)
		{
			temp = number[i];
			number[i]=number[j];
			number[j]=temp;
			i++;
			j--;
		}
		System.out.println("Reverse array");
		for(i =0;i<counter;i++)
		{
			System.out.println(number[i]+ "");
		}
		
	}

}
