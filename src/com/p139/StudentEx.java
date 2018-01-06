package com.p139;

public class StudentEx extends Person{
	private String stuID;
	private String className;
	private float math;
	private float english;
	private float pTraining;
	private float java;
	StudentEx() {
		super();
		stuID="";
		className="";
		math=0.0f;
		english=0.0f;
		pTraining=0.0f;
		java=0.0f;
	}
	public StudentEx(String iD, String name, String sex, String address,String stuID, String className, float math, float english, float pTraining, float java) {
		super.setID(iD);
		super.setName(name);
		super.setSex(sex);
		super.setAddress(address);
		setStuID(stuID);
		setClassName(className);
		setMath(math);
		setEnglish(english);
		setpTraining(pTraining);
		setJava(java);
	}
	public String getStuID() {
		return stuID;
	}
	public void setStuID(String stuID) {
		this.stuID = stuID;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public float getMath() {
		return math;
	}
	public void setMath(float math) {
		this.math = math;
	}
	public float getEnglish() {
		return english;
	}
	public void setEnglish(float english) {
		this.english = english;
	}
	public float getpTraining() {
		return pTraining;
	}
	public void setpTraining(float pTraining) {
		this.pTraining = pTraining;
	}
	public float getJava() {
		return java;
	}
	public void setJava(float java) {
		this.java = java;
	}
	public void printStuInfo(){
		System.out.print("学号："+stuID+"\t班级："+className+"\t数学："+math+"\t");
		System.out.println("英语："+english+"\t体育"+pTraining+"\tjava:"+java);
	}
	
	
	
}
