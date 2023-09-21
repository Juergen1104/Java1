package Michelle_1.MergeSort;


import java.util.Arrays;

class MergeSort {

    public static int[] merge(int[] lHalf, int[] rHalf) {

        int[] merged = new int[lHalf.length + rHalf.length];
        int lIndex, rIndex = lIndex = 0;

        for (int i = 0; i < merged.length; i++) {
            if (lIndex >= lHalf.length) {
                merged[i] = rHalf[rIndex++];

            } else if (rIndex >= rHalf.length) {
                merged[i] = lHalf[lIndex++];

            } else if (lHalf[lIndex] <= rHalf[rIndex]) {
                merged[i] = lHalf[lIndex++];

            } else {
                merged[i] = rHalf[rIndex++];
            }
        }
        return merged;
    }


    public static int[] mergeSort(int[] toSort) {
        if (toSort.length == 1) {
            return toSort;
        } else {
            int[] lHalf = new int[toSort.length / 2];
            System.arraycopy(toSort, 0, lHalf, 0, lHalf.length);

            int[] rHalf = new int[toSort.length - lHalf.length];
            System.arraycopy(toSort, lHalf.length, rHalf, 0, rHalf.length);

            int[] lHalfMergeSorted = mergeSort(lHalf);
            int[] rHalfMergeSorted = mergeSort(rHalf);
            return merge(rHalfMergeSorted, lHalfMergeSorted);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 7};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

}


