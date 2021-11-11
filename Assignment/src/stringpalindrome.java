import java.util.Scanner;

public class stringpalindrome {
	
	static boolean isPalindrome(String input)
	{
		int i =0,  j = input.length() - 1;
		
		while(i<j)
		{
			if(input.charAt(i)!= input.charAt(j))
				return false;
			i++;
			j--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = b.nextLine();
		
		if(isPalindrome(input))
		{
			System.out.println("the given string is palindrome");
		}else
		{
			System.out.println("String is not palindrome");
		}
		
				}

}
