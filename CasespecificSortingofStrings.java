//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// } Driver Code Ends
//User function Template for Java

public class CasespecificSortingofStrings {
    // Function to perform case-specific sorting of strings.
    public static String caseSort(String str) {
        int[] upper = new int[26];
        int[] lower = new int[26];
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z')
                lower[ch - 'a']++;
            else
                upper[ch - 'A']++;
        }
        StringBuilder sb = new StringBuilder();
        int l = 0, u = 0;
        for (char ch : str.toCharArray()) {
            while (l < 26 && lower[l] <= 0)
                l++;
            while (u < 26 && upper[u] <= 0)
                u++;
            if (ch >= 'a' && ch <= 'z') {
                sb.append((char) (l + 'a'));
                lower[l]--;
            } else {
                sb.append((char) (u + 'A'));
                upper[u]--;
            }
        }
        return sb.toString();
    }
}

// { Driver Code Starts.

class CasespecificSortingofStrings_exe {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(System.out);
            String[] words = br.readLine().split("\\s+");
            int numTestCases = Integer.parseInt(words[0]);

            for (int tIdx = 0; tIdx < numTestCases; tIdx++) {
                words = br.readLine().split("\\s+");
                int size = Integer.parseInt(words[0]);
                String str = br.readLine();
                String sortedStr = new CasespecificSortingofStrings().caseSort(str);
                out.println(sortedStr);
            }
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
// } Driver Code Ends