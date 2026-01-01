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

public class Problem1{
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

        int t = fs.nextInt();
        
        while (t-- > 0) {
            solve();
        }
    }


    public static void solve(){
        String s = fs.next();int n = 0; int y = 0;
        for(int i = 0; i < s.length(); i++ ){
            if(s.charAt(i)=='N'){
                n++;
            }else{
                y++;
            }
        }
        if(n>=y|| y==0){
            System.out.println("Yes");
        }else if(n==0|| y>n){
            System.out.println("No");
        }
    }

}