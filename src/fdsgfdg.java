import java.util.Scanner;

public class fdsgfdg {
	public static void main(String[] args) {
		int[][] s={{37,32,4},{24,34,424,42,44},{34,76,89,67},{34,22}};
		int b=34;
		for(int i=0;i<s.length;i++){
			for(int j=0;j<s[i].length;j++){
				if(s[i][j]==b){
					System.out.println(b+"在数组S中的下标是："+i+" "+j);
				}
			}
		}
	}
}


