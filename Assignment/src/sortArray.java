
public class sortArray {
	
	static int length;
	
	public static void printArray(int[] array)
	{
		for(int i=0;i<length;i++)
		{
			System.out.print(array[i] + ",");
		}
		System.out.println();
	}
	
	public static void sortArray(int [] array)
	{
		int temp =0;
		for(int i =0;i<length;i++)
		{
			for(int j =i+1;j<length;j++)
			{
				if(array[i]>array[j])
				{
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		System.out.println("Elements of an array sorted in ascending order");
		
		printArray(array);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = new int[] {-5,-9,25,88,0,6,45};
		
		length = array.length;
		
		System.out.println("Elements of original array");
		
		printArray(array);
		
		sortArray(array);
	}

}
