
public class P175 {

	int aVar=10;
	class Inner{
		int innerBVar;
		Inner(){
			innerBVar=1000;
		}
		public void callOuter(){
			System.out.print("���ڲ��������ʵĳ�Ա�����з��ʣ�");
			innerBVar+=aVar;
			System.out.println("�ⲿ���Ա����aVar="+aVar+"���ڲ���ĳ�Ա����innerBVar="+innerBVar);
		}
	}
	public void printVar(){
		Inner inObj =new Inner();
		System.out.print("���ⲿ���з����ڲ���ı�����");
		System.out.println("innerBVar="+inObj.innerBVar);
		inObj.callOuter();
	}
	public static void main(String[] args) {
		P175 p=new P175();
		p.printVar();

	}

}
