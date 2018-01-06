package com.��Ŀ2������;

import java.util.Arrays;
import java.util.Scanner;

class Triangle{
	private int a;
	private int b;
	private int c;
	Triangle(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	//�Ƿ񹹳�������
	public boolean isTriangle(){
		return (2*max()-a-b-c)<0&&a>0&&b>0&&c>0?true:false;
	}
	public int max(){
		return Math.max(a,Math.max(b,c));
	}
	//�ȱ�������
	public boolean isEquilateral(){
		return a==b&&a==c?true:false;
	}
	//����������
	public boolean isIsosceles(){
		return a==b||a==c||b==c?true:false;
	}
	//ֱ��������
	public boolean isRight(){
		int[] t={this.a,this.b,this.c};
		Arrays.sort(t);
		return Math.pow(t[0],2)+Math.pow(t[1], 2)==Math.pow(t[2], 2)?true:false;
	}
	public void show(){
		if(isTriangle()){
			if(isEquilateral()){
				System.out.println("�ȱ�������");
			}else if(isIsosceles()){
				System.out.println("����������");
			}else if(isRight()){
				System.out.println("ֱ��������");
			}else{
				System.out.println("��ͨ������");
			}
		}else{
			System.out.println("���ܹ���������");
		}
	}
}
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�����������ε������ߣ�");
		Triangle t=new Triangle(sc.nextInt(),sc.nextInt(),sc.nextInt());
		t.show();
	}

}
