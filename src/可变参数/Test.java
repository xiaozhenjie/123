package �ɱ����;

public class Test {

	public static void main(String[] args) {
		int sum=t(10,20,30,40);
		System.out.println(sum);
	}
	/*�������ʱ �ɱ��������������
	ֻ����һ���ɱ����*/
	static int t(int cutoff,int ...arr){
		int sum=0;
		for(int x:arr){
			sum+=x;
		}
		return sum*cutoff;
	}
}
