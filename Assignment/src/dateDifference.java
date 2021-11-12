import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDifference {
	
	static void findDifference(String start_date, String end_date)
	{
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		try
		{
			Date date1 = dateformat.parse(start_date);
			Date date2 = dateformat.parse(end_date);
			
			long time_difference = date2.getTime() - date1.getTime();
			
			long seconds_difference = (time_difference/(1000))%60;
			
			long minutes_difference = (time_difference/(1000*60))%60;
			
			long hours_difference = (time_difference/(1000*60*60))%24;
			
			long years_difference = (time_difference/(1000*60*60*24))/365;
			
			long days_difference = (time_difference/(1000*60*60*24))%365;
			
			System.out.println("Difference" + "between two dates is");
			
			System.out.println(years_difference + "years,"
								+ days_difference +  "days," 
								+ hours_difference + "hours," 
								+ minutes_difference + "minutes,"
								+ seconds_difference + "seconds");
			
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
			
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String start_date = "10/01/2018 01:10:20";
		
		String end_date = "10/06/2020 06:30:50";
		 
		 
		findDifference(start_date,end_date);
		
		//updated comment
				
	}

}
