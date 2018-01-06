package com.数组;
class Student{
	int no;
	String name;
	public Student(int sno,String sname){
		no=sno;
		name=sname;
	}
}
public class ObjectArrayDemo {
	Student[] student=new Student[4];
	public ObjectArrayDemo(){
		student[0]=new Student(2017022801,"小刘");
		student[1]=new Student(2017022802,"小李");
		student[2]=new Student(2017022803,"小唐");
		student[3]=new Student(2017022804,"小何");
	}
	void printArrayElement(){
		int j=1;
		for(int i=0;i<student.length;i++){
			System.out.println("第"+j+"个学生的学号是："+student[i].no+"，姓名是："+student[i].name);
			j++;
		}
	}
	public static void main(String[] args) {
		ObjectArrayDemo ad=new ObjectArrayDemo();
		ad.printArrayElement();

	}

}
