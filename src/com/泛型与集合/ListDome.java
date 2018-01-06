package com.泛型与集合;

public class ListDome {

	public static void main(String[] args) {
		List_Classes classes=new List_Classes("2016AZ4","安卓1604");
		List_Student[] stu={
				new List_Student("20160609","张三","女",20),
				new List_Student("20160269","李四","女",21),
				new List_Student("20161629","王五","男",22),
				new List_Student("20162313","找刘","女",23),
				new List_Student("20161412","老七","男",24)};
		for(List_Student x:stu){
			classes.add(x);
		}
		System.out.println("*********************学生信息********************");
		classes.findAll();
		//显示班级中排在第4个位置上的学生信息（即索引为3）
		List_Student stu1=classes.getStuList().get(3);
		System.out.println("*************显示班级中排在第4个位置上的学生信息（即索引为3）**********");
		stu1.showInfo();
		//删除班级中第四个位置的学生（即索引为3）
		classes.getStuList().remove(3);
		System.out.println("*********************学生信息********************");
		classes.findAll();
		//修改班级中排在第二个位置上的学生的姓名为杨八
		List_Student stu2=classes.getStuList().get(1);
		stu2.setsName("杨八");
		System.out.println("*********************学生信息********************");
		classes.findAll();
		//在索引为2的位置插入一个学生
		List_Student stu3=new List_Student("11111111","插入","未知",18);
		classes.getStuList().add(2,stu3);
		System.out.println("*********************学生信息********************");
		classes.findAll();
		//替换索引为2的学生
		List_Student stu4=new List_Student("22222222","替换","未知",17);
		classes.getStuList().set(2, stu4);
		System.out.println("*********************学生信息********************");
		classes.findAll();
	}

}
