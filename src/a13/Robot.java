package a13;


import java.util.HashMap;

/**
 * 面试题13:机器人的运动范围
 * 题目:地上有一个m行n列的方格。
 * 一个机器人从坐标(0, 0)的格子开始移动，它每次可以向左、右、上、下移动一格，
 * 但不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格(35,37)，因为3+5+3+7-18。
 * 但它不能进入方格(35, 38)，因为3+5+3+8=19.请问该机器人能够到达多少个格子?
 */
public class Robot {

    private static int num = 0;

    public static void main(String[] args) {

    }

    private static void getMight(int[][] array, int row, int line, HashMap<String, Integer> map, int k) {

        boolean isExist = map.get(row + "" + line) == 1;

        boolean call = canArrive(row, line, k) || isExist || row < 0 || line < 0 || row > array.length || line > array[0].length;
        if (call)
            return;
        map.put(row + "" + line, 1);

        HashMap<String, Integer> newMap = new HashMap<>();
        newMap.putAll(map);
        num++;
        getMight(array, row - 1, line, map, k);
        getMight(array, row + 1, line, map, k);
        getMight(array, row, line - 1, map, k);
        getMight(array, row, line + 1, map, k);

    }

    private static boolean canArrive(int row, int line, int k) {
        int calculate = 0;
        while (row > 0) {
            calculate += row % 10;
            if (calculate > k)
                return false;
        }
        while (line > 0) {
            calculate += line % 10;
            if (calculate > k)
                return false;
        }

        return calculate < k;
    }
}
