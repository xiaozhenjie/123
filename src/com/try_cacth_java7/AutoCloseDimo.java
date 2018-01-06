package com.try_cacth_java7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.annotation.processing.FilerException;

public class AutoCloseDimo {

	public static void main(String[] args) {
		test1();
		test2();

	}
	/*
	 * java7之前的手动关闭资源
	 */
	private static void test2() {
		OutputStream out = null;
		try{
			//打开一个资源对象
			out = new FileOutputStream("");
			//操作资源对象
			out.write(1);
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			//关闭资源
			try {
				if(out != null){
					out.close();
				}
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
	}
	//java7之后的自动关闭资源
	private static void test1() {
		try(//实现接口AutoCloseable
			OutputStream out = new FileOutputStream("");
			ABC x = new ABC();){
			//可能出现异常的代码
			out.write(1);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
//必须实现AutoCloseable
class ABC implements AutoCloseable{

	@Override
	public void close() throws Exception {
		// TODO 自动生成的方法存根
		
	}
	
}