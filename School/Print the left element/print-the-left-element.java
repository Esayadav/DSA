//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.leftElement(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public long leftElement(long arr[], long n)
    {
        // Your code goes here  
          //Created a long for returning
        long x = 0;
        //Sort Array
        Arrays.sort(arr);
        
        //For getting mid value
        int mid = 0;
        
        //If it is a odd number, then return mid value of array
        if(n%2 != 0){
            mid = (int)n / 2;
            x = arr[mid];
        }
        else{
            //Else, there will be n/2 operations at maximum end of array
            // and n/2 -1, (one less) operations at minimum end of array
            //return miminum end as the value remaining will always be from minumum end.
            mid = ((int)n/2) - 1;
            x = arr[mid];
        }
        return x;
    }
}