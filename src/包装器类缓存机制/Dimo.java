package 包装器类缓存机制;
/**
 * 包装器类中的缓存设计（享元模式 Flyweight Pattern），本质就是缓存设计
 * Byte , Short , Integer , Long : 缓存 [-128 , 127]区间的数据 ;
 * Character : 缓存 [0 , 127]区间的数据 ;
 * @author 47863
 *
 */
public class Dimo {

	public static void main(String[] args) {
		
		Integer i1 = new Integer(111);
		Integer i2 = new Integer(111);
		System.out.println(i1 == i2);//false
		
		Integer i3 = Integer.valueOf("-128");
		Integer i4 = Integer.valueOf("-128");
		System.out.println(i3 == i4);//true 在[-128 , 127 ]范围，就获取缓存中的数据
		/**
		 * Integer i3 = Integer.valueOf(111)和Integer i1 = new Integer(111); false
			Integer i5 = 111;和Integer i3 = Integer.valueOf(111)  true
		 */
		Integer i5 = 111;//自动装箱 ，底层 Integer.valueOf(111);
		Integer i6 = 111;//底层 Integer.valueOf(111);
		System.out.println(i5 == i6);//true
		
		
		System.out.println("--------------------------");
		

		Integer i11 = new Integer(250);
		Integer i21 = new Integer(250);
		System.out.println(i11 == i21);//false
		
		Integer i31 = Integer.valueOf(251);//251不在[-128 , 127 ]范围 ，就得 new Integer(251);
		Integer i41 = Integer.valueOf(251);
		System.out.println(i31 == i41);//false
		
		Integer i51 = 251;
		Integer i61 = 251;
		System.out.println(i51 == i61);//false
	}

}
