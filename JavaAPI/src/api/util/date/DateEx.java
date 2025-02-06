package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateEx {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd");
		
		String result = sdf.format(date);
		System.out.println(result);
		
	}
	
	
}
