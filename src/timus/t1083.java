package timus;

import java.io.*;
import java.util.*;

public class t1083 {
    public static void main(String[] args) throws IOException {
        try {
            if (new File("input.txt").exists())
                System.setIn(new FileInputStream("input.txt"));
        } catch (SecurityException e) {}

        new t1083().run();
    }

    BufferedReader in;
    StringTokenizer st = new StringTokenizer("");

    void run() throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(fac(nextInt(), nextToken().length()));
    }

    int fac(int n, int k) {
        if (n <= 0) return 1;
        return n * fac(n - k, k);
    }

    String nextToken() throws IOException {
        while (!st.hasMoreTokens())
            st = new StringTokenizer(in.readLine());
        return st.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }
}