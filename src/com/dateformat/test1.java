package com.dateformat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test1 {

	public static void main(String[] args) {
		DateFormat date=DateFormat.getDateInstance();
		System.out.println(date);
		
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH:mm:ss");大写HH表示24小时制
		
		SimpleDateFormat bartDateFormat=new SimpleDateFormat("EE-MMMM-dd-yy");
		
		Date date1=new Date();
		System.out.println(bartDateFormat.format(date1));
		DateFormat shortDateFormat=DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);//xx-x-xx 上午xx:xx
		System.out.println("short:       "+shortDateFormat.format(date1));
		DateFormat mediumDateFormat=DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);//xxxx-x-xx xx:xx:xx
		System.out.println("medium:      "+mediumDateFormat.format(date1));
		DateFormat longDateFormat=DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);//xxxx年x月x日 上午xx时xx分xx秒
		System.out.println("long:        "+longDateFormat.format(date1));
		DateFormat fullDateFormat=DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);//xxxx年x月x日 星期x 上午xx时xx分xx秒 CST
		System.out.println("full:        "+fullDateFormat.format(date1));
	}

}
