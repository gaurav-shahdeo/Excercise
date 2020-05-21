public class Subset0 {

    public static void main(String[] args) {
        int n=7;
        int k=3;

        int totalPartitions = 0;
        for(int i=0; i<=n; i++) {
            int exactPartition = subset(i, k);
            System.out.println("Number ways to partition" + n + "into non-zero and 			exact" +  i +  "parts is" +  exactPartition);

            totalPartitions = totalPartitions + exactPartition;
        }
        System.out.println(subset(7,3));

    }
    public static int subset(int n, int k) {
        if(n-k < k) return 1;
        else if(k == 0) return(0);
        else if(k == 1) return(1);
        return subset(n-1, k-1) + (n-1) * subset(n-1,k) ;

    }
}



