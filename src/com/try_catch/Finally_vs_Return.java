package com.try_catch;

public class Finally_vs_Return {

	public static void main(String[] args) {
		System.out.println(ins());
		System.out.println(ins1());
	}
	public static int ins(){
		int i = 10;
		try{
			return i;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			return ++i;
		}
	}
	public static int ins1(){
		int i = 10;
		try{
			return i;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			++i;
		}
		return -1;
		
	}
}
