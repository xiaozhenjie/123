package Calendar;

import java.util.*;

public class CalendarDemo {

	public static void main(String[] args) {
		String date="1997年10月10日";
		System.out.println(date.substring(0,4));
		
		System.out.println("年Calendar.YEAR="+Calendar.YEAR);//年
		System.out.println("月Calendar.MONTH="+Calendar.MONTH);//月
		System.out.println("日Calendar.DATE="+Calendar.DATE);//日
		System.out.println("时Calendar.HOUR="+Calendar.HOUR);//时
		System.out.println("分Calendar.MINUTE="+Calendar.MINUTE);//分
		System.out.println("秒Calendar.SECOND="+Calendar.SECOND);//秒
		Calendar time = Calendar.getInstance();
		System.out.println("现在是："+time.get(Calendar.YEAR)+"年"+(time.get(Calendar.MONTH)+1)+"月"+(time.get(Calendar.DATE))+"日"+time.get(Calendar.HOUR)+"时"+time.get(Calendar.MINUTE)+"分"+time.get(Calendar.SECOND)+"秒");
		
		GregorianCalendar gc=new GregorianCalendar();//创建GregorianCalendar的对象gc
		
		System.out.println("现在是："+gc.get(Calendar.YEAR)+"年"+(gc.get(Calendar.MONTH)+1)+"月"+(gc.get(Calendar.DATE))+"日"+gc.get(Calendar.HOUR)+"时"+gc.get(Calendar.MINUTE)+"分"+gc.get(Calendar.SECOND)+"秒");
		System.out.println("现在是："+gc.get(1)+"年"+(gc.get(2)+1)+"月"+gc.get(5)+"日"+gc.get(10)+"时"+gc.get(12)+"分"+gc.get(13)+"秒");
	}

}
