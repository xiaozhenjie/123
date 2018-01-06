class Person{
	private String name;
	private String sex;
	private int age;
	private double id;
	Person(){
		name="";
		sex="";
		age=0;
		id=0;
	}
	Person(String name,String sex,int age,double id){
		setName(name);
		setSex(sex);
		setAge(age);
		setId(id);
	}
	public void setName(String name){
		this.name=name;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setId(double id){
		this.id=id;
	}
	public String getName(){
		return name;
	}
	public String getSex(){
		return sex;
	}
	public int getAge(){
		return age;
	}
	public double getId(){
		return id;
	}
	public void speak(){
		if(name.equals("")){
			System.out.println("����û����������ʱ�޷�����");
		}else{
			System.out.println("���ҽ��ܣ��ҽ�"+name+","+sex+",����"+age+"�꣬���֤��Ϊ��"+id);
		}
	}
}
public class P138 {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.speak();
		p1.setName("����");
		p1.setSex("��");
		p1.setAge(18);
		p1.setId(3236182371273678d);
		p1.speak();
		Person p2=new Person("����","��",19,3123213123d);
		p2.speak();
		Person p3=new Person("����","Ů",23,3322312412d);
		System.out.println("���ҽ��ܣ��ҽ�"+p3.getName()+","+p3.getSex()+",����"+p3.getAge()+"�꣬���֤��Ϊ��"+p3.getId());
	}

}
