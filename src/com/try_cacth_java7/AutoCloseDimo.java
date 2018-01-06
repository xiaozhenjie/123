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
	 * java7֮ǰ���ֶ��ر���Դ
	 */
	private static void test2() {
		OutputStream out = null;
		try{
			//��һ����Դ����
			out = new FileOutputStream("");
			//������Դ����
			out.write(1);
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			//�ر���Դ
			try {
				if(out != null){
					out.close();
				}
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		
	}
	//java7֮����Զ��ر���Դ
	private static void test1() {
		try(//ʵ�ֽӿ�AutoCloseable
			OutputStream out = new FileOutputStream("");
			ABC x = new ABC();){
			//���ܳ����쳣�Ĵ���
			out.write(1);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
//����ʵ��AutoCloseable
class ABC implements AutoCloseable{

	@Override
	public void close() throws Exception {
		// TODO �Զ����ɵķ������
		
	}
	
}