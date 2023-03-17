//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class NumberofSubarraysof0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while (test-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            String[] str = br.readLine().trim().split(" ");
            for (int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(str[i]);
            NumberofSubarraysof0_exe obj = new NumberofSubarraysof0_exe();
            System.out.println(obj.no_of_subarrays(N, arr));
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class NumberofSubarraysof0_exe {
    long no_of_subarrays(int N, int[] arr) {
        // Write your code here
        long ans = 0;
        long cnt = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 0)
                cnt++;
            else {
                ans += (cnt + 1) * cnt / 2;
                cnt = 0;
            }
        }
        ans += (cnt + 1) * cnt / 2;
        return ans;
    }
}