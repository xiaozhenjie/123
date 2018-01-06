package com.�����뼯��;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet�����_ɾ��_��ѯ_�޸� {
	private Set<Set_Student> stuHashSet=new HashSet<Set_Student>();
	//���
	public boolean add(Set_Student stu){
		return stuHashSet.add(stu);
	}
	//��ʾ����ѧ����Ϣ
	public void findAll(){
		//��ü��ϵ�����
		Iterator<Set_Student> it=stuHashSet.iterator();
		System.out.println("����"+stuHashSet.size()+"��ѧ��");
		while(it.hasNext()){
			Set_Student stu=it.next();
			stu.speak();
		}
	}
	//����������ѯѧ����Ϣ
	public void findByName(String name){
		//��ü��ϵ�����
		Iterator<Set_Student> it=stuHashSet.iterator();
		while(it.hasNext()){
			Set_Student stu=it.next();
			if(name.equals(stu.getName())){
				stu.speak();
				break;
			}
		}
	}
	//ɾ��ָ��ѧ����������Ϣ
	public void deleteByName(String name){
		//��õ�����
		Iterator<Set_Student> it=stuHashSet.iterator();
		while(it.hasNext()){
			Set_Student stu=it.next();
			if(name.equals(stu.getName())){
				stuHashSet.remove(stu);
				break;
			}
		}
	}
	//�޸�ָ��ѧ����������Ϣ
	public void changeByName(String name,String sex,int age,float grade){
		//��õ�����
		Iterator<Set_Student> it=stuHashSet.iterator();
		while(it.hasNext()){
			Set_Student stu=it.next();
			if(name.equals(stu.getName())){
				stu.setSex(sex);
				stu.setAge(age);
				stu.setGrade(grade);
				stu.speak();
				break;
			}
		}
	}
	//��ʼ��5��ͬѧ�������ڼ�����
	public void init(){
		for(int i=1;i<=5;i++){
			stuHashSet.add(new Set_Student("����"+i+"��",i%2==0?"��":"Ů",18+i,60+2*i));
		}
	}
	
	public static void main(String[] args) {
		HashSet�����_ɾ��_��ѯ_�޸� exam=new HashSet�����_ɾ��_��ѯ_�޸�();
		exam.init();
		System.out.println("**************����ѧ����Ϣ**************");
		exam.findAll();
		System.out.println("**************����Ϊ����2�ŵ���Ϣ***************");
		exam.findByName("����2��");
		System.out.println("**************�޸�����3�ŵ���Ϣ****************");
		exam.changeByName("����3��", "���в�Ů", 100, 13);
		exam.findAll();
		System.out.println("***************ɾ������1�ŵ���Ϣ***************");
		exam.deleteByName("����1��");
		exam.findAll();
	}

}
