package p167;

import java.text.DecimalFormat;

public class P167 {

	public static void main(String[] args) {
		System.out.println("******************************Բ������ݼ���********************************");
		Ball ball1=new Ball();
		System.out.println("��Ĭ�ϣ�"+ball1.printInfo());
		System.out.println("��Ĭ�ϣ���Բ�� �����е���   �뾶 = "+ball1.getRadius()+"������� = "+keepNum(ball1.getSuperficialArea(),4)+"����� = "+keepNum(ball1.getVolume(),4));
		Ball ball2=new Ball(4);
		System.out.println("���вι��죩"+ball2.printInfo());
		System.out.println("���вι��죩��Բ�� �����е���   �뾶 = "+ball2.getRadius()+"������� = "+keepNum(ball2.getSuperficialArea(),4)+"����� = "+keepNum(ball2.getVolume(),4));
		Ball ball3=new Ball(-3);
		System.out.println("���뾶-3��"+ball3.printInfo());
		System.out.println("******************************Բ̨�����ݼ���********************************");
		Circular circular1=new Circular();
		System.out.println("��Ĭ�ϣ�"+circular1.printInfo());
		System.out.println("��Ĭ�ϣ���Բ̨�� �����е���  �����뾶 = "+circular1.getR1()+"���ײ��뾶 = "+circular1.getR2()+"���� = "+circular1.getHeight()+"������� = "+keepNum(circular1.getSuperficialArea(),4)+"����� = "+keepNum(circular1.getVolume(),4));
		Circular circular2=new Circular(2.0,3.5,3);
		System.out.println("���вι��죩"+circular2.printInfo());
		System.out.println("���вι��죩��Բ̨�� �����е���  �����뾶 = "+circular2.getR1()+"���ײ��뾶 = "+circular2.getR2()+"���� = "+circular2.getHeight()+"������� = "+keepNum(circular2.getSuperficialArea(),4)+"����� = "+keepNum(circular2.getVolume(),4));
		Circular circular3=new Circular(-3,2,3);
		System.out.println("�������뾶-3��"+circular3.printInfo());
		System.out.println("******************************Բ׶�����ݼ���********************************");
		Cone cone1=new Cone();
		System.out.println("��Ĭ�ϣ�"+cone1.printInfo());
		System.out.println("��Ĭ�ϣ���Բ׶�� �����е���   �뾶 = "+cone1.getRadius()+"���� = "+cone1.getHeight()+"������� = "+keepNum(cone1.getSuperficialArea(),4)+"����� = "+keepNum(cone1.getVolume(),4));
		Cone cone2=new Cone(4,5);
		System.out.println("���вι��죩"+cone2.printInfo());
		System.out.println("���вι��죩��Բ׶�� �뾶 = "+cone2.getRadius()+"���� = "+cone2.getHeight()+"������� = "+keepNum(cone2.getSuperficialArea(),4)+"����� = "+keepNum(cone2.getVolume(),4));
		Cone cone3=new Cone();
		cone3.setRadius(4);
		cone3.setHeight(5);
		System.out.println("��ʹ��setter()���ð뾶�͸ߣ�"+cone3.printInfo());
		Cone cone4=new Cone();
		cone4.setRadius(-4);
		cone4.setHeight(5);
		System.out.println("��ʹ��setter()���ð뾶�͸ߣ�"+cone4.printInfo());
	}
	public static String keepNum(double x,int n){
		String str="#.";
		for(int i=1;i<=n;i++){
			str+="#";
		}
		DecimalFormat df=new DecimalFormat(str);
		return df.format(x);
	}

}
