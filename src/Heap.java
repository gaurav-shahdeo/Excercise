public class Heap {

    public static void main(String[] args) {
        int[] input = {9, 4, 6, 2, 8, 7};

        int[] minHeap = buildMinHeap(input);
        display(minHeap, "Min Heap : " );

        System.out.println("Min is : " + getMin(minHeap));

        minHeap = deleteFromMinHeap(minHeap);
        display(minHeap, "After Deletion : ");

        int[] maxHeap = buildMaxHeap(input);
        display(maxHeap, "Max Heap : ");

        System.out.println("Max is : " + getMax(maxHeap));
    }

    private static int[] buildMinHeap(int[] input) {
        int[] minHeap = new int[input.length + 1];
        int k = 1;

        for (int i = 0; i < input.length; i++) {
            minHeap[k] = input[i];
            swim(minHeap, k, true);
            k++;
        }
        return minHeap;
    }

    private static int getMin(int[] minHeap) {
        return minHeap[1];
    }

    private static int[] deleteFromMinHeap(int[] minHeap) {
        int deletedElement = minHeap[1];
        System.out.println("Deleted Element : " + deletedElement);
        int size = minHeap.length;
        minHeap[1] = minHeap[size - 1];
        sink(minHeap, 1);
        return minHeap;
    }

    private static void swim(int[] minHeap, int k, boolean isMinHeap) {
        while (k > 1 && less(minHeap, k / 2, k)) {
            exchange(minHeap, k, k/2);
            k = k / 2;
        }
    }

    private static void sink(int[] minHeap, int k) {

        while (2 * k <= minHeap.length) {
            int j = 2 * k;
            if (j < minHeap.length && less(minHeap, j, j + 1)) j++;
            if(!less(minHeap, k, j))
            exchange(minHeap, k, j);
            k=j;
        }
    }

    private static void exchange(int[] minHeap, int x,  int y) {
        int temp = minHeap[x];
        minHeap[x] = minHeap[y];
        minHeap[y] = temp;
    }

    private static boolean less(int[] minHeap, int x, int y) {
        return minHeap[x] > minHeap[y];
    }


    private static int[] buildMaxHeap(int[] input) {
        int[] maxHeap = new int[input.length + 1];
        int k = 1;
        for (int i = 0; i < input.length; i++) {
            maxHeap[k] = input[i];
            swim(maxHeap, k, false);
            k++;
        }
        return maxHeap;
    }

    private static int getMax(int[] maxHeap) {
        return maxHeap[1];
    }


    private static void display(int[] input, String message) {
        System.out.print(message);
        System.out.print("[");
        for (int i = 1; i < input.length; i++)
            System.out.print(i != input.length - 1 ? input[i] + "," : input[i]);
        System.out.println("]");
    }


}
