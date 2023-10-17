package String;

public class String_13 {
  public static void print(String str)
  {
	  String res1="";
	  String res2="";
	  for(int i=0;i<=str.length()-1;i++)
	  {
		  if(str.charAt(i)>=65&&str.charAt(i)<=90 ||str.charAt(i)>=97&&str.charAt(i)<=122)
		  {
			  res1=res1+str.charAt(i);
		  }
		  if(str.charAt(i)>=48&&str.charAt(i)<=57)
		  {
			  res2=res2+str.charAt(i);
		  }
	  }
	  System.out.println(res1);
	  System.out.println(res2);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("1hkTg24");
	}

}
