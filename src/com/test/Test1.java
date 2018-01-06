package com.test;

public class Test1 {

	public static void main(String[] args) {
		Student[] s = { new Student("2016001","张三","男",19,59),
						new Student("2016002","李四","男",18,98),
						new Student("2016003","王五","男",17,85),
						new Student("2016004","赵六","女",18,78),
						new Student("2016005","田七","女",18,97)};
		int max=0,min=100,sum=0,ave;
		for(Student x:s){
			if(x.getsJava()>max){
				max=x.getsJava();
			}
			if(x.getsJava()<min){
				min=x.getsJava();
			}
			sum+=x.getsJava();
			System.out.println("学生编号："+x.getsNo()+"，学生姓名："+x.getsName()+"，学生性别："+x.getsSex()+"，年龄："+x.getsAge()+"，java成绩："+x.getsJava());
		}
		ave=sum/s.length;
		System.out.println("共有学生："+s.length+" \t 平均成绩："+ave);
		System.out.println("最低分为："+min+"\t最高分为："+max);
	}

}
class Student{
	private String sNo;
	private String sName;
	private String sSex;
	private int sAge;
	private int sJava;
	
	public Student(String sNo,String sName,String sSex,int sAge,int sJava){
		this.sNo=sNo;
		this.sName=sName;
		this.sSex=sSex;
		this.sAge=sAge;
		this.sJava=sJava;
	}

	public String getsNo() {
		return sNo;
	}

	public String getsName() {
		return sName;
	}

	public String getsSex() {
		return sSex;
	}

	public int getsAge() {
		return sAge;
	}

	public int getsJava() {
		return sJava;
	}
}
