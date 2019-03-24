package com.zdx.datastructure;

/**
 * Created by zhoudunxiong on 2019/3/23.
 */
public class MyStack {
    private int[] elems;
    private int maxSize;
    private int top;

    public MyStack() {
        elems = new int[10];
        maxSize = 10;
        top = -1;
    }

    public MyStack(int s) {
        elems = new int[s];
        maxSize = s;
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("堆栈已经满了");
        } else {
            top++;
            elems[top] = value;
        }
    }

    public int pop() {
        int value = elems[top];
        top--;
        return value;
    }

    public int peek() {
        return elems[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());

        }
    }
}
