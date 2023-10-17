package String;

public class Nchar_7 {
   public static String print(String str,int n)
   {

	   for(int i=0;i<=str.length()-1;i++)
	   {
		   if(str.length()>=n)
		   {
			    return str.substring(0,n)+str.substring(str.length()-n);
		   }
	   }
	   return str;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(print("hsdvbv",2));
	}

}
