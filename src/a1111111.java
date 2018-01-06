
public class a1111111 {

	public static void main(String[] args) {
		int a[][] = new int[6][6];
			
		int i,j;
		int max=a[0][0],row=0,col=0;
		
		for(i=0;i<a.length;i++){
			for(j=0;j<a[i].length;j++){
				a[i][j]=(int)(Math.random()*100);	
			}
		}
		for(i=0;i<a.length;i++){
			for(j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" \t");
			}
			System.out.println();
		}
		for(i=0;i<a.length;i++){
			for(j=0;j<a[i].length;j++){
				if(a[i][j]>max){
					max=a[i][j];
					row=i;
					col=j;
				}
			}
		}
		System.out.println("最大元素为"+max+"，在第"+(row+1)+"行，"+(col+1)+"列");
		
	}

}
