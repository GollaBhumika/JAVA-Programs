package arrays;

public class Array_17 {
	public static int [] print1(int[] n)
	{
		int[] res=new int[n.length];
		int x=n.length-1;
		for(int i=n.length-1;i>=0;i--)
		{
			if(n[i]!=0)
			{
				res[x]=n[i];
				x--;
			}
		}
		
		print(res);
		return res;
	}
	public static void print(int[] num)
	{
		for(int k=0;k<=num.length-1;k++)
		{
			System.out.print(num[k]+" ");
		}

	}

		public static void main(String[] args) {
			int[] n= {1,0,0,3,4,0,5};
			print1(n);

		}

}
