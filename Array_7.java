package arrays;

public class Array_7 {
	
		  public static void print(int[] a)
		  {
		    

		    for(int i=0;i<=a.length-1;i++)
		    {
		        if((a[i]%2)==0){
		            System.out.println(a[i] + " ");
		        }
		    
		        
		        if(a[i]%2==1)
		        {
		        	System.out.println(a[i]+" ");
		        }
		  }
		  }
		        public static void main(String[] args) {
				    int[]a={29,80,80,67,56};
		               print(a);
		        }
		    }
		   


