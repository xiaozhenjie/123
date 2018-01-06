package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatDemo {

	public static void main(String[] args) throws ParseException {
		DateFormat df = DateFormat.getInstance();
		System.out.println(df.format(new Date()));
		String format = df.format(new Date());
		System.out.println(df.parse(format));
		System.out.println("------------------");
		DateFormat df1 = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		System.out.println(df1.format(new Date()));
		String format1 = df1.format(new Date());
		System.out.println(df1.parse(format1));
	
	}

}
