import java.util.Arrays;

public class NumSquares {

    public static void main(String[] args) {
        int n = 12;

        int[] squares = new int[n];
        int index = 1;
        for(; index*index<=n; index++) {
            squares[index] = index*index;
        }

        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 1;
        for(int i = 1; i < index ; i++) {
            for(int j = squares[i]; j <= n; j++) {
                dp[j] = Math.min(dp[j-squares[i]] + 1, dp[j]);
            }
        }
        System.out.println( dp[n]);
    }
}



