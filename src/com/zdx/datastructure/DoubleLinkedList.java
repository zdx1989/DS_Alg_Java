package com.zdx.datastructure;

/**
 * Created by zhoudunxiong on 2019/3/23.
 */
public class DoubleLinkedList {
    private int size;
    private Node head;
    private Node tail;

    private class Node {
        private Object data;
        private Node next;

        public Node(Object value) {
            data = value;
        }
    }

    public void addHead(Object obj) {
        Node node = new Node(obj);
        if (size == 0) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addTail(Object obj) {
        Node node = new Node(obj);
        if (size == 0) {
            tail = node;
            head = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public Object deleteHead() {
        Object value = head.data;
        head = head.next;
        size--;
        return value;
    }


    public Object peekHead() {
        return head;
    }

    public Object peekTail() {
        return tail;
    }

    public Node find(Object data) {
        Node node = head;
        while(node.next != null) {
            if (node.data == data) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public boolean delete(Object data) {
        Node prev = head;
        Node curr = head;
        while (curr.data != data) {
            if (curr.next == null) {
                return false;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        if (curr == head) {
            head = head.next;
            size--;
        } else {
            prev.next = curr.next;
            size--;
        }
        return true;
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
