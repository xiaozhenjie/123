package com.try_cacth_java7;

import java.io.IOException;

/**
 * 1���쳣ֻ�����ڷ����������try-cacth�Ĵ���Ҳ��Ӱ������
 * 2����ҪΪ�쳣�ṩ˵���ĵ�������java.doc������Զ������쳣��ĳһ�������׳����쳣������Ӧ�ü�¼���ĵ�ע���С�
 * 
 * 3�������ܱ����쳣��					 String str = null;
 * 	��NullPointerException			 if(str != null){
 * 										 System.out.println(str);
 * 									 }
 * 
 * 4���쳣�����Ⱥ���Ҫ��Ӧ��Ϊһ��������������һ��try-cacth�飬��ҪΪ�˱�ݣ��������д���ŵ�һ��try-cacth����
 * 5����������ѭ���н����쳣����Ӧ����ѭ������쳣���в�������ѭ��֮��ʹ��try-cacth��
 * 6���Զ����쳣�ྡ��ʹ��RuntimeException���͵�
 * @author 47863
 *
 */
public class �����쳣��ԭ�� {

	public static void main(String[] args) {
		try {
			doWork("");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	/**
	 * ���������Ĺ���
	 * @param name �ò��������
	 * @return ���ص���ʲô
	 * @throws IOException �����ô��ô���׳��쳣
	 */
	private static int doWork(String name) throws IOException{
		return 0;
	}
}

