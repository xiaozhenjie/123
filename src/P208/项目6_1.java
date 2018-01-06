package P208;

import java.util.Arrays;

public class ÏîÄ¿6_1 {

	public static void main(String[] args) {
		int[] x=new int[12];
		for(int i=0;i<x.length; i++){
			x[i] = (int)(Math.random()*20);
		}
		Arrays.sort(x);
		for(int y:x){
			System.out.print(y+" ");
		}
	}

}
