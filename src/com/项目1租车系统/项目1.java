package com.��Ŀ1�⳵ϵͳ;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

public class ��Ŀ1 {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		char x;//�����ַ� 1 �� 0 �ж��Ƿ�ʼִ�г���
		int y;//����������������;
		int[] b=new int[6];//����⳵���к�;
		String str1="";//��ſ����˵ĳ���
		String str2="";//��ſ��ػ��ĳ���
		int moneys=0;//���Ǯ��
		int people=0;//����ܹ���������;
		int weight=0;//����ܹ����ػ���;
		int day;//����⳵����
		System.out.println("��ӭʹ�����⳵ϵͳ��\n���Ƿ�Ҫ�⳵ 1��  0��");
		x=(char)System.in.read();
		if(x=='1'){
			/**
			 * ��̬ ʵ��
			 * Car bc= new CarryPassengers("", 500, 2);
			 * bc = new PassengersAndCargo("Ƥ��ѩ6",450,4,2);
			 */
			Car[] a={new CarryPassengers("�µ�A4",500,4),new CarryPassengers("���Դ�6",400,4),new PassengersAndCargo("Ƥ��ѩ6",450,4,2),new CarryPassengers("����",800,20),new CarryCargo("�ɻ���",400,4),new CarryCargo("��ά��",1000,20)};
			System.out.println("�����⳵�����ͼ���Ŀ��");
			System.out.println("���\t��������\t��� \t ����");
			for(int i=0;i<a.length;i++){
				System.out.print((i+1)+"��\t");
				a[i].printInfo();
			}
			System.out.println("��������Ҫ��������������");
			y=sc.nextInt();
			while(y>b.length){
				System.out.println("�������㣬�����������鳵������");
				y=sc.nextInt();
			}
			for(int j=0;j<y;j++){
				System.out.println("�������"+(j+1)+"�����������");
				b[j]=sc.nextInt();
			}
			for(int j=0;j<y;j++){
				if( (a[b[j]-1] instanceof IPassengers)  &&  (a[b[j]-1] instanceof ICargo) ){
					PassengersAndCargo son=(PassengersAndCargo)(a[b[j]-1]);
					people+=son.getPassengers();//��������
					weight+=son.getCargo();//��������
					str1+=a[b[j]-1].getName()+"  ";//��ÿ����˳���
					str2+=a[b[j]-1].getName()+"  ";//��ÿ����ﳵ��
				}else if(a[b[j]-1] instanceof IPassengers){
					str1+=a[b[j]-1].getName()+"  ";//��ÿ����˳���
					CarryPassengers son=(CarryPassengers)(a[b[j]-1]);
					people+=son.getPassengers();//��������
				}else{
					str2+=a[b[j]-1].getName()+"  ";//��ÿ����ﳵ��
					CarryCargo son=(CarryCargo)(a[b[j]-1]);
					weight+=son.getCargo();//��������
				}
				moneys+=a[b[j]-1].getMoney();//�������г�һ����ܻ���
			}
			System.out.println("�������⳵������");
			day=sc.nextInt();//�����⳵����
			moneys*=day;
			System.out.println("***�����˵ĳ��У�");
			System.out.println(str1+"    �����ˣ�"+people+"��");
			System.out.println("***���ػ��ĳ��У�");
			System.out.println(str2+"    ���ػ���"+weight+"��");
			NumberFormat nf=NumberFormat.getCurrencyInstance();
			System.out.println("���軨�ѹ���"+nf.format(moneys));
		}else{
			System.out.println("�����˳�!");
			System.exit(0);
		}

	}

}
