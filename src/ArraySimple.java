public class ArraySimple {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -10, 2, 3, 5, 2};

        for(int i=0; i<arr.length; i++) {
            if(arr[i] < 0) {
                int sum = arr[i];
                while (sum < 0 && i<arr.length) {
                    arr[i] = -1;
                    sum += arr[++i];
                }

            }
        }

        for(int i=0; i<arr.length; i++) System.out.println(arr[i]);
    }
}
