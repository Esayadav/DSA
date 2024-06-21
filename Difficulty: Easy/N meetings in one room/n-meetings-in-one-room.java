//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
         int lastEnd = -1, ans = 0;
        Queue<int[]> sortedByStart = new PriorityQueue<>((a,b) -> (a[0]-b[0]));
        for(int i=0; i<n; i++)
           sortedByStart.offer(new int[]{start[i], end[i]});
        
        while(sortedByStart.size() > 0){
               int temp[] = sortedByStart.poll();
               if(lastEnd != -1 && temp[0] <= lastEnd)
                 lastEnd = Math.min(lastEnd, temp[1]);
               else{
                 lastEnd = temp[1];
                 ans++;
               }
        }
        return ans;
    }
}
