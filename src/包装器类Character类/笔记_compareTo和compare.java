package 包装器类Character类;

public class 笔记_compareTo和compare {

	public static void main(String[] args) {
		/*
		 * 包装类型1.compareTo(包装类型2) 方法   
		 * Byte,Short,Character中        返回c1-c2的值
		 * Integer,Float,Double中        大于返回1   等于返回0  小于返回-1
		 * 
		 * 包装类型.compare() 方法
		 * Byte,Short,Character中        返回c1-c2的值
		 * Integer,Float,Double中        大于返回1   等于返回0  小于返回-1
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
		
		System.out.println("Byte.compare:"+Byte.compare((byte)127,(byte)128));//出现上溢 byte最大值为127
		System.out.println("Short.compare:"+Short.compare((short)32,(short)322));
		System.out.println("Character.compare:"+Character.compare('a','d'));
		System.out.println("Integer.compare:"+Integer.compare(1222,1222));
		System.out.println("Float.compare:"+Float.compare(223.3f,2322.3f));
		System.out.println("Double.compare:"+Double.compare(223.3,23.3));
	}

}
