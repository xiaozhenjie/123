package com.test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Subject s1 = new Subject("����ʦ","��׿1604");
		s1.setcDidian("ʵѵ¥518");
		s1.setcDate("��һ���Ľڣ�����������");
		s1.showInfo();
		
		System.out.println();
		
		Subject s2 = new Subject();
		s2.setcNo("123123123");
		s2.setcTime(400);
		s2.setcTeacher("����ʦ");
		s2.setcClass("��׿1603");
		s2.setcDidian("ʵѵ¥517");
		s2.setcDate("�ܶ�һ���ڣ��������Ľ�");
		s2.showInfo();
	}

}
class Subject{
	private String cName;//�γ���
	private String cNo;//�γ̱��
	private int cTime;//�γ̿�ʱ
	private String cTeacher;//��ʦ��
	private String cClass;//�༶
	private String cDidian;//�Ͽεص�
	private String cDate;//�Ͽ�ʱ��
	Scanner sc=new Scanner(System.in);
	public Subject(){
		cName = "Java������ƻ���";
		cNo = "905991";
		cTime = 160;
	}
	public Subject(String cTeacher,String cClass){
		this();
		this.cTeacher=cTeacher;
		this.cClass=cClass;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcNo() {
		return cNo;
	}
	public void setcNo(String cNo) {
		if(cNo.length()==6){
			this.cNo = cNo;
		}else{
			System.out.println("����γ̱������6λ�������������룺");
			setcNo(sc.nextLine());
		}
	}
	public int getcTime() {
		return cTime;
	}
	public void setcTime(int cTime) {
		if(cTime>=30&&cTime<=200){
			this.cTime = cTime;
		}else{
			System.out.println("�����ʱ���󣨴��ڵ���30��С�ڵ���200�������������룺");
			setcTime(sc.nextInt());
		}
	}
	public String getcTeacher() {
		return cTeacher;
	}
	public void setcTeacher(String cTeacher) {
		this.cTeacher = cTeacher;
	}
	public String getcClass() {
		return cClass;
	}
	public void setcClass(String cClass) {
		this.cClass = cClass;
	}
	public String getcDidian() {
		return cDidian;
	}
	public void setcDidian(String cDidian) {
		this.cDidian = cDidian;
	}
	public String getcDate() {
		return cDate;
	}
	public void setcDate(String cDate) {
		this.cDate = cDate;
	}
	public void showInfo(){
		System.out.println("�γ̵����ƣ�"+getcName());
		System.out.println("�γ̵ı��룺"+getcNo());
		System.out.println("�γ̵Ŀ�ʱ��"+getcTime());
		System.out.println("�γ̵���ʦ��"+getcTeacher());
		System.out.println("�γ̵İ༶��"+getcClass());
		System.out.println("�γ̵��Ͽεص㣺"+getcDidian());
		System.out.println("�γ̵��Ͽ�ʱ�䣺"+getcDate());
	}
}