package String;

public class String_11 {
  public static String print(String str)
  {
	  String res="";
	  for(int i=0;i<=str.length()-1;i++)
	  {
		  
		  if(str.charAt(i)>=97&&str.charAt(i)<=122)
		  {
			  res=res+(char)(str.charAt(i)-32);
		  } 
		  else
		  {
			  res=res+str.charAt(i);
		  }
	  }
	  return res;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(print("HelLo"));
	}

}
