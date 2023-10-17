package String;

public class Check 
{
	public static int convert(int [] num)
	{
		int j=0;
		int res=0;
		
		for(int i=num.length-1;i>=0;i--)
		{
			
			res=res+(int)Math.pow(2, j)*num[i];
	        
			j++;
			
		}
		
		return res;
	}
	public static void main(String[] args) 
	{
		int[] num= {1,1,0,0,1};
		System.out.println(convert(num));
	}

}
