
public class Testasd {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int sumA,sumB;//ab�����Ӻ�
		for(int a =6 ; a < 10000 ; a++){
			sumA=test(a);//a�����Ӻ�
			sumB=test(sumA);//
			if(sumA>a&&sumB==a){
				System.out.println(a +"   "+ test(a));
			}
		}		
		System.out.println(System.currentTimeMillis()-start);
	}
	/**
	 * �����Ӻͷ���
	 * @param num
	 * @return	�����ֵ����Ӻ�
	 */
	private static int test(int num){
		int sum = 1;//���Ӻ�
		for(int i = 2 ; i <= Math.sqrt(num) ; i++ ){
			if(num%i==0){
				sum+=i;
				sum+=(num/i);
			}
		}
		return sum;
	}
}
