package com.try_catch;

public class ����catch {

	public static void main(String[] args) {
		System.out.println("begin......");
		String sNum1 = "10";
		String sNum2 = "2B";
		try{
			int num1 = Integer.parseInt(sNum1);
			int num2 = Integer.parseInt(sNum2);
			System.out.println("-----------------");
			int ret = num1 / num2;
			System.out.println("���Ϊ��"+ret);
			
		}catch(ArithmeticException e){
			System.out.println("����Ϊ0");
		}catch(NumberFormatException e){
			System.out.println("����ת���쳣");
		}catch(Exception e){
			System.out.println("�����������쳣");
		}
		System.out.println("end................");
	}

}
