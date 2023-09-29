// { Driver Code Starts
//Initial Template for C

#include <stdio.h>


 // } Driver Code Ends
//User function Template for C

int sumOfDigits(int n)
{
    int sum =0;
    int rem =0;
    
   while(n>0)
   {
       rem = n%10;
       sum = sum + rem;
       n = n/10;
    }
    return sum;
}

// { Driver Code Starts.

int main() {
	int T;
	
	//taking testcases
	scanf("%d", &T);
	while(T--)
	{
	    int n;
	    
	    //taking input n
	    scanf("%d", &n);
	    
	    //calling method sumOfDigits()
	    
	    printf("%d\n", sumOfDigits(n));
	    
	    
	}
	return 0;
}  // } Driver Code Ends