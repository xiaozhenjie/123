
public class jiujiuchenfabiao {

	public static void main(String[] args) {
		int k,j;
		int m;
		for(k=1;k<30;k++){
			System.out.print(" ");
		}
		System.out.println("¾Å¾Å³Ë·¨±í");
		for(k=1;k<10;k++){
			for(j=1;j<=(10-k);j++){
				m=k*j;
				System.out.print(k+"x"+j+"=");
				if(m<10){
					System.out.print(m+"  ");
				}else{
					System.out.print(m+" ");
				}
			}
			System.out.println();
		}
	}

}
