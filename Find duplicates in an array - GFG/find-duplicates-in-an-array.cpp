// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
class Solution{
  public:
    vector<int> duplicates(int arr[], int n) 
    
    {
        // code herevector<int> v;
       
  // code here
       map<int,int>mp;
       sort(arr,arr+n);
       vector<int>v;
       int j=0;
      for(int i=0;i<n;i++)
      {
          if(arr[i]==arr[i+1] && j==0)
          {
              v.push_back(arr[i]);
              j=1;
          }
          else if(arr[i]!=arr[i+1])
          {
              j=0;
          }
      }
     if(v.size()==0)
     {
         v.push_back(-1);
         return v;
     }
     else return v;
   }
};

// { Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t-- > 0) {
        int n;
        cin >> n;
        int a[n];
        for (int i = 0; i < n; i++) cin >> a[i];
        Solution obj;
        vector<int> ans = obj.duplicates(a, n);
        for (int i : ans) cout << i << ' ';
        cout << endl;
    }
    return 0;
}
  // } Driver Code Ends