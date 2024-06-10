//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.fullPrime(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	static int fullPrime(int N){
	    //code here
	       boolean rem=true;
        if(N<=1){
            return 0;
        }
        for(int i=2; i<=N/2; i++){
            if(N%i==0){
                rem =false;
                return 0;
            }
        }
        if(rem==true){
            while(N!=0){
            int x=N%10;
            if(x<=1){
                return 0;
            }
            for(int j=2; j<x; j++){
                if(x%j==0){
                    return 0;
                }
            }
             N=N/10;
        }
        }
        return 1;
	}
}