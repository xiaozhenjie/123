package date;

import java.util.Date;

import org.omg.Messaging.SyncScopeHelper;

public class DateDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println("�����ǰʱ��");
		System.out.println(d1);
		Date d2=new Date(3600000);//Date(long x) ����1970.1.1��08:00:00�����ĺ�����
		System.out.println("���Date(long 3600000)������õ�ʱ��");
		System.out.println(d2);
		/*
		java.util.Date aDate=new java.util.Date();
		System.out.println(aDate);
		*/
		Date d3=new Date(2017-1900,2,3);//�ѹ�ʱ  ���-1900 �·�-1
		System.out.println("���ʱ�� �����ѹ�ʱ���� ���-1900 �·�-1");
		System.out.println(d3);
		
		Date date=new Date();
		System.out.println(date.getTime());//getTime()������ȡ1970.1.1��08:00:00�����ĺ�����
		
		System.out.println("�й��˵ķ��"+date.toLocaleString());
	}

}
