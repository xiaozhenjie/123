package com.�����뼯��;

public class ListDome {

	public static void main(String[] args) {
		List_Classes classes=new List_Classes("2016AZ4","��׿1604");
		List_Student[] stu={
				new List_Student("20160609","����","Ů",20),
				new List_Student("20160269","����","Ů",21),
				new List_Student("20161629","����","��",22),
				new List_Student("20162313","����","Ů",23),
				new List_Student("20161412","����","��",24)};
		for(List_Student x:stu){
			classes.add(x);
		}
		System.out.println("*********************ѧ����Ϣ********************");
		classes.findAll();
		//��ʾ�༶�����ڵ�4��λ���ϵ�ѧ����Ϣ��������Ϊ3��
		List_Student stu1=classes.getStuList().get(3);
		System.out.println("*************��ʾ�༶�����ڵ�4��λ���ϵ�ѧ����Ϣ��������Ϊ3��**********");
		stu1.showInfo();
		//ɾ���༶�е��ĸ�λ�õ�ѧ����������Ϊ3��
		classes.getStuList().remove(3);
		System.out.println("*********************ѧ����Ϣ********************");
		classes.findAll();
		//�޸İ༶�����ڵڶ���λ���ϵ�ѧ��������Ϊ���
		List_Student stu2=classes.getStuList().get(1);
		stu2.setsName("���");
		System.out.println("*********************ѧ����Ϣ********************");
		classes.findAll();
		//������Ϊ2��λ�ò���һ��ѧ��
		List_Student stu3=new List_Student("11111111","����","δ֪",18);
		classes.getStuList().add(2,stu3);
		System.out.println("*********************ѧ����Ϣ********************");
		classes.findAll();
		//�滻����Ϊ2��ѧ��
		List_Student stu4=new List_Student("22222222","�滻","δ֪",17);
		classes.getStuList().set(2, stu4);
		System.out.println("*********************ѧ����Ϣ********************");
		classes.findAll();
	}

}
