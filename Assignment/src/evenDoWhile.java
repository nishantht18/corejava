import java.util.Scanner;

public class evenDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter a number range");
			
			int n = s.nextInt();
		
			i =1;
			do{
				
				if(i%2==0)
				{
					System.out.println(i +" ");
				}
				i++;
			}while(i<=n);
		}
	}




