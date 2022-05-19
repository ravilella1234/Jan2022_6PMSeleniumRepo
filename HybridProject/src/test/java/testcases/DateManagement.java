package testcases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateManagement 
{

	public static void main(String[] args) throws Exception 
	{
		Date d = new Date();
		System.out.println(d.toString());
		
		String dstr = "4-10-2020";
		System.out.println(dstr);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Date d1 = sdf.parse(dstr);
		System.out.println(d1.toString());
		
		sdf = new SimpleDateFormat("d");
		String day = sdf.format(d1);
		System.out.println(day);
		
		sdf = new SimpleDateFormat("MMMM");
		String month = sdf.format(d1);
		System.out.println(month);
		
		sdf = new SimpleDateFormat("yyyy");
		String year = sdf.format(d1);
		System.out.println(year);
	}

}
