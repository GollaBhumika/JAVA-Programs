package String;

public class String_22 {
  public static String print(String n1,String n2)
  {
  int sum=helper(n1)+helper(n2);
  return sum+"";
  
  }
 
		  public static int helper(String str)
		  {
			  int sum=0;
			  for(int i=0;i<=str.length()-1;i++)
			  {
				  sum=sum*10+(str.charAt(i)-48);
			  }
			  return sum;
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(print("34","16"));
	}

}
