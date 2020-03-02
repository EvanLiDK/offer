package sort;


/**
 * 归并排序，先分成两部分，然后再建立额外数组进行一个个排序
 *
 * 因为一直二分下去，所以排序时间复杂度很稳定为(nlogn)
 */
public class MergeSort {

    public static void main(String[] args) {


        int[] array = new int[]{1, 9, 5, 7, 3, 8, 2};

        mergeSort(array, 0, 6);

        for (int i : array) {
            System.out.print(i + " ");
        }

//        System.out.println(1 >> 1);

    }


    private static void mergeSort(int[] array, int low, int high) {


        if (low >= high) {

            return;
        }
        int mid = low + ((high - low) >> 1);
        mergeSort(array, low, mid);

        mergeSort(array, mid + 1, high);

        merge(array, low, mid, high);

    }

    private static void merge(int[] array, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int tempId = 0;
        while (i <= mid && j <= high) {
            if (array[i] <= array[j]) {
                temp[tempId++] = array[i++];
            } else {
                temp[tempId++] = array[j++];
            }
        }

        while (i <= mid) {
            temp[tempId++] = array[i++];

        }

        while (j <= high) {
            temp[tempId++] = array[j++];
        }

        for (int m = 0; m < temp.length; m++) {
            array[low+m] = temp[m];
        }
    }

}
