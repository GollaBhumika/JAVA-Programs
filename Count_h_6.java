package String;

public class Count_h_6 {
  public static int check(String str, char key)
  { 
	  int c=0;
	  for(int i=0;i<=str.length()-1;i++)
	  {
		 if(str.charAt(i)==key)
		 {
			 c++;
		 }
	  }
	  return c;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println(check("chinni",'n'));
	}

}
