package com.FileInputStream类;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStream类 {

	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("C:\\Users\\47863\\Desktop\\新建文本文档.txt");
			int ch3;
			while((ch3=in.read())!=-1){
				System.out.print((char)ch3);

			}
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

}
