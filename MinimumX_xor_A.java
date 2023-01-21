import java.util.*;
import java.io.*;
import java.lang.*;

public class MinimumX_xor_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {

            int a = Integer.parseInt(br.readLine().trim());
            int b = Integer.parseInt(br.readLine().trim());

            MinimumX_xor_A_exe ob = new MinimumX_xor_A_exe();
            out.println(ob.minVal(a, b));
        }
        out.flush();
    }
}

class MinimumX_xor_A_exe {
    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = (n & (n - 1));
            count++;
        }
        return count;
    }

    public static int minVal(int a, int b) {
        int setBits = countSetBits(b);
        int ans = 0;
        for (int i = 30; i >= 0; i--) {
            int mask = (1 << i);
            if ((mask & a) > 0 && setBits > 0) {
                ans = ans | mask;
                setBits--;
            }
        }
        int i = 0;
        while (setBits > 0) {
            int mask = (1 << i);
            if ((mask & ans) == 0) {
                ans = ans | mask;
                setBits--;
            }
            i++;
        }
        return ans;
    }
}