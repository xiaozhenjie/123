class Person1{
	double id=0;
	String name="";
	char sex=' ';
	int age = 0;
	char isBin=' ';
	float height=0.0f;
	float weight=0.0f;
	String home="";
	public void speak(String inStr){
		System.out.println(inStr+"���ҽ�"+name+",����"+age+"��,���֤���ǣ�"+id+"�Ա�"+sex+",��ߣ�"+height+"cm�����أ�"+weight+"��Ƿ�����ۣ�"+isBin);
	}
	
}
public class P112 {

	public static void main(String[] args) {
		Person1 p=new Person1();
		p.name="����";
		p.id=222231231234124093d;
		p.age=18;
		p.sex='��';
		p.isBin='��';
		p.height=170f;
		p.weight=100f;
		p.home="��������";
		p.speak("��Һ�");
	}

}
