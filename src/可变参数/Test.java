package 可变参数;

public class Test {

	public static void main(String[] args) {
		int sum=t(10,20,30,40);
		System.out.println(sum);
	}
	/*多个参数时 可变参数必须放在最后
	只能有一个可变参数*/
	static int t(int cutoff,int ...arr){
		int sum=0;
		for(int x:arr){
			sum+=x;
		}
		return sum*cutoff;
	}
}
