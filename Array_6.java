package arrays;

public class Array_6 {
 public static void print(int[] n)
 {
	 int sum=0;
	 for(int i=0;i<=n.length-1;i++)
	 {
		 sum=sum+n[i];
	 }
	 System.out.println(sum);
 }
	public static void main(String[] args) {
		
int[] n= {1,2,3,4,5};
print(n);
	}

}
