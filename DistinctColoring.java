
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class DistinctColoring_exe {
    public static long distinctColoring(int x, int[] r, int[] g, int[] b) {

        long dp[][] = new long[2][4];

        int t, prev = 0, cur = 1;

        for (int i = 0; i < 4; i++)
            dp[0][i] = 0;

        for (int n = 1; n < x + 1; n++) {

            for (int ind = 3; ind >= 0; ind--) {

                if (ind == 1)
                    dp[cur][ind] = Math.min(g[n - 1] + dp[prev][2], b[n - 1] + dp[prev][3]);

                else if (ind == 2)
                    dp[cur][ind] = Math.min(r[n - 1] + dp[prev][1], b[n - 1] + dp[prev][3]);

                else if (ind == 3)
                    dp[cur][ind] = Math.min(r[n - 1] + dp[prev][1], g[n - 1] + dp[prev][2]);

                else
                    dp[cur][ind] = Math.min(r[n - 1] + dp[prev][1],
                            Math.min(g[n - 1] + dp[prev][2], b[n - 1] + dp[prev][3]));

            }

            t = cur;
            cur = prev;
            prev = t;

        }
        return dp[prev][0];

    }

}

// { Driver Code Starts.

public class DistinctColoring {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String input[] = read.readLine().trim().split("\\s+");
            int[] r = new int[N];
            for (int i = 0; i < N; i++)
                r[i] = Integer.parseInt(input[i]);
            input = read.readLine().trim().split("\\s+");
            int[] g = new int[N];
            for (int i = 0; i < N; i++)
                g[i] = Integer.parseInt(input[i]);
            input = read.readLine().trim().split("\\s+");
            int[] b = new int[N];
            for (int i = 0; i < N; i++)
                b[i] = Integer.parseInt(input[i]);

            DistinctColoring_exe ob = new DistinctColoring_exe();
            out.println(ob.distinctColoring(N, r, g, b));
        }
        out.close();
    }
}
// } Driver Code Ends