package date;

import java.util.Date;

import org.omg.Messaging.SyncScopeHelper;

public class DateDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println("输出当前时间");
		System.out.println(d1);
		Date d2=new Date(3600000);//Date(long x) 输入1970.1.1日08:00:00以来的毫秒数
		System.out.println("输出Date(long 3600000)方法获得的时间");
		System.out.println(d2);
		/*
		java.util.Date aDate=new java.util.Date();
		System.out.println(aDate);
		*/
		Date d3=new Date(2017-1900,2,3);//已过时  年份-1900 月份-1
		System.out.println("输出时间 ，用已过时方法 年份-1900 月份-1");
		System.out.println(d3);
		
		Date date=new Date();
		System.out.println(date.getTime());//getTime()方法获取1970.1.1日08:00:00以来的毫秒数
		
		System.out.println("中国人的风格："+date.toLocaleString());
	}

}
