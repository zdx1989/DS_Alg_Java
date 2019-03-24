package com.zdx.datastructure;

/**
 * Created by zhoudunxiong on 2019/3/23.
 */
public class QueueLinkedList {
    private DoubleLinkedList elems;

    public QueueLinkedList() {
        elems = new DoubleLinkedList();
    }

    public void insert(Object obj) {
        elems.addTail(obj);
    }

    public Object remove() {
        return elems.deleteHead();
    }

    public Object peekFront() {
        return elems.peekHead();
    }

    public boolean isEmpty() {
        return elems.isEmpty();
    }

    public void display() {
        elems.display();
    }

}
