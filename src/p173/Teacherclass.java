package p173;

public class Teacherclass implements Commonteacher{//��ʦ��
	String name;
	char sex;
	Teacherclass(){
		name="����";
		sex='��';
	}
	Teacherclass(String name,char sex){
		this.name=name;
		this.sex=sex;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setSex(char sex){
		this.sex=sex;
	}
	public String getName(){
		return name;
	}
	public char getSex(){
		return sex;
	}
	public void giveLassons(){
		System.out.println("�ڿ��˰�����������������������");
	}
	public void scientific(){
		System.out.println("�����˰�����������������������������");
	}
	public void course() {
		System.out.println("�γ̽��谡������������������������������������");
	}
	public void banZhuRen() {
		System.out.println("�����ΰ�����������������������");
	}
	public void printInfo(){
		System.out.println("���֣�"+name+"���Ա�"+sex);
	}
}
