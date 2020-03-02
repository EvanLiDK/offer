package a08;

/**
 * 面试题8:二叉树的下一个节点
 * 题目:给定一棵二叉树和其中的一个节点，如何找出中序遍历序列的下一个节点？树中的节点除了有两个分别指向左、右子节点的指针，还有
 * 个指向父节点的指针
 *
 * ① 如果一个节点的右子树不为空，那么该节点的下一个节点是右子树的最左节点；
 * ② 否则，向上找第一个左链接指向的树包含该节点的祖先节点。
 */
public class FindNode {


    public static void main(String[] args) {

    }


    public TreeNode GetNext(TreeNode pNode) {
        if (pNode.right != null) {
            TreeNode node = pNode.right;
            while (node.left != null)
                node = node.left;
            return node;
        } else {
            while (pNode.next != null) {
                TreeNode parent = pNode.next;
                if (parent.left == pNode)
                    return parent;
                pNode = pNode.next;
            }
        }
        return null;
    }
}
