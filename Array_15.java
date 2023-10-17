package arrays;

import java.util.Arrays;

public class Array_15 {
  public static int[] left(int[] n,int no)
  {
	  for(int i=1;i<=no;i++)
	  {
		  int first=n[0];
		  for(int j=0;j<n.length-1;j++)
		  {
			  n[j]=n[j+1];
		  }
		  n[n.length-1]=first;
	  }
	  for(int k=0;k<=n.length-1;k++) {
		  System.out.println(n[k]+" ");
	  }
	  
	 return n;
			  
  }
	public static void main(String[] args) {
		int[] n= {1,2,3,4,5};
		left(n,3);

	}

}
