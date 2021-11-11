import java.util.Scanner;

public class swapnumber {
	
	int a,b;
	
	public void swapnum(swapnumber sn)
	{
		int temp;
		
		temp = sn.a;
		sn.a = sn.b;
		sn.b = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapnumber sn = new swapnumber();
		
		Scanner sb = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		sn.a = sb.nextInt();
		
		System.out.println("Enter a number");
		
		sn.b = sb.nextInt();
		
		sn.swapnum(sn);
		
		System.out.println("After swapping a==" +sn.a+"b=" +sn.b);
	}

}
