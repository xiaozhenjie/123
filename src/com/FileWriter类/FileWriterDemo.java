package com.FileWriter¿‡;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	public static void main(String[] args) throws IOException {
		
			FileWriter fw = new FileWriter("C:\\Users\\47863\\Desktop\\1.txt");
			
			fw.write(67);
			
			fw.flush();
			fw.close();
		
	}

}
