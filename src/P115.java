import java.util.Arrays;
import java.util.Scanner;

class SanNum{
	boolean boolF=false;
	int max;
	int min;
	public int maxNum(int inx,int iny,int inz){
		int c[]=new int[3];
		c[0]=inx;
		c[1]=iny;
		c[2]=inz;
		Arrays.sort(c);
		max=c[2];
		return max;
	}
	public int minNum(int inx,int iny, int inz){
		int d[]=new int[3];
		d[0]=inx;
		d[1]=iny;
		d[2]=inz;
		Arrays.sort(d);
		min = d[0];
		return min;
	}
	public boolean isXiaoyu(int inx,int iny,int inz){
		if(inx<-10000||iny<-10000||inz<-10000){
			boolF=true;
		}
		return boolF;
	}
}

public class P115 {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		Scanner sc=new Scanner(System.in);
		System.out.print("�������һ������");
		x = sc.nextInt();
		System.out.print("������ڶ�������");
		y = sc.nextInt();
		System.out.print("���������������");
		z=sc.nextInt();
		SanNum s=new SanNum();
		System.out.println("�����Ϊ��"+s.maxNum(x,y,z)+"\n��С��Ϊ��"+s.minNum(x, y, z));
		if(s.isXiaoyu(x,y,z)){
			System.out.println("��С��-10000����");
		}else{
			System.out.println("û��С��-10000����");
		}
	}

}
