// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}// } Driver Code Ends





class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    { 
        int  n = str.length();
     
       String b ="";
      
       for(int i = n-1;i>=0;i--)
       {
         b = b + str.charAt(i);   
       }
        return b;
    }
    
    

}
