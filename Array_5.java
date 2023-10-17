package arrays;

public class Array_5 {
 public static void print1(int[] n)
 {
	// for(int i=1;i<=n.length-1;i=i+2)//even position
		for(int i=0;i<=n.length-1;i=i+2) //odd position
	 {
			
		System.out.println(n[i]+" ");	
	 }
		
 }
	public static void main(String[] args) {
		int [] n= {1,2,3,4,5,6};
		print1(n);

	}

}
