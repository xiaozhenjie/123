package com.p139;

class Person {
	private String ID;
	private String name;
	private String sex;
	private String address;
	Person(){
		ID="";
		name="";
		sex="";
		address="";
	}
	
	public Person(String iD, String name, String sex, String address) {
		setID(iD);
		setName(name);
		setSex(sex);
		setAddress(address);
	}

	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void printPerInfo(){
		System.out.println("身份证："+ID+"\t姓名："+name+"\t性别："+sex+"\t地址："+address);
	}
}
