package com.zdx.datastructure;

/**
 * Created by zhoudunxiong on 2019/3/23.
 */
public class StackSingleLink {
    private SingleLinkedList elems;

    public void push(Object data) {
        elems.addHead(data);
    }

    public Object pop() {
        return elems.deleteHead();
    }

    public Object peek() {
        return elems.peekHead();
    }

    public boolean isEmpty() {
        return elems.isEmpty();
    }

    public void display() {
        elems.display();
    }
}
