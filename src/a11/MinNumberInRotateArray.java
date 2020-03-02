package a11;

/**
 * 面试题11:  旋转数组的最小数字
 * <p>
 * 题目:把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例
 * 如，数组{3, 4, 5, 1,2}为{1, 2, 3,4, 5}的一个旋转，该数组的最小值为1。
 * <p>
 * <p>
 * 利用旋转特性，如果最大值大于最小值，那么肯定不在这一半，反之就分成两部分递归。result没结果就输出数组第一位。
 */
public class MinNumberInRotateArray {

    public static int result = -1;

    public static void main(String[] args) {

        int[] array = new int[]{1, 2,3, 4,5};

        getMin(array, 0, 4);

        System.out.println(result == -1 ? array[0] : result);

    }

    private static void getMin(int[] array, int low, int high) {


        if (low == high) {
            result = array[low];
            return;
        }

        if (high - low == 1) {
            if (array[low] < array[high]) {
                result = array[low];
            }
            return;
        }

        if (array[high] > array[low]) {
            return;
        }


        int mid = low + ((high - low)) >> 1;
        if(array[low]<array[mid]){
            getMin(array, mid+1, high);
        }else{
            getMin(array,low+1,mid);
        }

    }
}
