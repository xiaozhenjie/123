import java.util.Scanner;

public class fds {

	public static void main(String[] args) {
		int k,j,m;
		for(k=1;k<=9;k++){
			for(j=1;j<=k;j++){
				m=k*j;
				System.out.print(k+"x"+j+"=");
				if(m<10){
					System.out.print(""+m+" ");
				}else{
					System.out.print(m+" ");
				}
			}
			System.out.println();
		}
		
	}

}
