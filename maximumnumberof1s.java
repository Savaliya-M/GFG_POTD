//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    Integer nextInt() {
        return Integer.parseInt(next());
    }
}

class maximumnumberof1s {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int B = sc.nextInt();
            int arr[][] = new int[B][B];
            for (int i = 0; i < B; i++) {
                for (int j = 0; j < B; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            maximumnumberof1s_exe obj = new maximumnumberof1s_exe();
            int ans[] = obj.findMaxRow(arr, B);
            for (int i = 0; i < 2; i++) {
                out.print(ans[i] + " ");
            }
            out.println();
        }
        out.flush();
    }
}
// } Driver Code Ends

// User function Template for Java

class maximumnumberof1s_exe {
    public int[] findMaxRow(int mat[][], int N) {
        // code here

        int[] arr = new int[2];
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            if (arr[1] < count) {
                arr[0] = i;
                arr[1] = count;
            }
        }
        return arr;
    }
};