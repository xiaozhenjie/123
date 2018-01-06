package com.try_cacth_java7;

import java.io.IOException;

/**
 * 1：异常只能用于非正常情况。try-cacth的存在也会影响性能
 * 2：需要为异常提供说明文档，比如java.doc，如果自定义了异常或某一个方法抛出了异常，我们应该记录在文档注释中。
 * 
 * 3：尽可能避免异常：					 String str = null;
 * 	如NullPointerException			 if(str != null){
 * 										 System.out.println(str);
 * 									 }
 * 
 * 4：异常的粒度很重要，应该为一个基本操作定义一个try-cacth块，不要为了便捷，将几百行代码放到一个try-cacth块中
 * 5：不建议在循环中进行异常处理，应该在循环外对异常进行捕获处理（在循环之外使用try-cacth）
 * 6：自定义异常类尽量使用RuntimeException类型的
 * @author 47863
 *
 */
public class 处理异常的原则 {

	public static void main(String[] args) {
		try {
			doWork("");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	/**
	 * 描述方法的功能
	 * @param name 该参数干嘛的
	 * @return 返回的是什么
	 * @throws IOException 如果怎么怎么，抛出异常
	 */
	private static int doWork(String name) throws IOException{
		return 0;
	}
}

