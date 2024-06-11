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
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            long[] product = obj.minAnd2ndMin(a, n); 
            if(product[0]==-1)
                System.out.println(product[0]);
            else
                System.out.println(product[0]+" "+product[1]);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
           long smin=0;
       long count=0;
       Arrays.sort(a);
       long[] longArray = new long[1];
       long arr[]=new long[2];
       for(int i=0;i<n-1;i++){
            int j=i+1;
           if(a[i]==a[j]){
               count++;
           }
           else{
               smin=a[j];
               break;
           }
       }
       if(count==n-1){
           longArray[0] = -1L;
           return longArray;
       }
       arr[0]=a[0];
       arr[1]=smin;
       return arr;
    }
}
