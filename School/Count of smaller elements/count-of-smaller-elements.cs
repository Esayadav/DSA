//{ Driver Code Starts
//Initial Template for C#

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DriverCode
{

    class GFG
    {
        static void Main(string[] args)
        {
            int testcases;// Taking testcase as input
            testcases = Convert.ToInt32(Console.ReadLine());
            while (testcases-- > 0)// Looping through all testcases
            {

                int n = Convert.ToInt32(Console.ReadLine());// Input for size of array
                int[] arr = new int[n];
                arr = Array.ConvertAll(Console.ReadLine().Trim().Split(), int.Parse);// input for array elements
                int x = Convert.ToInt32(Console.ReadLine());// Input for x
                Solution obj = new Solution();
                int res = obj.countOfElements(arr, n, x);
                Console.Write(res+"\n");
            }

        }
    }
}
// } Driver Code Ends


//User function Template for C#

class Solution
    {
        //Complete this function
        //Function to count the number of occurrences of x in the given array.
        public int countOfElements(int[] arr, int n, int x)
        {
            //Your code here
            int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=x){
                count++;
            }
        }
        if(count!=0){
            return count;
        }
        else{
            return 0;
        }
        }
    }