public class passbyvalue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Add obj = new Add(5,10);
		
		change(obj.x,obj.y);
		System.out.println("x =" +obj.x);
		System.out.println("y=" +obj.y);
		
	}
	
	public static void change(int x, int y)
	{
		x++;
		y++;
	}
}



	class Add
	{
		int x,y;
		
		Add(int i, int j)
		{
			x=i;
			y=j;
		}
	}
	