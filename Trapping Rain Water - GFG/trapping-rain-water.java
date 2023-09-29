// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}

// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n)
    { 
        long ru =0;
        int []lmax =  new int[n];
        int []rmax = new int[n];
        
        lmax[0] = arr[0];
        for(int i=1;i<n;i++)
        {
         lmax[i] =  Math.max(lmax[i-1],arr[i]);   
        }
        
        rmax[n-1] = arr[n-1];
        for(int j=n-2;j>=0;j--)
        {
         rmax[j] =  Math.max(rmax[j+1],arr[j]);   
        }
       
        for(int i=1;i<n-1;i++)
        {
            ru = ru + (Math.min(lmax[i],rmax[i])) -arr[i];
        }
        
        return ru;
    } 
}


