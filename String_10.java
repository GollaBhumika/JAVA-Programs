package String;

public class String_10 {
  public static  boolean print(String str)
  {
	  for(int i=0;i<=str.length()-1;i++)
	  {
		  for(int j=i+1;j<=str.length()-1;j++)
		  {
			  if(str.charAt(i)==str.charAt(j))
			  {
				  return false;
			  }
		  } 
	  }
	  return true;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(print("cat"));
	}

}
