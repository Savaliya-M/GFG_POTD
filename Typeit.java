//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Typeit {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String s = read.readLine().trim();
            Typeit_exe ob = new Typeit_exe();
            int ans = ob.minOperation(s);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends

// User function Template for Java

class Typeit_exe {
    int minOperation(String s) {
        // code here
        int ans = s.length();
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.substring(0, i + 1).equals(s.substring(i + 1, i + i + 2)))
                ans = s.length() - i;
        }
        return ans;
    }
}