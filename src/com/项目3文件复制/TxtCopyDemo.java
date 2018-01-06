package com.项目3文件复制;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TxtCopyDemo {

	public static void main(String[] args) {
		FileWriter fw;
		FileReader fr;
		try {
			
			fw = new FileWriter("C:\\Users\\47863\\Desktop\\新建文本文档 (123412).txt");
			fr = new FileReader("C:\\Users\\47863\\Desktop\\新建文本文档.txt");
			int ch = 0;
			while((ch=fr.read())!=-1){
				fw.write(ch);
			}
			fr.close();
			fw.close();
			
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		

	}

}
