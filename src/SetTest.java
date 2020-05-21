import java.util.*;

public class SetTest {


    public static void main(String[] args) {

        int[] a = {-1};//, 2, -3, -4, -3, -5};

        int[] dp = new int[a.length+1];

        if(a.length == 1) {
            System.out.println(a[0]);
            return;
        }

        if(a.length == 2) {
            System.out.println(a[0] > a[1] ? a[0] : a[1]);
            return;
        }

        dp[0] = a[0];
        dp[1] = a[0]+a[1] > a[1] ? a[0]+a[1] : a[1];

        for(int i=2; i<a.length ; i++) {
            dp[i] = dp[i-1] > dp[i-2] + a[i] ? dp[i-1] : dp[i-2] + a[i];
        }

        System.out.println(dp[a.length-1]);

    }

}



