package ��װ���໺�����;
/**
 * ��װ�����еĻ�����ƣ���Ԫģʽ Flyweight Pattern�������ʾ��ǻ������
 * Byte , Short , Integer , Long : ���� [-128 , 127]��������� ;
 * Character : ���� [0 , 127]��������� ;
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
		System.out.println(i3 == i4);//true ��[-128 , 127 ]��Χ���ͻ�ȡ�����е�����
		/**
		 * Integer i3 = Integer.valueOf(111)��Integer i1 = new Integer(111); false
			Integer i5 = 111;��Integer i3 = Integer.valueOf(111)  true
		 */
		Integer i5 = 111;//�Զ�װ�� ���ײ� Integer.valueOf(111);
		Integer i6 = 111;//�ײ� Integer.valueOf(111);
		System.out.println(i5 == i6);//true
		
		
		System.out.println("--------------------------");
		

		Integer i11 = new Integer(250);
		Integer i21 = new Integer(250);
		System.out.println(i11 == i21);//false
		
		Integer i31 = Integer.valueOf(251);//251����[-128 , 127 ]��Χ ���͵� new Integer(251);
		Integer i41 = Integer.valueOf(251);
		System.out.println(i31 == i41);//false
		
		Integer i51 = 251;
		Integer i61 = 251;
		System.out.println(i51 == i61);//false
	}

}
