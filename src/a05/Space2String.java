package a05;


/**
 * 面试题5:替换空格
 * 题目:请实现一个函数，把字符串中的每个空格替换成"%20”。
 * 例如，输入“We are happy."， 则输出“We%20are%20happy.”。
 */
public class Space2String {
    public static void main(String[] args) {
        replace("fk your sisiter.haha  wuwu dknerinl ");
    }

    private static void replace(String target) {
        String[] temp = target.split(" ");
        String sentence = "";
        for (String s : temp) {
            sentence = sentence+s + "%20";
        }
        System.out.println(sentence.substring(0,sentence.length()-3));


    }
}
