//{ Driver Code Starts
// Initial Template for Java

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
            System.out.println(ob.isPerfect(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int isPerfect(int N) {
        // code here
            int sum = 0;
        int original = N;
        while(original>0){
            int digit = original%10;
            sum += fact(digit);
            original/=10;
        }
        if(N==sum){
            return 1;
        }
        return 0;
    }
    
    private static int fact(int N){
        int fact = 1;
        for(int i=N; i>=2; i--){
            fact *= i;
        }
        return fact;
    }
}