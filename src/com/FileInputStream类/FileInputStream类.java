package com.FileInputStream��;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStream�� {

	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("C:\\Users\\47863\\Desktop\\�½��ı��ĵ�.txt");
			int ch3;
			while((ch3=in.read())!=-1){
				System.out.print((char)ch3);

			}
			
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}

}
