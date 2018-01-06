
public class я╟ур╨мн╙0 {

	public static void main(String[] args) {
		int[] num1={-1,0,1,2,-1,-4};
		for(int i=0;i<num1.length-2;i++){
			for(int j=i+1;j<num1.length-1;j++){
				for(int z=j+1;z<num1.length;z++){
					if(num1[i]+num1[j]+num1[z]==0){
						System.out.println(num1[i]+"+"+num1[j]+"+"+num1[z]+"=0");
					}
				}
			}
		}

	}

}
