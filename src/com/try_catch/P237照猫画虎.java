package com.try_catch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P237��è���� {

	public static void main(String[] args) {
		
		int i=0;
		try{
			BufferedReader buf = null;//���ռ��̵���������
			buf = new BufferedReader(new InputStreamReader(System.in));
			String str = null;//׼����������
			System.out.println("������һ����");
			str=buf.readLine();
			int[] x = new int[Integer.parseInt(str)];
			while(i<=3){
				System.out.println(x[i]);
				i++;
			}
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("���������±�Խ���쳣");
		} catch(NumberFormatException e) {
			System.out.println("������ֵ��ʽ�쳣");
		}catch (NegativeArraySizeException e){
			System.out.println("�����±겻��Ϊ����");
		} catch (IOException e) {
			System.out.println("�����쳣");
			e.printStackTrace();
		}finally{
			System.out.println("�������");
		}

	}

}
