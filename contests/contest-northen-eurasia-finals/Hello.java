import java.io.*;
import java.util.*;

public class Hello {
    static FastScanner fs;
    static PrintWriter out;

    public static void main(String[] args) throws Exception {
        // Safe local testing: only use files if they actually exist
        File fin = new File("input.txt");
        File fout = new File("output.txt");
        if (fin.exists()) {
            fs = new FastScanner(new FileInputStream(fin));
            out = new PrintWriter(new FileOutputStream(fout));
        } else {
            fs = new FastScanner(System.in);
            out = new PrintWriter(System.out);
        }

        int t = 1; // set default = 1, change if problem gives T
        // If problem starts with T, uncomment next line:
        // t = fs.nextInt();

        while (t-- > 0) {
            solve();
        }
        out.flush();
    }

    static void solve() {
        // TODO: problem-specific logic
        // Example:
        int a = fs.nextInt();
        int b = fs.nextInt();
        out.println(a + b);
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        FastScanner(InputStream is) { br = new BufferedReader(new InputStreamReader(is)); }
        FastScanner(FileInputStream fis) { br = new BufferedReader(new InputStreamReader(fis)); }
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) { throw new RuntimeException(e); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            try { return br.readLine(); }
            catch (IOException e) { throw new RuntimeException(e); }
        }
    }
}