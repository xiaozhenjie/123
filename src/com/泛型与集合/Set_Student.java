package com.泛型与集合;

public class Set_Student {
	private String name;
	private String sex;
	private int age;
	private float grade;
	public Set_Student(String name,String sex,int age,float grade){
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.grade=grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	public void speak(){
		System.out.println("自我介绍：我叫"+getName()+"，"+getSex()+"，今年"+getAge()+"岁");
	}
	//重写equals方法
	public boolean equals(Object obj){
		if(obj==null||!(obj instanceof Set_Student)){
			return false;
		}
		Set_Student stu=(Set_Student)obj;
		return this.name.equals(stu.name)&&this.sex.equals(stu.sex)&&this.age==stu.age&&this.grade==stu.grade;
		
	}
	//重写hashCode方法
	public int hashCode(){
		return this.name==null?0:this.name.hashCode()+this.sex.hashCode();
	}

}
