import java.util.Arrays;

public class P197 implements Comparable{
	private double i=Math.random();
	public int compareTo(Object o){
		if(o instanceof P197){
			if(i>((P197)o).i){
				return 1;
			}else if(i==((P197)o).i){
				return 0;
			}else{
				return -1;
			}
		}else{
			throw new ClassCastException("不能比较。");
		}
	}
	public String toString(){
		return " "+i;
	}
	public static void main(String[] args) {
		P197[] p1={new P197(),new P197(),new P197(),new P197()};
		P197 x;
		System.out.println("***********************排序前输出*************************");
		System.out.println(Arrays.asList(p1));
		for(int j=1;j<p1.length;j++){
			for(int i=0;i<p1.length-1;i++){
				if(p1[i].compareTo(p1[i+1])<0){
					x=p1[i];
					p1[i]=p1[i+1];
					p1[i+1]=x;
				}
			}
		}
		System.out.println("***********************排序后输出**************************");
		System.out.println(Arrays.asList(p1));
	}

}
