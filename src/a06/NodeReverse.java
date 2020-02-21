package a06;


import java.util.Stack;

/**
 * 面试题6:从尾到头打印链表
 * 题目:输入一个链表的头节点，从尾到头反过来打印出每个节点的值。
 */
public class NodeReverse {

    public static void main(String[] args) {
        Stack stack = new Stack();
        Node node = new Node();
        node.setNext(new Node().setValue(2).setNext(new Node().setValue(3)));
        node.setValue(1);
        reverse(node, stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());

        }
    }

    private static void reverse(Node node, Stack stack) {


        while (node.getNext() != null) {
            stack.push(node.getValue());
            node =node.getNext();
        }
        stack.push(node.getValue());

    }
}
