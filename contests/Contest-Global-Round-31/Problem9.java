
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

public class Problem9 {
    static FastScanner fs;

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }

        FastScanner(FileInputStream fis) {
            br = new BufferedReader(new InputStreamReader(fis));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = br.readLine();
                    if (line == null)
                        return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
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

        while (t-- > 0) {
            int n = fs.nextInt();

            solve(n);
        }
    }

    public static void solve(int n) {
        String ans = "";
        boolean a = true;
        for(int i = 0; i < n; i++){
            if(ans.length()==0){
                ans += fs.next();
            }else{
                ans = check(ans, fs.next());
            }
        }
        System.out.println(ans);
    }
    public static String check(String ans, String s){
        for(int i = 0; i<((ans.length()<s.length())? ans.length():s.length());i++){
            if(ans.charAt(i)>s.charAt(i)){
                return s+ans;
            }else if(ans.charAt(i)<s.charAt(i)){
                return ans+s;
            }
        }

        return ans+s;
    }

}