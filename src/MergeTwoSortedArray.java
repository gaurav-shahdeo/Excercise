public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,13,14,15};
        int[] arr2 = {2,4,6,8,9,10};
        int[] mergedArray = new int[arr1.length + arr2.length];

        int index1 = 0, index2 = 0, index3 = 0;

        while(index1 < arr1.length && index2 < arr2.length) {
            if(arr1[index1] < arr2[index2])
                mergedArray[index3++] = arr1[index1++];
            else mergedArray[index3++] = arr2[index2++];
        }
        if(index1 < arr1.length)
            while (index1 < arr1.length)
                mergedArray[index3++] = arr1[index1++];

        if(index2 < arr2.length)
            while (index2 < arr2.length)
                mergedArray[index3++] = arr2[index2++];

        for(int i=0; i<mergedArray.length; i++)
            System.out.print(mergedArray[i] + " ");
    }
}
