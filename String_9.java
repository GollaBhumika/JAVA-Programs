package String;

public class String_9 {
 public static String print(String str)
 {
	 String res="";
	 for(int i=0;i<=str.length()-1;i++)
	 {
		 if(str.charAt(i)>=65&&str.charAt(i)<=90)
		 {
			  res=res+(char)(str.charAt(i)+32 );
		 }
		 if(str.charAt(i)>=97&&str.charAt(i)<=122)
		 {
			 res=res+ (char)(str.charAt(i)-32) ;
		 }
	 }
	 return res;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(print("HeLLo"));
	}

}
