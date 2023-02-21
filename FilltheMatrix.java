
//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class FilltheMatrix_exe {
    public static int minIteration(int N, int M, int x, int y) {
        int top = x - 1, down = N - x;
        int left = y - 1, right = M - y;
        return Math.max(top + left, Math.max(top + right, Math.max(down + left, down + right)));
    }
}

// { Driver Code Starts.

class FilltheMatrix {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String input[] = read.readLine().trim().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            input = read.readLine().trim().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            FilltheMatrix_exe ob = new FilltheMatrix_exe();
            System.out.println(ob.minIteration(N, M, x, y));
        }

    }
}
// } Driver Code Ends