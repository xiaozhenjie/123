package com.try_catch_P242;

public class ��Ŀ8_2 {

	public static void main(String[] args) {
		try{
			Exception e = new Exception("Exception�쳣");
			throw e;
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			System.out.println("�������");
		}

	}

}
