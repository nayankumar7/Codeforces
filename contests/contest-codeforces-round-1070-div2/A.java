import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            ArrayList<Integer> val = new ArrayList<>();
            int ans = 0;
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                val.add(sc.nextInt());
            }
            for(int k = 0; k<val.size(); k++){
                int ck = val.get(k);
                for(int l = 1+k; l<val.size();l++){
                    if(ck>val.get(l)){
                        ans++;
                        val.remove(l);
                        l--;

                    }
                }
            }
            System.out.println(ans);

        }
    }
}