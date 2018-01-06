package com.项目1租车系统;

public abstract class Car {
	protected String name;
	protected int money;
	Car(String name,int money){
		this.name=name;
		this.money=money;
	}
	public String getName(){
		return name;
	}
	public int getMoney(){
		return money;
	}
	public abstract void printInfo();
}
