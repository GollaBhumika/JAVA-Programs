package arrays;

public class Array_16 {
public static int [] right(int [] n,int no)
{
	for(int j=1;j<=no;j++)
	{
		int last=n[n.length-1];
		for(int i=n.length-1;i>=0;i--)
		{
			if(i-1>0)
			{
				n[i]=n[i-1];
			}
		}
		n[0]=last;
	}
	
	for(int k=0;k<=n.length-1;k++)
	{
		System.out.print(n[k]+" ");
	}
	return n;
}
public static void main(String[] args) {
	int [] n= {1,2,3,4,5,6};
	right(n,2);
}
}
