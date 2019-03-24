package com.zdx.datastructure;

/**
 * Created by zhoudunxiong on 2019/3/23.
 */
public class TwoWayLinkedList {
    private int size;
    private Node head;
    private Node tail;

    private class Node {
        private Object data;
        private Node prev;
        private Node next;

        public Node(Object obj) {
            data = obj;
            prev = null;
            next = null;
        }

    }

    public TwoWayLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }

    public void addHead(Object obj) {
        Node node = new Node(obj);
        if (size == 0) {
            head = node;
            tail = node;
            size++;
        } else {
            head.prev = node;
            node.next = head;
            head = node;
            size++;
        }
    }

    public void addTail(Object obj) {
        Node node = new Node(obj);
        if (size == 0) {
            tail = node;
            head = node;
            size++;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public Object removeHead() {
        Node node = head;
        if (size != 0) {
            head = head.next;
            head.prev = null;
            size--;
        }
        return node;
    }

    public Object removeTail() {
        Node node = tail;
        if (size != 0) {
            tail = tail.prev;
            tail.next = null;
            size--;
        }
        return node;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        if (isEmpty()) {
            System.out.print("[]");
        } else {
            int temp = size;
            Node curr = head;
            while (temp > 0) {
                if (curr.equals(head)) {
                    System.out.print("[" + curr.data + "->");
                } else if (curr.next == null) {
                    System.out.print(curr.data + "]");
                } else {
                    System.out.print(curr.data + "->");
                }
                curr = curr.next;
                temp--;
            }
        }
        System.out.println();
    }
}
