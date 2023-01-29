
//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Minoperations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int a;
            a = Integer.parseInt(br.readLine());

            int b;
            b = Integer.parseInt(br.readLine());

            Minoperations_exe obj = new Minoperations_exe();
            int res = obj.solve(a, b);

            out.println(res);

        }
        out.close();
    }
}

// } Driver Code Ends

class Minoperations_exe {
    public static int solve(int a, int b) {
        // code here
        if (a == b)
            return 0;
        if ((a & b) == Math.min(a, b)) {
            return 1;
        }
        return 2;

    }
}
