//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Lengthofthelongestsubarray {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine().trim());
            int arr[] = new int[n];
            String s[] = in.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(s[i]);

            out.println(new Lengthofthelongestsubarray_exe().maxLength(arr, n));
        }
        out.close();
    }
}
// } Driver Code Ends

// User function Template for Java

class Lengthofthelongestsubarray_exe {

    int maxLength(int arr[], int n) {
        // code here
        int neg_found = -1, zero_found = -1, neg = 0, max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                neg++;
                if (neg_found == -1)
                    neg_found = i;
            }
            if (arr[i] == 0) {
                zero_found = i;
                neg_found = -1; // products will be 0
                neg = 0; // reset!
            }
            if (neg % 2 == 0) {
                max = Math.max(i - zero_found, max);
            } else
                max = Math.max(i - neg_found, max);
        }
        return max;
    }

}