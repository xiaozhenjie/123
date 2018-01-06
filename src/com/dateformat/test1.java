package com.dateformat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test1 {

	public static void main(String[] args) {
		DateFormat date=DateFormat.getDateInstance();
		System.out.println(date);
		
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy �� MM �� dd �� HH:mm:ss");��дHH��ʾ24Сʱ��
		
		SimpleDateFormat bartDateFormat=new SimpleDateFormat("EE-MMMM-dd-yy");
		
		Date date1=new Date();
		System.out.println(bartDateFormat.format(date1));
		DateFormat shortDateFormat=DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);//xx-x-xx ����xx:xx
		System.out.println("short:       "+shortDateFormat.format(date1));
		DateFormat mediumDateFormat=DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);//xxxx-x-xx xx:xx:xx
		System.out.println("medium:      "+mediumDateFormat.format(date1));
		DateFormat longDateFormat=DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);//xxxx��x��x�� ����xxʱxx��xx��
		System.out.println("long:        "+longDateFormat.format(date1));
		DateFormat fullDateFormat=DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);//xxxx��x��x�� ����x ����xxʱxx��xx�� CST
		System.out.println("full:        "+fullDateFormat.format(date1));
	}

}
