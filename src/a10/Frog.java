package a10;

/**
 * 青蛙跳台问题，青蛙一次可以跳一个或者两个台阶，跳上n阶台阶有多少种算法
 *
 * 递归解法太难算了，其实是斐波那契数列，跳F(n)=F(n-2)+F(n-1)
 */
public class Frog {

    private static int i = 0;

    public static void main(String[] args) {
        cal(0,20);
        System.out.println(i);
    }

    public static void cal(int step, int target) {
        if (target == 1) {
            i++;
            return;
        }

        if (step > target)
            return;

        if (step == target){
            i++;
            return;
        }

        cal(step + 1, target);
        cal(step + 2, target);



    }
}
