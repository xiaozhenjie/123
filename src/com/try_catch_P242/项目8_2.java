package com.try_catch_P242;

public class 项目8_2 {

	public static void main(String[] args) {
		try{
			Exception e = new Exception("Exception异常");
			throw e;
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			System.out.println("程序结束");
		}

	}

}
