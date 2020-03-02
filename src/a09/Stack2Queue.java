package a09;

import java.util.Stack;

/**
 * 两个栈实现队列
 */
public class Stack2Queue {

    private Stack inStack = new Stack();

    private Stack outStack = new Stack();


    public void appendHead(Object element) {

        inStack.push(element);

    }

    public Object removeTail() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }
}
