package p173;

public class Cadreclass extends Teacherclass implements Cadre{//�ɲ�������
	String post;
	Cadreclass(){
		super();
		post="";
	}
	Cadreclass(String name,char sex,String post){
		super(name,sex);
		this.post=post;
	}
	public void setPost(String post){
		this.post=post;
	}
	public String getPost(){
		return post;
	}
	public void distribution() {
		System.out.println("�����ѧ���񰡰�����������");
	}

	public void shiZiDuiWu() {
		System.out.println("ʦ�ʶ��齨�谡��������������");
	}
	public void laboratory() {
		System.out.println("ʵ���ҽ��谡������������������");
	}
	public void printInfo(){
		System.out.println("���֣�"+name+"���Ա�"+sex+"��ְ��"+post);
	}

}
