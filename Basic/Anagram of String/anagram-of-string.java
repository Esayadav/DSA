//{ Driver Code Starts
//saksham raj seth
import java.util.*;
import java.util.stream.*;

class Anagrams{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			GfG g=new GfG();
			System.out.println(g.remAnagrams(s,s1));
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG
{
	public int remAnagrams(String s,String s1)
        {
        //add code here.
        int[] count = new int[26]; // Array to store frequency of characters
        
        // Count frequency of characters in string s
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        // Subtract frequency of characters in string s1
        for (char c : s1.toCharArray()) {
            count[c - 'a']--;
        }
        
        // Count the total number of characters that need to be removed
        int total = 0;
        for (int freq : count) {
            total += Math.abs(freq);
        }
        
        return total;
        }
}