//{ Driver Code Starts

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split("\n").map(string => {
        return string.trim();
    });

    main();
});

function readLine() {
    return inputString[currentLine++];
}


function main() {
    let t = parseInt(readLine());
    let i = 0;
    for(;i<t;i++){
        
        let n = parseInt(readLine());
        
        
        let k = parseInt(readLine());
        
        
        let arr = new Array(n);
        let input_arr = readLine().split(' ').map(x=>parseInt(x));
        for(let i=0;i<n;i++){
            arr[i] = input_arr[i];
        }
        
        let obj = new Solution();
        
        obj.swapKth(n, k, arr);
        
        let S_res = '';
        for(let i=0;i<arr.length;i++)
        {
            S_res+=(arr[i]);
            S_res+=' ';
        }
        console.log(S_res);
        
    }
}

// } Driver Code Ends



class Solution {
/**
* @param number n
* @param number k
* @param number[] arr

* @returns void
*/
    swapKth(n, k, arr) {
        // code here
         let result = arr[k-1]
            arr[k-1] = arr[n-k]
            arr[n-k] = result
            return arr
    }
}
        
