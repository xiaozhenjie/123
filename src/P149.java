class Area{
	public double getEllipse(double a,double b){
		return Math.PI*a*b;
	}
	public double getRectangle(double a,double b){
		return a*b;
	}
}
class Ellipse extends Area{
	public double getEllipse(double a,double b){
		return 2*Math.PI*b+4*(a-b);
	}
}
class Rectangle1 extends Area{
	public double getRectangle(double a,double b){
		return 2*(a+b);
	}
}
public class P149 {

	public static void main(String[] args) {
		double ellA,ellP,recA,recP;
		Area objSuper=new Area();
		Ellipse objEll=new Ellipse();
		Rectangle1 objRec=new Rectangle1();
		ellA=Math.rint(objSuper.getEllipse(5.0,4.0)*1000)/1000;//���ø���ķ�������Բ���
		ellP=Math.rint(objEll.getEllipse(5.0, 4.0)*1000)/1000;//��������ķ�������Բ�ܳ�
		recA=Math.rint(objSuper.getRectangle(5.0,4.0)*1000)/1000;//���ø���ķ����󳤷������
		recP=Math.rint(objRec.getRectangle(5.0, 4.0)*1000)/1000;//��������ķ����󳤷������
		System.out.println("��Բ�����Ϊ��"+ellA);
		System.out.println("��Բ���ܳ�Ϊ��"+ellP);
		System.out.println("�����ε����Ϊ��"+recA);
		System.out.println("�����ε��ܳ�Ϊ��"+recP);
	}

}
