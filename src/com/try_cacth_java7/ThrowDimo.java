package com.try_cacth_java7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//java7:1):增强的throws
public class ThrowDimo {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			new FileOutputStream("");
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			throw e;
		}

	}

}
