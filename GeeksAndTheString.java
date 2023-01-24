
//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GeeksAndTheString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            GeeksAndTheString_exe obj = new GeeksAndTheString_exe();
            String res = obj.removePair(s);

            System.out.println(res);

        }
    }
}

// } Driver Code Ends

class GeeksAndTheString_exe {
    public static String removePair(String s) {
        // code here
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (stk.size() == 0) {
                stk.push(ch);
            }

            else if (stk.peek() == ch) {
                stk.pop();
            } else {
                stk.push(ch);
            }
        }

        StringBuilder str = new StringBuilder();

        if (stk.size() == 0) {
            str.append("-1");
            return str.toString();
        }

        while (stk.size() > 0) {
            str.append(stk.pop());
        }

        return str.reverse().toString();
    }
}
