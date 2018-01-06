package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JPopupMenu.Separator;

public class SimpleDateFormat类表示时间 {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String today = sdf.format(d);
		System.out.println(today);
		System.out.println(sdf.parse(today));
		System.out.println("------------------");
		String pattern = "yyyy/MM/dd HH:mm:ss";
		sdf.applyPattern(pattern);
		today = sdf.format(d);
		System.out.println(today);
		System.out.println(sdf.parse(today));
	}

}
