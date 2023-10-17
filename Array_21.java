package arrays;

public class Array_21 {
public static int average(int[] num)
{
	int sum=0;
	int[] res=new int[num.length];
	//int min=num[0];
	//int max=num[0];
	for(int i=0;i<num.length;i++)
	{
		sum=sum+num[i];
		
	}
		return sum/num.length;
}
	public static void main(String[] args) {
		int [] num= {10,20,30,40,50};
		System.out.println(average(num));

	}

}
