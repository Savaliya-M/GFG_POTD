//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

public class BalloonEverywhere {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s = br.readLine().trim();
            BalloonEverywhere_exe ob = new BalloonEverywhere_exe();
            int ans = ob.maxInstance(s);
            out.println(ans);
        }
        out.close();
    }
}
// } Driver Code Ends

// User function Template for Java

class BalloonEverywhere_exe {
    public int maxInstance(String s) {
        // Code here
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'b' || ch == '0' || ch == 'l' || ch == 'o' || ch == 'n') {
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }
        }

        if (map.get('l') != null) {
            map.put('l', map.get('l') / 2);
        }
        if (map.get('o') != null) {
            map.put('o', map.get('o') / 2);
        }
        Collection<Integer> countlist = map.values();
        return countlist.stream().min(Integer::compare).get();
    }
}