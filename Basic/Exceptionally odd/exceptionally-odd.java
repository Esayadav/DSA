//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getOddOccurrence(arr, n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    int getOddOccurrence(int[] arr, int n) {
        // code here
         int oddCount = 0;
        
        // Loop through each element in the array
        for(int num : arr) {
            // XOR operation (^) with oddCount and current element
            // XOR of two equal numbers results in 0, so even occurrences cancel out
            // XOR of 0 with a number gives the number itself
            // As a result, after looping through all elements, oddCount will contain
            // the value of the element occurring odd number of times
            oddCount = oddCount ^ num;
        }
        
        // Return the element occurring odd number of times
        return oddCount;
    }
}
