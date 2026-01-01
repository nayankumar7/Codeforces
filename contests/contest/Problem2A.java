
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

public class Problem2A {
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
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();
            }
            int max = arr[0];
            int p = 0;
            for (int ii = 1; ii < n; ii++) {
                if (max < arr[ii]) {
                    max = arr[ii];
                    p = ii;
                }
            }

            int ans = 0, ri = 0, src = 0, dest = 0;
            for (int we = 0; we < n; we++) {
                if(p==we){

                }else{
                    if(ri==0){
                        src = arr[we];
                        ri++;
                    }else{
                        if(ri>1){
                            src = dest;
                        }
                        dest = arr[we];
                        ans += (dest>src)?dest-src:src-dest;
                        ri++;
                    }
                }
                // ans += (arr[ri] > arr[ri - 1]) ? arr[ri] - arr[ri- 1] : arr[ri- 1] - arr[ri];

            }
            System.out.println(ans);


        }
    }



}