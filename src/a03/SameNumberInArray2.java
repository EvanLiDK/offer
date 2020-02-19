package a03;

/**
 * 题目二:不修改数组找出重复的数字。
 * 在一个长度为n+1的数组里的所有数字都在1~n的范围内，
 * 所以数组中至少有一个数字是重复的。请找出数组中任意一个重复的数字，但不能修改输入的数组。
 * 例如，如果输入长度为8的数组{2,3,5,4,3,2,6,7}，那么对应的输出是重复的数字2或者3。
 * <p>
 * <p>
 * 这题建立一个辅助数组其实很简单之所以把他也放上来，理由是考虑空间复杂度为O1的情况
 * <p>
 * 利用一种特殊的二分法，总数大于m/2的即重复数字在这一组，然后分成m/4,以此类推
 * <p>
 * 尽量不用递归，因为递归会因为其递归深度占用空间复杂度
 */
public class SameNumberInArray2 {

    public static void main(String[] args) {

        int[] array = new int[]{2, 3, 5, 4, 3, 2, 6, 7};
        System.out.println(duplication(array));
    }

    private static int duplication(int[] array) {



        return 1;
    }
}
