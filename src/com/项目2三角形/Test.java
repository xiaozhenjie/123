package com.项目2三角形;

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
	//是否构成三角形
	public boolean isTriangle(){
		return (2*max()-a-b-c)<0&&a>0&&b>0&&c>0?true:false;
	}
	public int max(){
		return Math.max(a,Math.max(b,c));
	}
	//等边三角形
	public boolean isEquilateral(){
		return a==b&&a==c?true:false;
	}
	//等腰三角形
	public boolean isIsosceles(){
		return a==b||a==c||b==c?true:false;
	}
	//直角三角形
	public boolean isRight(){
		int[] t={this.a,this.b,this.c};
		Arrays.sort(t);
		return Math.pow(t[0],2)+Math.pow(t[1], 2)==Math.pow(t[2], 2)?true:false;
	}
	public void show(){
		if(isTriangle()){
			if(isEquilateral()){
				System.out.println("等边三角形");
			}else if(isIsosceles()){
				System.out.println("等腰三角形");
			}else if(isRight()){
				System.out.println("直角三角形");
			}else{
				System.out.println("普通三角形");
			}
		}else{
			System.out.println("不能构成三角形");
		}
	}
}
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入三角形的三条边：");
		Triangle t=new Triangle(sc.nextInt(),sc.nextInt(),sc.nextInt());
		t.show();
	}

}
