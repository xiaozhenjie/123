import java.io.IOException;

public class ����ĸ��Ϸ {

	public static void main(String[] args) throws IOException {
		char x,y='k',z;
		System.out.println("������a��z�е�һ����ĸ");
		System.out.println("���ܲ�������");
		do{
			x = (char)System.in.read();
		
			do{
				z=(char)System.in.read();
			}while(z!='\n');
			
			if(x==y){
				System.out.println("��ϲ�㣬�����ˣ�");
			}else{
				System.out.println("\n���ź���û���У�");
				if(x>y){
					System.out.println("��ĸ̫����");
				}else {
					System.out.println("��ĸ̫С��");
				}
				System.out.println("����һ��:");
			}
		}while(x!=y);
	}

}
