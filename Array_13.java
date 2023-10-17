package arrays;

public class Array_13 {
  public static int large(int[] n)
  {
	  int max=n[0];
	  {
		  for(int i=0;i<=n.length-1;i++)
		  {
			  if(n[i]>max)
			  {
				  max=n[i];
			  }
		  }
		  return max;
	  }
  }
	public static void main(String[] args) {
		int[] n= {12,34,67,45,23};
		System.out.println(large(n));

	}

}
