//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            int vertices = Integer.parseInt(read.readLine());
            int edges = Integer.parseInt(read.readLine());

            for (int i = 0; i < vertices; i++) adj.add(i, new ArrayList<Integer>());

            int p = 0;
            for (int i = 1; i <= edges; i++) {
                String s[] = read.readLine().trim().split("\\s+");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                adj.get(u).add(v);
            }

            ArrayList<Integer> res = new Solution().topologicalSort(adj);

            if (check(adj, vertices, res) == true)
                System.out.println("1");
            else
                System.out.println("0");
            System.out.println("~");
        }
    }

    static boolean check(ArrayList<ArrayList<Integer>> adj, int V,
                         ArrayList<Integer> res) {

        if (V != res.size()) return false;

        int[] map = new int[V];
        for (int i = 0; i < V; i++) {
            map[res.get(i)] = i;
        }
        for (int i = 0; i < V; i++) {
            for (int v : adj.get(i)) {
                if (map[i] > map[v]) return false;
            }
        }
        return true;
    }
}

// } Driver Code Ends


class Solution {
    // Function to return list containing vertices in Topological order.
    static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        // Your code here
          boolean [] visited=  new boolean[adj.size()];
        // Creating an empty Stack
        Stack <Integer> ans= new Stack<>();
        
        for(int i=0; i<adj.size();i++){
            if(!visited[i])
                {toposort_baby(i, adj, visited, ans);}
        }
        
        ArrayList<Integer> result= new ArrayList<Integer>();
        
        while(!ans.isEmpty())
            result.add(ans.pop());
            
        return result;
    }
    
    //similar to DFS
    static void toposort_baby(int u, ArrayList<ArrayList<Integer>> adj, boolean [] visited, Stack <Integer> ans){
        visited[u]= true;
        
        //phele mere bacchon ko daalo(u ke nodes ko)
        for(int v:adj.get(u)){
            if(!visited[v]){
                toposort_baby(v, adj, visited, ans);
            }
            
            //ye alag se v ko add karne ki req nhi hai 
            //bcz while running the toposort_baby for those v which are not visited
            //it will added as per the code
            
            //ans.push(v);
        }
        
        //ab mujhe daalo stack mein
        ans.push(u);
    }
}