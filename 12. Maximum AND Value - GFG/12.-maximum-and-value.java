// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java
import java.util.*;
class Solution
{
    
   // Function for finding maximum AND value.
    public static int maxAND (int arr[], int N)
    {
       int res = 0;
        int pattern = 0;
        for(int bit=31;bit>=0;bit--){
            int value = (1<<bit);
            if(value < 0){
                value = value * -1;
            }
            pattern = pattern + value ;
            
            int count = 0;
            for(int i=0;i<arr.length;i++){
                if((arr[i] & pattern) == pattern){
                    count++;
                }
            }
            if(count>=2){
                res = res + value;
            }
            else{
                pattern = pattern - value;
            }
        }
        return res;
   }
}
// { Driver Code Starts.

class BitWise {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    
		    //input size of array
		    int n = Integer.parseInt(br.readLine());
		    String inputLine[] = br.readLine().trim().split(" ");
		    int arr[] = new int[n];
		    
		    //inserting elements in the array
		    for(int i=0; i<n; i++){
		        arr[i]=Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxAND() method of class AND
		    System.out.println(obj.maxAND(arr, n));
		}
	}
}
  // } Driver Code Ends