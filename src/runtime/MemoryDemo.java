package runtime;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class MemoryDemo {

	public static void main(String[] args) {
		Runtime rObj=Runtime.getRuntime();//��ȡ��ǰRuntime����ʱ���������
		long num1,num2;
		Integer[] someints=new Integer[1000];
		System.out.println("�ڴ�������"+rObj.totalMemory());
		num1=rObj.freeMemory();//���ؿ����ڴ�������ֵ��num1
		System.out.println("�����ڴ棺"+num1);
		rObj.gc();//������������������δ�ö���
		num1=rObj.freeMemory();
		System.out.println("����������������Ŀ����ڴ棺"+num1);
		//�����鳤��Ϊ1000�������������洢�ռ�
		for(int i=0;i<someints.length;i++){
			someints[i]=new Integer(i);
		}
		num2=rObj.freeMemory();
		//������������洢�ռ����ڴ���пռ�
		System.out.println("���������洢�ռ����ڴ�ռ䣺"+num2);
		//���ռ�õ��ڴ�ռ�
		System.out.println("ռ�����ڴ�ռ䣺"+(num1-num2));
		for(int i=0;i<someints.length;i++){
			someints[i]=null;//���������洢�ռ�Ϊ��
		}
		rObj.gc();
		num2=rObj.freeMemory();
		System.out.println("����������Ŀ����ڴ棺"+num2);

		}

}
