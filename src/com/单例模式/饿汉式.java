package com.����ģʽ;
class ArrayUtil{
	//1):������һ��˽�еľ�̬�Ĳ��ɱ�Ķ���
	private static final ArrayUtil instance = new ArrayUtil();
	//2):˽�л�������
	private ArrayUtil(){}
	//3):���Ⱪ¶һ�������ľ�̬�������ڻ�ȡ����Ķ���
	public static ArrayUtil getInstans(){
		return instance;
	}
	public void sort(int[] arr){
		System.out.println("�������");
	}
}
public class ����ʽ {

	public static void main(String[] args) {
		//��Ҫ�����򣬲�ͬ������
		ArrayUtil.getInstans().sort(null);
		//��Ҫ�����򣬲�ͬ������
		ArrayUtil.getInstans().sort(null);
		//��Ҫ�����򣬲�ͬ������
		ArrayUtil.getInstans().sort(null);
		//��Ҫ�����򣬲�ͬ������
		ArrayUtil.getInstans().sort(null);
	}

}
