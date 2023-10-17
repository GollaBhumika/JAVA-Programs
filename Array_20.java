package arrays;

public class Array_20 {
	public static int [] print(int []num)
	{
		int [] res=new int[num.length];
		int x=0;
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]%2==1)
			{
				res[x]=num[i];
				x++;

			}
		}
		for(int j=0;j<=num.length-1;j++)
		{
			if(num[j]%2==0)
			{
				res[x]=num[j];
				x++;
			}
		}
		for(int m=0;m<=num.length-1;m++)
		{
			System.out.print(res[m]+" ");
		}
		return res;
	}
	public static void main(String[] args) {
		int[] num= {1,3,6,2,8,7};
		print(num);

	}
}
