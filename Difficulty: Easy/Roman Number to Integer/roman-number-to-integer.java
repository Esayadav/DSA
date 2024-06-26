//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
             HashMap<String, Integer> value = new HashMap<>();
        value.put("I", 1);
        value.put("V", 5);
        value.put("X", 10);
        value.put("L", 50);
        value.put("C", 100);
        value.put("D", 500);
        value.put("M", 1000);

        String[] romanNumerals = str.split("");
        int len = romanNumerals.length;
        int flag=0;
        int result = 0;
        for (int i=0; i<len-1; i++) {
            if(value.get(romanNumerals[i]) < value.get(romanNumerals[i+1])){
                result += (value.get(romanNumerals[i+1])-value.get(romanNumerals[i]));
                if(i==len-2){
                    flag=1;
                }
                i++;
            }else{
                result += value.get(romanNumerals[i]);
            }
        }
        if (flag!=1){
            result += value.get(romanNumerals[len-1]);
        }
        return result;

    }
}