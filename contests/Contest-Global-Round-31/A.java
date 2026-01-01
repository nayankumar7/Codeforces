import java.util.Scanner;

public class A {
    static Scanner fs ;
    public static void main(String[] args) {
        fs = new Scanner(System.in);
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
