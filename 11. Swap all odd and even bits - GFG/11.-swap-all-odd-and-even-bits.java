// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to swap odd and even bits.
    public static int swapBits(int n) 
    {
         int mask1=0x55555555; //01010101
    	int mask2=0xAAAAAAAA; //10101010
    	int odd=(mask1 & n);
    	int even=(mask2 & n);
    	
    	odd<<=1; even>>=1;
    	
    	return (odd|even) ;
	    
	}
    
}

// { Driver Code Starts.

class BitWise{

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//taking n
		    
		    Solution obj = new Solution();
		    
		    //calling swapBits() method of class
		    //Swap
		    System.out.println(obj.swapBits(n));
		}
	}
}  // } Driver Code Ends