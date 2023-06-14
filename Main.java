import java.util.*;
public class Main
{
    static int majelem(int arr[],int n)
	    {
	        int count=0;
	        
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<n;j++)
	            {
	                if(arr[i]==arr[j])
	                {
	                    count=count+1;
	                }
	            }
	            if(count>n/2)
	            {
	                return  arr[i];
	            }
	             count=0;
	        }
	        return -1;
	    }     

	public static void main(String[] args) 
	{
	    
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i = 0;i< arr.length-1 ;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int ans=majelem(arr, n);
		if(ans!=-1)
		System.out.println(ans);
		else
		System.out.println("-1");
        sc.close();
	}
}
