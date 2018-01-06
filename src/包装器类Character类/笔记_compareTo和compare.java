package ��װ����Character��;

public class �ʼ�_compareTo��compare {

	public static void main(String[] args) {
		/*
		 * ��װ����1.compareTo(��װ����2) ����   
		 * Byte,Short,Character��        ����c1-c2��ֵ
		 * Integer,Float,Double��        ���ڷ���1   ���ڷ���0  С�ڷ���-1
		 * 
		 * ��װ����.compare() ����
		 * Byte,Short,Character��        ����c1-c2��ֵ
		 * Integer,Float,Double��        ���ڷ���1   ���ڷ���0  С�ڷ���-1
		 * 
		 * 
		 * 
		 * 
		 * */

		Byte t1 = new Byte("2");
		Byte t2 = new Byte("32");
		System.out.println("Byte:"+t1.compareTo(t2));
		
		Short s1 = new Short("23");
		Short s2 = new Short((short)2);
		System.out.println("Short:"+s1.compareTo(s2));
		
		Character c1 = new Character('2');
		Character c2 = new Character('a');
		System.out.println("Character:"+c1.compareTo(c2));
		
		Integer i1 = new Integer("223");
		Integer i2 = new Integer("223");
		System.out.println("Integer:"+i1.compareTo(i2));
		
		Float f1 = new Float("222");
		Float f2 = new Float(222);
		System.out.println("Float:"+f1.compareTo(f2));
		
		Double d1 = new Double("22");
		Double d2 = new Double("222");
		System.out.println("Double:"+d1.compareTo(d2)+"\n");
		
		System.out.println("Byte.compare:"+Byte.compare((byte)127,(byte)128));//�������� byte���ֵΪ127
		System.out.println("Short.compare:"+Short.compare((short)32,(short)322));
		System.out.println("Character.compare:"+Character.compare('a','d'));
		System.out.println("Integer.compare:"+Integer.compare(1222,1222));
		System.out.println("Float.compare:"+Float.compare(223.3f,2322.3f));
		System.out.println("Double.compare:"+Double.compare(223.3,23.3));
	}

}
