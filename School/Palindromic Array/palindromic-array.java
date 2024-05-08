//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                for(int i=0; i<n; i++) if(!isPalindrome(a[i])) return 0;
                  return 1;
    }
    
    public static boolean isPalindrome(int num){
        
        if(num<0 || (num%10==0 && num!=0)) return false;
        int pop;
        int ans=0;
        while(ans<num){
            pop = num%10;
            ans = (ans*10)+pop;
            num/=10;
        }
        
        return (ans == num) || (ans/10==num);
           }
}