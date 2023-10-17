package arrays;

public class Array_4 {
	 public static int[] print(int[] n)
	   {
		   int [] res	 =new int[ n.length];
		  for(int i=0;i<n.length/2+i;i++)
		  {
			  
			 res[i]=n[n.length/2+i];
		  }
		  for(int j=0;j<=res.length-1;j++) {
			  System.out.println(res[j]+" ");
		  }
		  return res;
	   }
		public static void main(String[] args) {
			int[] n= {1,2,3,4,5,6,8,9};
			System.out.println(print(n));

		}

}
