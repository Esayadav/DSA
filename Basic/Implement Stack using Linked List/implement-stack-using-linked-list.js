//{ Driver Code Starts
//Initial Template for javascript
'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}

class StackNode{
    constructor(a){
        this.data = a;
        this.next = null;
    }
}



function main() {
    let t = parseInt(readLine());
    let i = 0;
    for(;i<t;i++)
    {
        let sq = new MyStack();
        let q = parseInt(readLine());
        let input_ar1 = readLine().split(' ').map(x=>parseInt(x));
        let index = 0;
        let res = '';
        while(q--){
            let QueryType = input_ar1[index++];
            if(QueryType == 1){
                let a = input_ar1[index++];
                sq.push(a);
            }
            else{
                res += sq.pop() + " ";
            }
        }
        console.log(res);
        
    }
}
// } Driver Code Ends


//User function Template for javascript


class MyStack
{
    
    // class StackNode{
    //     constructor(a){
    //         this.data = a;
    //         this.next = null;
    //     }
    // }
    constructor(){
        this.top = null; 
    }
    
    /**
     * @param {number} a
    */
    
    //Function to push an integer into the stack.
    push(a)
    {
        // code here
        let temp = new StackNode(a);
        temp.next = this.top;
        this.top = temp;
    }
    
    /**
    */
    
    //Function to remove an item from top of the stack.
    pop()
    {
        // code here
             if(this.top===null){
            return -1;
        }
        let res = this.top.data;
        this.top = this.top.next;
        return res;
    }
}