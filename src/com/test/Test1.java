package com.test;

public class Test1 {

	public static void main(String[] args) {
		Student[] s = { new Student("2016001","����","��",19,59),
						new Student("2016002","����","��",18,98),
						new Student("2016003","����","��",17,85),
						new Student("2016004","����","Ů",18,78),
						new Student("2016005","����","Ů",18,97)};
		int max=0,min=100,sum=0,ave;
		for(Student x:s){
			if(x.getsJava()>max){
				max=x.getsJava();
			}
			if(x.getsJava()<min){
				min=x.getsJava();
			}
			sum+=x.getsJava();
			System.out.println("ѧ����ţ�"+x.getsNo()+"��ѧ��������"+x.getsName()+"��ѧ���Ա�"+x.getsSex()+"�����䣺"+x.getsAge()+"��java�ɼ���"+x.getsJava());
		}
		ave=sum/s.length;
		System.out.println("����ѧ����"+s.length+" \t ƽ���ɼ���"+ave);
		System.out.println("��ͷ�Ϊ��"+min+"\t��߷�Ϊ��"+max);
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
