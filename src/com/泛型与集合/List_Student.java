package com.�����뼯��;

public class List_Student {
	private String sId;
	private String sName;
	private String sSex;
	private int sAge;
	public List_Student(){}
	public List_Student(String sId,String sName,String sSex,int sAge){
		this.sId=sId;
		this.sName=sName;
		this.sSex=sSex;
		this.sAge=sAge;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsSex() {
		return sSex;
	}
	public void setsSex(String sSex) {
		this.sSex = sSex;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	public void showInfo(){
		System.out.println("ѧ�ţ�"+getsId()+"��������"+getsName()+"���Ա�"+getsSex()+"�����䣺"+getsAge());
	}
	//��дequals����
	public boolean equals(Object obj){
		if(obj==null||obj instanceof List_Student){return false;}
		List_Student stu=(List_Student)obj;
		return this.sName.equals(stu.getsName())
				&&this.sId.equals(stu.getsId())
				&&this.sSex.equals(stu.getsSex())
				&&this.sAge==stu.sAge;
	}
	//��дhashCode����
	public int hashCode(){
		return this.sName==null?0:this.sName.hashCode()+this.sAge;
	}
	
	

}
