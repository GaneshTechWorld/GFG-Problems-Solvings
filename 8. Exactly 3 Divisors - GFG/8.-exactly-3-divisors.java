// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		


		//taking testcases
		int T=sc.nextInt();
		
		while(T-->0)
		{
		    Solution obj=new Solution();
		    int N;
		    N=sc.nextInt();//taking N
		    //calling function exactly3Divisors()
		    System.out.println(obj.exactly3Divisors(N));
		   
		    
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    boolean isPrime(int x)
    {
      if( x == 1)
      return  false;
      
      if(x ==2 || x ==3)
      return true;
      
      if(x %2 ==0 || x%3==0)
      return false;
      
      for(int i = 5;i*i<=x;i= i+6)
      {
           if(x%i ==0 || x%(i+2)==0)
           return false;
      }
       return true; 
    }
    
    
    public int exactly3Divisors(int N)
    {
        int count =0;
         for(int i = 2;i*i<=N;i++)
         {
           if(isPrime(i))
           {
               if(i*i<=N)
               count++;
           }
         }
         return count;
    }
}
