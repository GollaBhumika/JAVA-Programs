package arrays;

public class Array_14 {
 public static int small(int[] n)
 {
	 int min=n[0];
	 for(int i=0;i<=n.length-1;i++)
 {
	if(n[i]<min)
	{
		min=n[i];
	}
 }
	 return min;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] n= {19,80,65,8,78};
System.out.println(small(n));
	}

}
