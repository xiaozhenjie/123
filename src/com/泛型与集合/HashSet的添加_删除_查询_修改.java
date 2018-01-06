package com.泛型与集合;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet的添加_删除_查询_修改 {
	private Set<Set_Student> stuHashSet=new HashSet<Set_Student>();
	//添加
	public boolean add(Set_Student stu){
		return stuHashSet.add(stu);
	}
	//显示所有学生信息
	public void findAll(){
		//获得集合迭代器
		Iterator<Set_Student> it=stuHashSet.iterator();
		System.out.println("共有"+stuHashSet.size()+"个学生");
		while(it.hasNext()){
			Set_Student stu=it.next();
			stu.speak();
		}
	}
	//根据姓名查询学生信息
	public void findByName(String name){
		//获得集合迭代器
		Iterator<Set_Student> it=stuHashSet.iterator();
		while(it.hasNext()){
			Set_Student stu=it.next();
			if(name.equals(stu.getName())){
				stu.speak();
				break;
			}
		}
	}
	//删除指定学生姓名的信息
	public void deleteByName(String name){
		//获得迭代器
		Iterator<Set_Student> it=stuHashSet.iterator();
		while(it.hasNext()){
			Set_Student stu=it.next();
			if(name.equals(stu.getName())){
				stuHashSet.remove(stu);
				break;
			}
		}
	}
	//修改指定学生姓名的信息
	public void changeByName(String name,String sex,int age,float grade){
		//获得迭代器
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
	//初始化5个同学并储存在集合中
	public void init(){
		for(int i=1;i<=5;i++){
			stuHashSet.add(new Set_Student("张三"+i+"号",i%2==0?"男":"女",18+i,60+2*i));
		}
	}
	
	public static void main(String[] args) {
		HashSet的添加_删除_查询_修改 exam=new HashSet的添加_删除_查询_修改();
		exam.init();
		System.out.println("**************所有学生信息**************");
		exam.findAll();
		System.out.println("**************姓名为张三2号的信息***************");
		exam.findByName("张三2号");
		System.out.println("**************修改张三3号的信息****************");
		exam.changeByName("张三3号", "不男不女", 100, 13);
		exam.findAll();
		System.out.println("***************删除张三1号的信息***************");
		exam.deleteByName("张三1号");
		exam.findAll();
	}

}
