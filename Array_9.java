package arrays;

public class Array_9 {
	public static void print(int [] n)

	{


		for(int i=0;i<=n.length-1;i++)  
		{
			int count1=0;
			for(int j=0;j<=i-1;j++)
			{
				if(n[i]%n[j]==0)
				{
					count1++;
				}
			}
			if(count1==0)
			{
				System.out.println(n[i]+" ");


			}

		}


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n= {3,6,2,56,72,79,8};
		print(n);
	}

}
