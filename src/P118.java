class Person2{
	double id=0.0d;
	String name="";
	char sex=' ';
	int age=0;
	float height=0.0f;
	float weight=0.0f;
	char xuexin=' ';
	boolean isJiehun = false;
	boolean isBin = false;
	String home="";
	public void speak(){
		String x="";
		String y="";
		
		if(isBin){
			x="��������,";
		}else{
			x="δ������,";
		}
		
		if(isJiehun){
			y="�ѽ�顣";
		}else{
			y="δ��顣";
		}
		
		System.out.println("�ҽ�"+name+",�ҵ����֤���ǣ�"+id+",�Ա�"+sex+"������"+age+"�꣬���"+height+"�ף�����"+weight+"���Ѫ��Ϊ"+xuexin+"�ͣ�"+x+y);
	}
	public void jiSuan(float height,float weight){
		double b=0.0d;
		String jieguo=" ";
		this.height=height;
		this.weight=weight;
		b=weight/height/height;
		if(b>=18&&b<25){
			jieguo="��������";
		}else if(b<30){
			jieguo="����";
		}else if(b<35){
			jieguo="��ȷ���";
		}else if(b<40){
			jieguo="�жȷ���";
		}else{
			jieguo="�ضȷ���";
		}
		System.out.println("������Ϊ��"+jieguo);
	}
}
public class P118 {

	public static void main(String[] args) {
		Person2 p=new Person2();
		p.id=1312321312312d;
		p.name="����";
		p.sex='��';
		p.age=19;
		p.height=1.70f;
		p.weight=56.3f;
		p.xuexin='o';
		p.isBin=true;
		p.isJiehun=false;
		p.home="��������";
		p.speak();
		p.jiSuan(p.height, p.weight);

	}

}
