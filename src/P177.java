interface SayHello{
	void say();
}
class Person12{
	private String name;
	private char sex;
	Person12(){
		name="";
		sex=' ';
	}
	Person12(String name,char sex){
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
	public void turnOn(SayHello s){
		s.say();
	}
}
public class P177 {

	public static void main(String[] args) {
		Person12 p1=new Person12("����",'��');
		p1.turnOn(new SayHello(){
			public void say(){
				System.out.println("��Һã��ҵ������ǣ�"+p1.getName()+"���Ա�Ϊ��"+p1.getSex());
			}
		});
		Person12 p2=new Person12("����",'Ů');
		p2.turnOn(new SayHello(){
			public void say(){
				System.out.println("��Һã��ܸ��˼�����λ");
			}
		});

	}

}
