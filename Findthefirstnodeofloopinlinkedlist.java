
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Node1 {
    int data;
    Node1 next;

    Node1(int x) {
        data = x;
        next = null;
    }
}

public class Findthefirstnodeofloopinlinkedlist {
    static class FastReader {
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

        Long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void makeLoop(Node1 head, Node1 tail, int x) {
        if (x == 0)
            return;

        Node1 curr = head;
        for (int i = 1; i < x; i++)
            curr = curr.next;

        tail.next = curr;
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int num = sc.nextInt();
            Node1 head = new Node1(num);
            Node1 tail = head;

            for (int i = 0; i < n - 1; i++) {
                num = sc.nextInt();
                tail.next = new Node1(num);
                tail = tail.next;
            }

            int pos = sc.nextInt();
            makeLoop(head, tail, pos);
            Findthefirstnodeofloopinlinkedlist_exe x = new Findthefirstnodeofloopinlinkedlist_exe();
            out.println(x.findFirstNode1(head));
        }
        out.flush();
    }
}
// } Driver Code Ends

// User function Template for Java

class Findthefirstnodeofloopinlinkedlist_exe {
    // Function to find first Node1 if the linked list has a loop.
    public static int findFirstNode1(Node1 head) {
        HashSet<Node1> set = new HashSet<>();
        Node1 curr = head;
        while (curr.next != null) {
            if (!set.contains(curr)) {

                set.add(curr);
            } else {

                return curr.data;
            }
            curr = curr.next;
        }
        return -1;

    }
}