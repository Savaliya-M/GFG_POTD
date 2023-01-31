
//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class ubstringofit {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A = read.readLine();
            String B = read.readLine();

            ubstringofit_exe ob = new ubstringofit_exe();
            out.println(ob.minRepeats(A, B));
        }
        out.close();
    }
}
// } Driver Code Ends

// User function Template for Java

class ubstringofit_exe {

    static int minRepeats(String A, String B) {

        // code here

        StringBuilder sb = new StringBuilder();

        sb.append(A);

        int ans = 1;

        // to generate a string whose size is greater than B;

        while (sb.length() < B.length())

        {

            sb.append(A);

            ans++;

        }

        // generate the string while you do not find the substring and

        // for safety generate the string 2 time the B length to cover all cases

        while (((sb.toString()).indexOf(B)) == -1 && sb.length() < (2 * B.length()))

        {

            sb.append(A);

            ans++;

        }

        if ((sb.toString()).indexOf(B) != -1)
            return ans;

        return -1;

    }

};