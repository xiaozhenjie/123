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
		System.out.println("姓名："+getName()+"，年龄："+getAge()+"，学校："+getSchool());
	}
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("张三");
		stu.setAge(18);
		stu.setSchool("九江职业技术学院");
		stu.say();
	}
}
