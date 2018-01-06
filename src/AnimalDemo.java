//�����ӿ�Run
interface Run{
	//�ӿ��������ķ���
    void run();
}
//�����ӿ�Animal,���̳нӿ�Run
interface Animal extends Run{
	//�ӿ����������ķ���shout
	//����Ϊ�̳���Run�ӿڣ����ԣ���Animal�ӿڰ�����������:run��shout
	void shout();
}
//����Bird�࣬ʵ�ֽӿڷ���run��shout
class Bird implements Animal{
	public void run(){
		System.out.println("�������������ֻϸϸ��С����·��");
	}
	public void shout(){
		System.out.println("�������������ߴߴզզ��");
	}
}
//����Tiger�࣬ʵ�ֽӿڷ���run��shout
class Tiger implements Animal{
	public void run(){
		System.out.println("�����ϻ�������֫���ķ���");
	}
	public void shout(){
		System.out.println("�����ϻ��������׺ݣ��߰�������");
	}
}
//����������AnimalDemo������һ��
public class AnimalDemo {
      //ʵ�ַ���һ��
	public static void main(String []args){
		//�����ӿڶ���
		Animal animal = null;
		//�ýӿ�ʵ����Bird����ʵ�壬�������ӿڶ���animal
		animal = new Bird(); 
		//JVM����ʱ���ӿڶ����Զ�����ʵ��������е�run��shout������ʵ�ֶ�̬
		animal.run();
		animal.shout();
		//�ýӿ�ʵ����Tiger����ʵ�壬�������ӿڶ���animal
		animal = new Tiger();
		//JVM����ʱ���ӿڶ����Զ�����ʵ��������е�run��shout������ʵ�ֶ�̬
		animal.run();
		animal.shout();  
	} 
}
