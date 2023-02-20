//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class CountCyclicPaths_exe {
    public static int countPaths(int N) {
        // code here
        long M = 1000000007;
        // o=1, because we can reach o-->o with 0 steps(how ? ans is don't move)
        long o = 1, a = 0, b = 0, c = 0;

        for (int i = 1; i <= N; i++) {
            // calculate the steps you can reach from other vertices
            long currO = (a + b + c) % M;
            long currA = (o + b + c) % M;
            long currB = (o + a + c) % M;
            long currC = (o + a + b) % M;

            o = currO;
            a = currA;
            b = currB;
            c = currC;
        }
        return (int) o;
    }
}

// { Driver Code Starts.

class CountCyclicPaths {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            CountCyclicPaths_exe ob = new CountCyclicPaths_exe();
            System.out.println(ob.countPaths(N));
        }
    }
}

// } Driver Code Ends