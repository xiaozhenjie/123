package com.����;
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
		student[0]=new Student(2017022801,"С��");
		student[1]=new Student(2017022802,"С��");
		student[2]=new Student(2017022803,"С��");
		student[3]=new Student(2017022804,"С��");
	}
	void printArrayElement(){
		int j=1;
		for(int i=0;i<student.length;i++){
			System.out.println("��"+j+"��ѧ����ѧ���ǣ�"+student[i].no+"�������ǣ�"+student[i].name);
			j++;
		}
	}
	public static void main(String[] args) {
		ObjectArrayDemo ad=new ObjectArrayDemo();
		ad.printArrayElement();

	}

}
