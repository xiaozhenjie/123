package comparable;

import java.util.Arrays;

public class Comparable_Demo implements Comparable{
	private double i=Math.random();
	public static void main(String[] args) {
		Comparable_Demo[] c={new Comparable_Demo(),new Comparable_Demo(),
				new Comparable_Demo(),new Comparable_Demo()};
		System.out.println("*************************����ǰ���********************");
		System.out.println(Arrays.asList(c));
		System.out.println("*************************��������********************");
		Arrays.sort(c);
		System.out.println(Arrays.asList(c));

	}

	public int compareTo(Object o) {
		if(o instanceof Comparable_Demo){
			if(i>((Comparable_Demo)o).i){
				return 1;
			}else if(i<((Comparable_Demo)o).i){
				return -1;
			}else{
				return 0;
			}
		}else{
			throw new ClassCastException("���ܱȽϡ�");
		}
		
	}
	public String toString(){
		return i+" ";
	}

}
