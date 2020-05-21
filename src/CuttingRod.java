/*length   | 1   2   3   4   5   6   7   8
--------------------------------------------
price    | 1   5   8   9  10  17  17  20
*/

public class CuttingRod {


    /*public int maxPrice(int[] rods, int[] price, int i) {
        //if()
    }
*/
    public static void main(String[] args) {
        int[] rodLengths = {1,2,3,4,5,6,7,8};
        int[] price = {1,5,8,9,10,17,17,20};
        int rod = 8;

        /*int dp[] = new int[rodLengths.length + 1];
        dp[0] = 0;
        dp[1] = price[0];

        for(int i=1; i <= rodLengths.length; i++) {

        }

        price = */

        /*int maxPrice = 0;
        int curPrice = 0;

        for(int i = 0; i < rodLengths.length; i++) {
            for (int j = i+1; j < rodLengths.length; j++) {
                System.out.println(rodLengths[i] + ", " + rodLengths[j]);
                if(rodLengths[i] + rodLengths[j] == rod)
                    curPrice = price[i] + price[j];
                if(curPrice > maxPrice)
                    maxPrice = curPrice;
            }
        }
        System.out.println(maxPrice);*/
    }
}
