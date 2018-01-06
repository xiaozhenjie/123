package com.泛型与集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Classes {
	private String cId;
	private String cName;
	private List<List_Student> stuList=new ArrayList<List_Student>();
	public List_Classes(){}
	public List_Classes(String cId,String cName){
		this.cId=cId;
		this.cName=cName;
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public List<List_Student> getStuList() {
		return stuList;
	}
	public void setStuList(List<List_Student> stuList) {
		this.stuList = stuList;
	}
	//往班级中添加学生信息
	public void add(List_Student stu){
		stuList.add(stu);//在集合的尾部添加
	}
	/**
	 * 输出班级中所有学生的信息。ArrayList集合元素的遍历方法有很多，下面列出了四种。
	 * 如果只是输出元素，可以采用增强型For（For Each）语句
	 * 如果在遍历过程中需要修改元素内容，或进行双向遍历，可以使用ListIterator
	 */
	public void findAll(){
		//(1)采用增强型循环
		for(List_Student stu:stuList){
			stu.showInfo();
		}
//		//(2)采用For循环
//		for(int i=0;i<stuList.size();i++){
//			List_Student stu=stuList.get(i);
//			stu.showInfo();
//		}
//		//(3)采用Iterator接口
//		Iterator<List_Student> it=stuList.iterator();
//		while(it.hasNext()){
//			List_Student stu=it.next();
//			stu.showInfo();
//		}
//		//(4)采用ListIterator接口
//		ListIterator<List_Student> lit=stuList.listIterator();
//		while(lit.hasNext()){
//			List_Student stu=lit.next();
//			stu.showInfo();
//		}
	}
}
