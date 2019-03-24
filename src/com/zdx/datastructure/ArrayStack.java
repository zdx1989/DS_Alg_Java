package com.zdx.datastructure;

import java.util.Arrays;
import java.util.Objects;

/**
 * Created by zhoudunxiong on 2019/3/23.
 */
public class ArrayStack {
    private Object[] elems;
    private int maxSize;
    private int top;

    public ArrayStack() {
        elems = new Object[10];
        maxSize = 10;
        top = -1;
    }

    public ArrayStack(int s) {
        elems = new Object[s];
        maxSize = s;
        top = -1;
    }

    public void push(Object value) {
        grow(top + 1);
        top++;
        elems[top] = value;
    }

    public Object pop() {
        Object value = elems[top];
        top--;
        return value;
    }

    public Object peek() {
        return elems[top];
    }

    public void grow(int s) {
        if (s == maxSize) {
            maxSize *= 2;
            elems = Arrays.copyOf(elems, maxSize);
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }


    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push("abc");
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
    }
}
