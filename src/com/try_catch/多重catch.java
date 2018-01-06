package com.try_catch;

public class 多重catch {

	public static void main(String[] args) {
		System.out.println("begin......");
		String sNum1 = "10";
		String sNum2 = "2B";
		try{
			int num1 = Integer.parseInt(sNum1);
			int num2 = Integer.parseInt(sNum2);
			System.out.println("-----------------");
			int ret = num1 / num2;
			System.out.println("结果为："+ret);
			
		}catch(ArithmeticException e){
			System.out.println("除数为0");
		}catch(NumberFormatException e){
			System.out.println("类型转换异常");
		}catch(Exception e){
			System.out.println("不属于上述异常");
		}
		System.out.println("end................");
	}

}
