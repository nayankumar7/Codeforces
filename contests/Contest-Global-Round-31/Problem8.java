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

public class Problem8{
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
        
        while (t-- > 0) {
            int n = fs.nextInt();
            int k = fs.nextInt();
            solve(n, k);
        }
    }


    public static void solve(int a , int b){
        if(b%2==1){
            for(int i = 0; i < b; i++){
                System.out.println(a);
            }
        }else{
            System.out.println(0);
            for(int i = 1; i < b; i++){
                System.out.println(a);
            }
        }
    }

}