package p173;

public class P173 {

	public static void main(String[] args) {
		Teacherclass t1=new Teacherclass();
		t1.printInfo();
		t1.banZhuRen();
		System.out.println();
		Teacherclass t2=new Teacherclass("����",'Ů');
		t2.printInfo();//������ֺ��Ա�
		t2.course();//�γ̽���
		t2.banZhuRen();//������
		t2.giveLassons();//�ڿ�
		t2.scientific();//����
		System.out.println();
		Cadreclass c1=new Cadreclass();
		c1.printInfo();
		c1.distribution();//�����ѧ����
		System.out.println();
		Cadreclass c2=new Cadreclass("����",'Ů',"�ɲ���ʦ");
		c2.printInfo();//������֡��Ա��ְ��
		c2.banZhuRen();//������
		c2.distribution();//�����ѧ����
		c2.scientific();//����
		c2.shiZiDuiWu();//ʦ�ʽ���
		c2.laboratory();//ʵ���ҽ���
	}

}
