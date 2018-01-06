import java.util.Arrays;

public class King {

	public static void main(String[] args) {
		king(999,15);

	}
	/*
	 * total最大编号
	 * num
	 */
	public static void king(int total,int num){
		boolean[] arr=new boolean[total];
		Arrays.fill(arr, true);
		int next=1;
		int index=0;
		int count=total;
		while(count>1){
			if(arr[index]==true){
				if(next==num){
					arr[index]=false;
					--count;
					next=1;
				}else{
					++next;	
				}
			}
			++index;
			if(index==arr.length){
				index=0;
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]==true){
				System.out.println("大王："+(i+1));
			}
		}
	}

}
