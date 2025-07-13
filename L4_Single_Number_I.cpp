#include<iostream>
#include<bits/stdc++.h>
using namespace std;

class Solution {
  public:
    int getSingle(vector<int>& arr) {
        // code here
        int num = arr[0];
        for(int i = 1; i<arr.size(); i++)
            num ^= arr[i];
        return num;
    }
};

int main(){
    int n; cin>>n;
    vector<int> arr(n);
    for(int i = 0; i<n; i++)
        cin>>arr[i];
    
    Solution obj;
    cout<<obj.getSingle(arr);
    return 0;
}