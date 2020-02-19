package a04;

/**
 * 面试题4:二维数组中的查找
 * 题目:在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的个二维数组和一个整数，判断数组中是否含有该整数。
 *
 *
 * 根据顺序找出一排一列，直接找到这排这列的交叉点为止
 */
public class SearchArray {


    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};

        System.out.println(find(18, array));


    }


    private static boolean find(int target, int[][] array) {
        int row = 0, line = 0;


        if (array[0][0] == target) {
            return true;
        }
        while (line <= array[0].length - 1 && array[0][line] <= target) {
            if (array[0][line] == target) {
                return true;
            }
            line++;
        }

        while (row <= array.length - 1 && array[row][0] <= target) {
            if (array[row][0] == target) {
                return true;
            }
            row++;
        }

        line--;
        row--;

        for (int i = 1; i <= row; i++) {
            if (array[line][i] == target) {
                return true;
            }
        }

        for (int i = 1; i < line; i++) {
            if (array[i][row] == target) {
                return true;
            }
        }
        return false;

    }

}
