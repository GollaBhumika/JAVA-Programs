package arrays;

public class Array_18 {
	public static int [] print1(int[] n)
	{
		int[] res=new int[n.length];
		int x=0;
		for(int i=0;i<=n.length-1;i++)
		{
			if(n[i]!=0)
			{
				res[x]=n[i];
				x++;
			}
		}

		
		
	
		for(int k=0;k<=res.length-1;k++)
		{
			System.out.print(res[k]+" ");
		}
      return res;
	}

	public static void main(String[] args) {			
		int[] n= {1,0,0,3,4,0,5};
		print1(n);

	}

}
