// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking testcases
		int T=sc.nextInt();
		
		while(T-->0)
		{
		    Solution  obj=new Solution ();
		    int a,m;
		    
		      
            //taking input a and m
		    a=sc.nextInt();
		    m=sc.nextInt();
		    
		    
		  
            //calling function modInverse()
		    System.out.println(obj.modInverse(a,m));
		   
		    
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    
     int gcd(int x,int y)
     {
        int b = x;
        int c = y;
        
        
        
         while(b!=c)
        {  
            if(b<c)
            c=c-b;
            else
            b = b-c;
        }
         
         return c;
   }
    
    
    
    
  public int modInverse(int a, int m)
    {
       /* int b =a;
        int c = m;
        int i=0;
        
       gcd(b,c);
       
       
       
       
       if(gcd(b,c)!=1)
       return -1;
       
       
        
            for(i=0;i<(m-1);i++)
            {
                if((a*i)%m==1)
                {
                    return i;
                }
            }
       
       return i;  */
       
          int val = -1;
     for(int i=1; i<=m; i++)
     {
         if((i*a)%m == 1)
           val = i;
     }
     return val;
    }

}
