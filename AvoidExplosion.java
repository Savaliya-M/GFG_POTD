//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;

public class AvoidExplosion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String s[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int mix[][] = new int[n][2];
            int danger[][] = new int[m][2];

            for (int i = 0; i < n; i++) {
                s = br.readLine().trim().split(" ");
                mix[i][0] = Integer.parseInt(s[0]);
                mix[i][1] = Integer.parseInt(s[1]);
            }
            for (int i = 0; i < m; i++) {
                s = br.readLine().trim().split(" ");
                danger[i][0] = Integer.parseInt(s[0]);
                danger[i][1] = Integer.parseInt(s[1]);
            }
            AvoidExplosion_exe soln = new AvoidExplosion_exe();

            ArrayList<String> ans = soln.avoidExlosion(mix, n, danger, m);

            for (String x : ans)
                ot.print(x + " ");
            ot.println();
        }

        ot.close();
    }

}
// Position this line where user code will be pasted.

// } Driver Code Ends

// User function Template for Java

class AvoidExplosion_exe {
    ArrayList<String> avoidExlosion(int mix[][], int n, int danger[][], int m) {
        ans = new ArrayList<>();
        par = new int[n + 1];
        rank = new int[n + 1];
        for (int i = 0; i <= n; i++)
            par[i] = i;
        for (int i = 0; i < mix.length; i++) {
            int x = mix[i][0];
            int y = mix[i][1];
            int px = find(x), py = find(y);
            boolean isexplod = true;
            for (int j = 0; j < danger.length; j++) {
                int a = danger[j][0], b = danger[j][1];
                int pa = find(a), pb = find(b);
                if ((px == pa && py == pb) || (px == pb && py == pa)) {
                    isexplod = false;
                    break;
                }
            }
            if (isexplod)
                union(x, y);
            if (isexplod) {
                ans.add("Yes");
            } else {
                ans.add("No");
            }
        }
        return ans;
    }

    private ArrayList<String> ans;
    private int par[], rank[];

    private void union(int u, int v) {
        u = par[u];
        v = par[v];
        if (rank[u] > rank[v])
            par[v] = u;
        else if (rank[u] < rank[v])
            par[u] = v;
        else {
            par[u] = v;
            rank[v]++;
        }
    }

    private int find(int node) {
        if (par[node] == node)
            return node;
        return par[node] = find(par[node]);
    }
}
