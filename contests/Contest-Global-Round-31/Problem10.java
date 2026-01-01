// Author : - Nayan Kumar Vishwakarma
/*
Problem : -

*/
/*
Hint and Discation : - 

*/
/*
Solution : - 


*/
import java.io.*;
import java.util.*;

public class Problem10{
    static FastScanner fs;
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
    public static void main(String[] args) throws Exception {
        File fin = new File("input.txt");
        if (fin.exists()) {
            fs = new FastScanner(new FileInputStream(fin));
        } else {
            fs = new FastScanner(System.in);
        }

        int t = fs.nextInt();// t = fs.nextInt();
        // problem - a
        while (t-- > 0) {
            int l = fs.nextInt();
            int a = fs.nextInt();
            int b = fs.nextInt();
            solve(l, a, b);
        }
    }


    public static void solve(int l, int a , int b){
        int ans = 0;
        for( int i = 1; i < l ; i++){
            ans = Math.max(ans, (a+(i*b))%l);
        }
        System.out.println(ans);
    }

}