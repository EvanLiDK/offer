package sort;

/**
 * 快速排序
 * <p>
 * <p>
 * 简单的来说就是把比基准值小的放左边，比基准值大的放右边，基准值放中间，两边递归
 * <p>
 * 比较简单的办法是，从右往左找比基准值小的，从左往右找比基准值大的，都找到了就互换，
 * 之所以先从右往左是因为后面可以直接把最小值和基准值互换位置，因为最小值一定比基准值小
 *
 *
 * 这种算法时间复杂度取决于基准值的选取，最差On2,最优Onlogn,所以稳定性差，由于没有使用额外空间，空间复杂度O(1)
 */
public class QuickSort {
    public static void main(String[] args) {

        int[] array = new int[]{1, 9, 7, 3, 5, 19};
        quickSort(array, 0, 5);
        for (int i : array) {
            System.out.print(i + " ");
        }

    }


    private static void quickSort(int[] array, int low, int high) {

        if (low >= high) {
            return;
        }

        int small = low;//储存最小下标
        int large = high;//储存最大下标

        int comp = array[low];//标准值

        while (low < high) {
            while (array[high] > comp && low < high) {
                high--;
            }
            while (array[low] <= comp && low < high) {
                low++;
            }

            //把找到的比标准值大的比标准值小的交换位置
            if (low < high) {

                int temp = array[low];
                array[low] = array[high];
                array[high] = temp;
            }


        }

        //把标准值一到中间
        array[small] = array[low];
        array[low] = comp;

        quickSort(array, small, low - 1);
        quickSort(array, low + 1, large);


    }
}
