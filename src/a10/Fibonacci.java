package a10;


/**
 * 求斐波那契数列的第一项
 */
public class Fibonacci {

    public static void main(String[] args) {

//        System.out.println(getElem(100));
        System.out.println(getElem2(0,1,2,21));
    }

    /**
     * 普通递归解法
     * <p>
     * 这种解法有大量的重复计算
     *
     * @param n
     * @return
     */
    private static int getElem(int n) {
        if (n == 0) {
            return 0;

        } else if (n == 1) {
            return 1;
        }

        return getElem(n - 1) + getElem(n - 2);

    }

    /**
     * 按顺序求先求第一个值，然后第二个，第三个，依旧是递归
     * @param pre
     * @param after
     * @param n
     * @param targetNum
     * @return
     */

    private static int getElem2(int pre, int after, int n, int targetNum) {

        if (targetNum == 0) {
            return 0;
        } else if (targetNum == 1) {
            return 1;
        }

        int result = pre + after;
        if (n == targetNum) {
            return result;
        }
        return getElem2(after,result,n+1,targetNum);

    }
}
