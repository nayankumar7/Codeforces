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

public class Problem2{
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
            int [] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = fs.nextInt();
            }
            solve(arr, n);
        }
    }


    public static void solve(int[] arr, int n){
        int maxNum[] = new int [n];int p=0, q = 0;
        for(int i = 0; i < n; i++){
            p = i -1;
            q = i + 1;
            int val = 0;
            if(p>-1){
                val += (arr[p]>arr[i])? arr[p]-arr[i]:arr[i]-arr[p];
            }
            if(q<n){
                val += (arr[q]>arr[i])? arr[q]-arr[i]:arr[i]-arr[q];
            }
            maxNum[i] = val;
        }
        int maxval = Integer.MIN_VALUE;int mvidx=-1;int j = 0;
        for(int ni: maxNum){
            if(ni>maxval){
                maxval = ni;
                mvidx = j;
            }
            j++;
        }
        int m = n;
        if(mvidx != -1)m -= 1;
        int [] remArr = new int [m];
        for(int kk=0, k = 0; kk<m; kk++, k++){
            if(mvidx!=-1 && mvidx == k){
                kk--;
            }else{
                remArr[kk]= arr[k];
            }
        }
        int ans = 0;
        for(int we = 1; we < m; we++){
            ans += (remArr[we]>remArr[we-1])?remArr[we]-remArr[we-1]:remArr[we-1]-remArr[we];
            
        }
        System.out.println(ans);

    }

}