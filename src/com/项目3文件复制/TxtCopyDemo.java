package com.��Ŀ3�ļ�����;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TxtCopyDemo {

	public static void main(String[] args) {
		FileWriter fw;
		FileReader fr;
		try {
			
			fw = new FileWriter("C:\\Users\\47863\\Desktop\\�½��ı��ĵ� (123412).txt");
			fr = new FileReader("C:\\Users\\47863\\Desktop\\�½��ı��ĵ�.txt");
			int ch = 0;
			while((ch=fr.read())!=-1){
				fw.write(ch);
			}
			fr.close();
			fw.close();
			
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		

	}

}
