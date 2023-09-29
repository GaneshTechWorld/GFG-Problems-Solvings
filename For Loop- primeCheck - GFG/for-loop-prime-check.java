// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        // taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        // take testcases
        int t = sc.nextInt();
        while (t-- > 0) {
            // taking the number
            int n = sc.nextInt();
            Geeks obj = new Geeks();

            // caling isPrime method
            // with n as argument
            System.out.println(obj.isPrime(n));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Geeks {
    static String isPrime(int n) {
        int count = 1;
        
        if(n ==1)
        return "No";
        
        if(n==2)
        return "Yes";
        
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            
            if(n%i == 0)
            count ++;
            
            
            // Write your logic here
            // Return "Yes" if n is prime, else return "No"
            /*n is prime only if it is not divisible by any i.
            We will not reach till n and 1 is already discarded*/
            
        }
        if(count ==1)
        return "Yes";
        else
        return "No";
        
        
    }
}