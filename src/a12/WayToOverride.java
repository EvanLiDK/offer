package a12;


import java.util.HashMap;

/**
 * 面试题12:矩阵中的路径
 * <p>
 * 题目:请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一一格开始，每一步可以在矩阵中向左、右、上、下移动一 格。
 * 如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。
 */
public class WayToOverride {


    public static boolean flag = false;

    public static void main(String[] args) {

        Character[][] array = new Character[][]{{'a', 'b', 't', 'g'}, {'c', 'f', 'c', 's'}, {'i', 'd', 'c', 'h'}};
        HashMap<String, Integer> map = new HashMap();
        getPath(array, 0, 0, 0, "bfcd", map);
        System.out.println(flag);
    }

    /**
     *
     * @param array 需要回溯的数组
     * @param num  遍历到第几个字符
     * @param row  行数，与列数组成坐标
     * @param line  列数，与行数组成坐标
     * @param target 目标路径
     * @param map    已遍历的坐标
     */
    private static void getPath(Character[][] array, int num, int row, int line, String target, HashMap<String, Integer> map) {

        if (num >= target.length()) {
            flag = true;
            return;
        }

        boolean ifBack = map.get(row + "" + line) != null || row > array.length - 1 || line > array[0].length - 1 || row < 0 || line < 0;
        if (ifBack) {
            return;
        }

        Character goal = target.charAt(num);
        if (array[row][line] == goal) {

            num++;
        }

        map.put(row + "" + line, 1);
        HashMap newMap = new HashMap<String, Integer>();
        newMap.putAll(map);

        getPath(array, num, row - 1, line, target, newMap);
        getPath(array, num, row + 1, line, target, newMap);
        getPath(array, num, row, line - 1, target, newMap);
        getPath(array, num, row, line + 1, target, newMap);


    }
}
