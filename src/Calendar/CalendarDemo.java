package Calendar;

import java.util.*;

public class CalendarDemo {

	public static void main(String[] args) {
		String date="1997��10��10��";
		System.out.println(date.substring(0,4));
		
		System.out.println("��Calendar.YEAR="+Calendar.YEAR);//��
		System.out.println("��Calendar.MONTH="+Calendar.MONTH);//��
		System.out.println("��Calendar.DATE="+Calendar.DATE);//��
		System.out.println("ʱCalendar.HOUR="+Calendar.HOUR);//ʱ
		System.out.println("��Calendar.MINUTE="+Calendar.MINUTE);//��
		System.out.println("��Calendar.SECOND="+Calendar.SECOND);//��
		Calendar time = Calendar.getInstance();
		System.out.println("�����ǣ�"+time.get(Calendar.YEAR)+"��"+(time.get(Calendar.MONTH)+1)+"��"+(time.get(Calendar.DATE))+"��"+time.get(Calendar.HOUR)+"ʱ"+time.get(Calendar.MINUTE)+"��"+time.get(Calendar.SECOND)+"��");
		
		GregorianCalendar gc=new GregorianCalendar();//����GregorianCalendar�Ķ���gc
		
		System.out.println("�����ǣ�"+gc.get(Calendar.YEAR)+"��"+(gc.get(Calendar.MONTH)+1)+"��"+(gc.get(Calendar.DATE))+"��"+gc.get(Calendar.HOUR)+"ʱ"+gc.get(Calendar.MINUTE)+"��"+gc.get(Calendar.SECOND)+"��");
		System.out.println("�����ǣ�"+gc.get(1)+"��"+(gc.get(2)+1)+"��"+gc.get(5)+"��"+gc.get(10)+"ʱ"+gc.get(12)+"��"+gc.get(13)+"��");
	}

}
