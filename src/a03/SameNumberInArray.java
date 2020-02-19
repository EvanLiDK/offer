package a03;

/**
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的，
 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 */
public class SameNumberInArray {

    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 1, 0, 2, 3,5};
        System.out.println(repeNum1(array));
    }


    /**
     * 解法一，格外建立了一个数组，空间复杂度为n
     *
     * @param array
     * @return
     */
    private static int repeNum1(int[] array) {

        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {

            if (temp[array[i]] == 1) {
                return array[i];
            } else {
                temp[array[i]]++;
            }
        }
        return array.length;
    }


    /**
     * 在同一个数组上操作时间复杂度为n,空间复杂度为1
     *
     * @param array
     * @return
     */
    private static int repeNum2(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if(array[array[i]]==array[i] && i!=array[i]){
                return array[i];
            }else{
                array[array[i]]=array[i];
            }
        }

        return array.length;
    }

}
