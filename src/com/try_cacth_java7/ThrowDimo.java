package com.try_cacth_java7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//java7:1):��ǿ��throws
public class ThrowDimo {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			new FileOutputStream("");
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			throw e;
		}

	}

}
