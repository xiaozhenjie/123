package com.�����뼯��;

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
	//���༶�����ѧ����Ϣ
	public void add(List_Student stu){
		stuList.add(stu);//�ڼ��ϵ�β�����
	}
	/**
	 * ����༶������ѧ������Ϣ��ArrayList����Ԫ�صı��������кܶ࣬�����г������֡�
	 * ���ֻ�����Ԫ�أ����Բ�����ǿ��For��For Each�����
	 * ����ڱ�����������Ҫ�޸�Ԫ�����ݣ������˫�����������ʹ��ListIterator
	 */
	public void findAll(){
		//(1)������ǿ��ѭ��
		for(List_Student stu:stuList){
			stu.showInfo();
		}
//		//(2)����Forѭ��
//		for(int i=0;i<stuList.size();i++){
//			List_Student stu=stuList.get(i);
//			stu.showInfo();
//		}
//		//(3)����Iterator�ӿ�
//		Iterator<List_Student> it=stuList.iterator();
//		while(it.hasNext()){
//			List_Student stu=it.next();
//			stu.showInfo();
//		}
//		//(4)����ListIterator�ӿ�
//		ListIterator<List_Student> lit=stuList.listIterator();
//		while(lit.hasNext()){
//			List_Student stu=lit.next();
//			stu.showInfo();
//		}
	}
}
