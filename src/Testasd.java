
public class Testasd {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int sumA,sumB;//ab的因子和
		for(int a =6 ; a < 10000 ; a++){
			sumA=test(a);//a的因子和
			sumB=test(sumA);//
			if(sumA>a&&sumB==a){
				System.out.println(a +"   "+ test(a));
			}
		}		
		System.out.println(System.currentTimeMillis()-start);
	}
	/**
	 * 算因子和方法
	 * @param num
	 * @return	该数字的因子和
	 */
	private static int test(int num){
		int sum = 1;//因子和
		for(int i = 2 ; i <= Math.sqrt(num) ; i++ ){
			if(num%i==0){
				sum+=i;
				sum+=(num/i);
			}
		}
		return sum;
	}
}
