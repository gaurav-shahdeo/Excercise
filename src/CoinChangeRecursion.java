public class CoinChangeRecursion {

    public static void main(String[] args) {
        int[] denomination = {1,2,3};
        int n = 10;
        coinChange(denomination, 3, n);
    }

    private static void coinChange(int[] denomination, int m, int n) {

        int[] table = new int[n+1];
        table[0] = 1;

        for(int i=0; i<m;i++) {
            for(int j=denomination[i]; j<=n; j++) {
                table[j] += table[j-denomination[i]];
            }
        }

        for(int i=0; i<=n; i++) {
            System.out.print(table[i] + ",");
        }

        System.out.println(table[n]);
    }
}
