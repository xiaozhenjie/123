package Extends_Demo;

import java.util.Scanner;

public class Car {
	//速度 挡位 颜色 
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
			System.out.println("挡位只能是0-5挡，请重新设置挡位:");
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
			System.out.println(color+"的汽车，挂"+gear+"档停靠在马路边");
		}else{
			System.out.println(color+"的汽车，挂"+gear+"档，以"+v+"km/h的速度在行驶");
		}
		
	}
	
}
