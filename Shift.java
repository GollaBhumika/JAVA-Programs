package arrays;

public class Shift {
  public static int[] print(int[]num)
  { 
	  int x=0;
	  int res[]=new int[num.length];
	  for(int i=0;i<=num.length-1;i++)
		  
	  {
		  for(int j=i+1;j<=num.length-1;j++)
		  {
			  if(num[i]>num[j])
			  {
				  int temp=num[i];
				  num[i]=num[j];
				  num[j]=temp;
			  }
		  }
		}
	  for(int l=0; l<=num.length-1;l++)
	  {
		  if(num[l]<=0)
		  {
			  res[x]=num[l];
			  x++;
		  }
		  
	  }
	  for(int k=0;k<=num.length-1;k++)
	  {
		  if(num[k]>=0)
		  {
			 res[x]=num[k];
			 x++;
		  }
	  }
	 
	  
	  for(int z=0;z<res.length;z++)
	  {
		  System.out.print(res[z]+" ");
	  }
	  return res;
	  }
  
 public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] num= {2,-1,8,9,4,-23,-7,-4};
   print(num);
   
	}

}
