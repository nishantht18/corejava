import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		double output = 0 ;
		char operator;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number");
		 num1 = s.nextInt();
		 System.out.println("Enter a number");
		 num2 = s.nextInt();
		 
		 System.out.println("Enter a arithmetic operator");
		 operator = s.next().charAt(0);
		 switch(operator)
		 {
		 case '+':
			 output = num1 + num2;
			 break;
		 case '-':
			 output = num1 - num2;
			 break;
		 case '*':
			 output = num1 * num2;
			 break;
		 case '/':
			 output = num1/num2;
			 break;
		 case '%':
		 	output = num1 % num2;
		 	break;
		 default :
			 System.out.println("No such operator");
			 break;
			 
		 }
		 System.out.println("Output is " +output);
}

}
