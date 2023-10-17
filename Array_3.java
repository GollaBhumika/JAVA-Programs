package arrays;

public class Array_3 {
   public static void print(int[] n)
   {
	   int  res=n.length-1;
	  for(int i=0;i<=res/2;i++)
	  {
		 System.out.print(n[i]+" "); 
	  }
   }
	public static void main(String[] args) {
		int[] n= {1,2,3,4,5,6};
		print(n);

	}

}
