package com.zdx.datastructure;

/**
 * Created by zhoudunxiong on 2019/3/23.
 */
public class OrderLinkedList {
    private Node head;

    private class Node {
        private int data;
        private Node next;

        public Node(int value) {
            data = value;
        }
    }

    public OrderLinkedList() {
        head = null;
    }

    public void addHead(int data) {
        Node node = new Node(data);
        Node curr = head;
        Node prev = null;
        while (curr != null && data > curr.data) {
            prev = curr;
            curr = curr.next;
        }
        if (prev == null) {
            head = node;
            head.next = curr;
        } else {
            prev.next = node;
            node.next = curr;
        }
    }

    public int deleteHead() {
        int value = head.data;
        head = head.next;
        return value;
    }

    public int peekHead() {
        return head.data;
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        OrderLinkedList list = new OrderLinkedList();
        list.addHead(2);
        list.addHead(1);
        list.display();

        list.addHead(3);
        list.display();
    }
}
