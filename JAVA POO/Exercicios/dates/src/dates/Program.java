package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("mm:ss");
		
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = sdf3.parse("35:00");
		Date y4 = sdf3.parse("30:00");
		

		System.out.println("-------------");
		
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y2: " + sdf3.format(y3));
		System.out.println("y2: " + sdf3.format(y4));

		System.out.println(sdf3.format(y4+y3));

	

}}
