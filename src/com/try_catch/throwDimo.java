package com.try_catch;

public class throwDimo {

	public static void main(String[] args) {
		try{
			System.out.print("�׳�һ�������쳣��");
			throw new ArithmeticException();
		}catch(ArithmeticException ae){
			System.out.println(ae);//�쳣�Ķ���ae �������׳��쳣ArithmeticException
		}
		try{
			System.out.print("�׳�һ�������±�Խ���쳣��");
			throw new ArrayIndexOutOfBoundsException();
		}catch(ArrayIndexOutOfBoundsException ai){
			System.out.println(ai);//�쳣����ai �������׳��쳣ArrayIndexOutOfBoundsException
		}
		try{
			System.out.print("�׳�һ���ַ������±�Խ���쳣��");
			throw new StringIndexOutOfBoundsException();
		}catch(StringIndexOutOfBoundsException si){
			System.out.println(si);//�쳣����si �� �����׳��쳣StringIndexOutOfBoundsException
		}
	}

}
