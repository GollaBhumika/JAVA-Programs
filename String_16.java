package String;

public class String_16 {
	public static void print(String str)
	{
		char[] s1 =print1(str);
		for(int i=0;i<=s1.length-1;i++)
		{
			int count=0;
           for(int j=i+1;j<=s1.length-1;j++)
           {
        	   if(s1[i]==s1[j] && s1[i]!=' ')
        	   {
        		   count++;
        		   s1[j]='0';
        	   }
           }
           if(count>0 && s1[i]!='0' )
           {
        	   System.out.print(s1[i]+" ");
           }
          
		}
	}
		public static char[] print1(String str1)
		{
			char[] res =new char[str1.length()];
			for(int i=0;i<=str1.length()-1;i++)
			{
				res[i]=str1.charAt(i);
			}
			return res;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       print("chinniniuikjhjj");
	}

}
