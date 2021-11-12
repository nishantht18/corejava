
public class argumentException {
	
	int m;
	public void setMarks(int marks)
	{
		if(marks<0 || marks>100)
			throw new IllegalArgumentException(Integer.toString(marks));
				else
				m=marks;
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		argumentException s = new argumentException();
		s.setMarks(0);
		System.out.println(s.m);
		
		argumentException s1 = new argumentException();
		s1.setMarks(500);
		
		argumentException s2 = new argumentException();
		s2.setMarks(-10);
	}

}
