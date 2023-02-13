//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class ArithmeticNumber {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String arr[] = in.readLine().trim().split("\\s+");
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);
            int C = Integer.parseInt(arr[2]);

            ArithmeticNumber_exe ob = new ArithmeticNumber_exe();
            out.println(ob.inSequence(A, B, C));
        }
        out.close();
    }
}
// } Driver Code Ends

// User function Template for Java

class ArithmeticNumber_exe {
    static int inSequence(int A, int B, int C) {
        // code here
        return ((A == B) || ((C != 0) && (B - A) % C == 0 && (B - A) / C > 0)) ? 1 : 0;
    }
}