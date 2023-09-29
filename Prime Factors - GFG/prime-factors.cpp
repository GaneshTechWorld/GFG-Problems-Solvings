// { Driver Code Starts


#include<bits/stdc++.h>
using namespace std;

 // } Driver Code Ends


class Solution{
public:

bool isprime(int n1)
{
for(int i=2;i*i<=n1;i++)
{
if(n1%i==0)
{
return false;
}
}
return true;
}

vector<int>AllPrimeFactors(int n) {
// Code here

vector<int>v;

for(int i=2;i<=n;i++)
{
if(n%i==0)
{
if(isprime(i))
{
v.push_back(i);
}
}
}
return v;

}
};
	


// { Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		long long int N;
		cin >> N;
		Solution ob;
		vector<int>ans = ob.AllPrimeFactors(N);
		for(auto i: ans)
			cout << i <<" ";
		cout <<"\n";
	}  
	return 0;
}  // } Driver Code Ends