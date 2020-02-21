package a07;

import java.util.HashMap;
import java.util.Map;

/**
 * 面试题7:重建二叉树
 * 题目:输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如，输入前序遍历序列{1，2,4, 7,3, 5, 6, 8}和
 * 中序遍历序列{4, 7,2,1,5,3,8,6}，则重建如图2.6所示的二叉树并输出它的头节点。
 *
 *
 *
 * 递归，每次返回的值为上一次递归所需，直接取值即可，存一个遍历的perLeft和preRight
 */
public class BinaryTreeRebuild {


    // 缓存中序遍历数组每个值对应的索引
    private Map<Integer, Integer> indexForInOrders = new HashMap<>();

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        for (int i = 0; i < in.length; i++)
            indexForInOrders.put(in[i], i);
        return reConstructBinaryTree(pre, 0, pre.length - 1, 0);
    }

    private TreeNode reConstructBinaryTree(int[] pre, int preL, int preR, int inL) {
        if (preL > preR)
            return null;
        TreeNode root = new TreeNode(pre[preL]);
        int inIndex = indexForInOrders.get(root.getValue());
        int leftTreeSize = inIndex - inL;
        root.left = reConstructBinaryTree(pre, preL + 1, preL + leftTreeSize, inL);
        root.right = reConstructBinaryTree(pre, preL + leftTreeSize + 1, preR, inL + leftTreeSize + 1);
        return root;
    }
}
