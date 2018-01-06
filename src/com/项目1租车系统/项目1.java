package com.项目1租车系统;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

public class 项目1 {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		char x;//接收字符 1 或 0 判断是否开始执行程序
		int y;//接收组汽车的数量;
		int[] b=new int[6];//存放租车序列号;
		String str1="";//存放可载人的车名
		String str2="";//存放可载货的车名
		int moneys=0;//存放钱；
		int people=0;//存放总共可载人数;
		int weight=0;//存放总共可载货物;
		int day;//存放租车天数
		System.out.println("欢迎使用嗒嗒租车系统：\n您是否要租车 1是  0否");
		x=(char)System.in.read();
		if(x=='1'){
			/**
			 * 多态 实例
			 * Car bc= new CarryPassengers("", 500, 2);
			 * bc = new PassengersAndCargo("皮卡雪6",450,4,2);
			 */
			Car[] a={new CarryPassengers("奥迪A4",500,4),new CarryPassengers("马自达6",400,4),new PassengersAndCargo("皮卡雪6",450,4,2),new CarryPassengers("金龙",800,20),new CarryCargo("松花江",400,4),new CarryCargo("依维柯",1000,20)};
			System.out.println("您可租车的类型及价目表");
			System.out.println("序号\t汽车名称\t租金 \t 容量");
			for(int i=0;i<a.length;i++){
				System.out.print((i+1)+"、\t");
				a[i].printInfo();
			}
			System.out.println("请输入您要组汽车的数量：");
			y=sc.nextInt();
			while(y>b.length){
				System.out.println("车辆不足，请重新输入组车车辆数");
				y=sc.nextInt();
			}
			for(int j=0;j<y;j++){
				System.out.println("请输入第"+(j+1)+"辆汽车的序号");
				b[j]=sc.nextInt();
			}
			for(int j=0;j<y;j++){
				if( (a[b[j]-1] instanceof IPassengers)  &&  (a[b[j]-1] instanceof ICargo) ){
					PassengersAndCargo son=(PassengersAndCargo)(a[b[j]-1]);
					people+=son.getPassengers();//载人数量
					weight+=son.getCargo();//载物重量
					str1+=a[b[j]-1].getName()+"  ";//获得可载人车名
					str2+=a[b[j]-1].getName()+"  ";//获得可载物车名
				}else if(a[b[j]-1] instanceof IPassengers){
					str1+=a[b[j]-1].getName()+"  ";//获得可载人车名
					CarryPassengers son=(CarryPassengers)(a[b[j]-1]);
					people+=son.getPassengers();//载人数量
				}else{
					str2+=a[b[j]-1].getName()+"  ";//获得可载物车名
					CarryCargo son=(CarryCargo)(a[b[j]-1]);
					weight+=son.getCargo();//载物重量
				}
				moneys+=a[b[j]-1].getMoney();//计算所有车一天的总花费
			}
			System.out.println("请输入租车天数：");
			day=sc.nextInt();//接收租车天数
			moneys*=day;
			System.out.println("***可载人的车有：");
			System.out.println(str1+"    共载人："+people+"人");
			System.out.println("***可载货的车有：");
			System.out.println(str2+"    共载货："+weight+"吨");
			NumberFormat nf=NumberFormat.getCurrencyInstance();
			System.out.println("所需花费共："+nf.format(moneys));
		}else{
			System.out.println("程序退出!");
			System.exit(0);
		}

	}

}
