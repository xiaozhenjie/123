package com.super123;

public class Animal {
	private String name;
	Animal(){
		System.out.println("调用了Animal的无参构造方法");
	}
	Animal(String name){
		this.name=name;
	}
}
