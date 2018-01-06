package com.try_catch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P237照猫画虎 {

	public static void main(String[] args) {
		
		int i=0;
		try{
			BufferedReader buf = null;//接收键盘的输入数据
			buf = new BufferedReader(new InputStreamReader(System.in));
			String str = null;//准备接收数据
			System.out.println("请输入一个数");
			str=buf.readLine();
			int[] x = new int[Integer.parseInt(str)];
			while(i<=3){
				System.out.println(x[i]);
				i++;
			}
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("出现数组下标越界异常");
		} catch(NumberFormatException e) {
			System.out.println("出先数值格式异常");
		}catch (NegativeArraySizeException e){
			System.out.println("数组下标不能为负数");
		} catch (IOException e) {
			System.out.println("出现异常");
			e.printStackTrace();
		}finally{
			System.out.println("程序结束");
		}

	}

}
