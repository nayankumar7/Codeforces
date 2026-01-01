import java.util.Scanner;

public class Solve1 {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }

    }

    public static void solve() {
        String s = sc.next();
        int n = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'N') {
                n++;
            } else {
                y++;
            }
        }
        if (n >= y || y == 0) {
            System.out.println("Yes");
        } else if (n == 0 || y > n) {
            System.out.println("No");
        }
    }
}
