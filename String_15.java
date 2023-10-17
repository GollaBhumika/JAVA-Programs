package String;

public class String_15 {
	public static void  sort(String str)
	{
		char [] res=new char[str.length()];
		for(int i=0;i<=str.length()-1;i++)
		{
           res[i]=str.charAt(i);
           System.out.print(res[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcd";
		sort(str);
	}
}
