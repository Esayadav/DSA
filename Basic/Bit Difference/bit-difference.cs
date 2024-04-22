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

                var ip = Console.ReadLine().Trim().Split(' ');
                int a = int.Parse(ip[0]);
                int b = int.Parse(ip[1]);
                Solution obj = new Solution();
                int res = obj.countBitsFlip(a, b);
                Console.Write(res);
                Console.Write("\n");
          }

        }
    }
}

// } Driver Code Ends


//User function Template for C#

class Solution
{
    //Complete this function
    public int countBitsFlip(int a, int b)
    {
        //Your logic here
         int c=0;
        while(a>0 || b>0)
        {
             if((a& 1) != (b&1))
             {
                 c++;
             }
            a=a>>1;
            b=b>>1;
        }
        return c ;
    }

}