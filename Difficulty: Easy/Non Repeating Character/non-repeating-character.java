//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
         int[] freqChar = new int[26];
        Queue<Character> q = new LinkedList<>();
        
        for(int i=0;i<S.length();i++){
            char currChar = S.charAt(i);
            q.add(currChar);
            freqChar[currChar-'a']++;
            
            while(!q.isEmpty() && freqChar[q.peek() -'a'] > 1){
                q.remove();
            }
            
        }
        if(q.isEmpty()){
            return '$';
        }else{
            return q.peek();
        }
    }
}

