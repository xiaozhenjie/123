package Extends_Demo;


public class Student extends Person{
	private String school;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public void say(){
		System.out.println("������"+getName()+"�����䣺"+getAge()+"��ѧУ��"+getSchool());
	}
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("����");
		stu.setAge(18);
		stu.setSchool("�Ž�ְҵ����ѧԺ");
		stu.say();
	}
}
