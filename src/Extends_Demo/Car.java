package Extends_Demo;

import java.util.Scanner;

public class Car {
	//�ٶ� ��λ ��ɫ 
	private float v;
	private int gear = 0;
	private String color;
	private Scanner sc = new Scanner(System.in);
	public Car(){
	}
	public Car(String color){
		this.color=color;
	}
	public Car(int gear,String color){
		this.gear=gear;
		this.color=color;
	}
	
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		if(gear>=0&&gear<6){
			this.gear = gear;
			setV();
		}else{
			System.out.println("��λֻ����0-5�������������õ�λ:");
			setGear(sc.nextInt());
		}
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getV() {
		return v;
	}
	public void setV() {
		v = 10*gear*gear;
	}
	public void printInfo(){
		if(gear==0){
			System.out.println(color+"����������"+gear+"��ͣ������·��");
		}else{
			System.out.println(color+"����������"+gear+"������"+v+"km/h���ٶ�����ʻ");
		}
		
	}
	
}
