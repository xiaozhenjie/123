package com.test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Subject s1 = new Subject("慧老师","安卓1604");
		s1.setcDidian("实训楼518");
		s1.setcDate("周一三四节，周五五六节");
		s1.showInfo();
		
		System.out.println();
		
		Subject s2 = new Subject();
		s2.setcNo("123123123");
		s2.setcTime(400);
		s2.setcTeacher("曹老师");
		s2.setcClass("安卓1603");
		s2.setcDidian("实训楼517");
		s2.setcDate("周二一二节，周三三四节");
		s2.showInfo();
	}

}
class Subject{
	private String cName;//课程名
	private String cNo;//课程编号
	private int cTime;//课程课时
	private String cTeacher;//老师名
	private String cClass;//班级
	private String cDidian;//上课地点
	private String cDate;//上课时间
	Scanner sc=new Scanner(System.in);
	public Subject(){
		cName = "Java程序设计基础";
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
			System.out.println("输入课程编号有误（6位），请重新输入：");
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
			System.out.println("输入课时有误（大于等于30，小于等于200），请重新输入：");
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
		System.out.println("课程的名称："+getcName());
		System.out.println("课程的编码："+getcNo());
		System.out.println("课程的课时："+getcTime());
		System.out.println("课程的老师："+getcTeacher());
		System.out.println("课程的班级："+getcClass());
		System.out.println("课程的上课地点："+getcDidian());
		System.out.println("课程的上课时间："+getcDate());
	}
}