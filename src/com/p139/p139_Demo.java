package com.p139;

public class p139_Demo {

	public static void main(String[] args) {
		StudentEx stu1 = new StudentEx();
		stu1.setID("320811111111111111111");
		stu1.setName("����");
		stu1.setSex("��");
		stu1.setAddress("�Ž���");
		stu1.setStuID("111111");
		stu1.setClassName("�����");
		stu1.setMath(93.5f);
		stu1.setEnglish(90f);
		stu1.setpTraining(84.5f);
		stu1.setJava(88.2f);
		StudentEx stu2 = new StudentEx("111111111111111111111","����","Ů","������","22222","�����1",70.8f,45.6f,43.8f,90.2f);
		if(stu1.getJava()>stu2.getJava()){
			stu1.printPerInfo();
			stu1.printStuInfo();
			stu2.printPerInfo();
			stu2.printStuInfo();
		}else{
			stu2.printPerInfo();
			stu2.printStuInfo();
			stu1.printPerInfo();
			stu1.printStuInfo();
		}
	}

}
