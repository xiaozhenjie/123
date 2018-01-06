package com.FileReader¿‡;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException  {
		FileReader fr = new FileReader("C:\\Users\\47863\\Desktop\\1.txt");

		int ch3=0;
		int i=1;
		while((ch3=fr.read())!=-1){
			System.out.print((char)ch3);
			System.out.print(i);
			++i;
		}
		fr.close();
		
	}

}
