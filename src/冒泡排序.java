
public class ц╟ещеепР {

	public static void main(String[] args) {
		int a[]={123,4,32,45,134,255,12,334,53};
		int num;
		for(int i=1;i<a.length;i++){
			for(int j=0;j<a.length-i;j++){
				if(a[j]>a[j+1]){
						num=a[j];
						a[j]=a[j+1];
						a[j+1]=num;
				}
			}
		}
		for(int x:a){
			System.out.print(x+" ");
		}
	}

}
