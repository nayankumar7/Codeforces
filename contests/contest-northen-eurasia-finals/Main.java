import java.io.*;
import java.util.*;

public class Main {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        // LOCAL testing shortcut
        if (System.getProperty("ONLINE_JUDGE") == null) {
            fs = new FastScanner(new FileInputStream("input.txt"));
            out = new PrintWriter(new FileOutputStream("output.txt"));
        }

        int t = fs.nextInt(); // number of test cases
        while (t-- > 0) {
            solve();
        }
        out.flush();
    }

    static void solve() {
        // Example problem: sum of two numbers
        int a = fs.nextInt();
        int b = fs.nextInt();
        out.println(a + b);
    }

    // Fast input reader
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        FastScanner() { br = new BufferedReader(new InputStreamReader(System.in)); }
        FastScanner(InputStream is) { br = new BufferedReader(new InputStreamReader(is)); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            try { return br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return null;
        }
    }
}