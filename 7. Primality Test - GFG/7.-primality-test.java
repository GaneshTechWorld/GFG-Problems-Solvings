// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class Mathematics {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();//input testcases


		while(T-->0)//while testcase have not been exhausted
		{
		    Solution obj=new Solution ();
		    int N;
		    N=sc.nextInt();//input n
		    if(obj.isPrime(N))
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		    
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public boolean isPrime(int N)
    {
        int n = N;
       if(n == 1 || n == 0)
       return  false;
       
       if(n  == 2 || n == 3 )
       return true;
       
       if(n%2 ==0 || n%3==0 )
       return false;
       
       for(int i=5;i*i <= n;i=i+6)
       {
           if((n%i==0 ) ||n%(i+2)==0)
           return false;
       }
     
     return true;
    }
}