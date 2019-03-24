package com.zdx.datastructure;

/**
 * Created by zhoudunxiong on 2019/3/23.
 */
public class MyQueue {
    private Object[] elems;
    private int maxSize;
    private int size;
    //队列前端
    private int front;
    //队列后端
    private int rear;

    public MyQueue(int s) {
        elems = new Object[s];
        maxSize = s;
        size = 0;
        front = 0;
        rear = -1;
    }

    public void insert(Object value) {
        if (isFull()) {
            System.out.println("队列已经满了");
        }
        if (rear == maxSize - 1) {
            rear = -1;
        }
        rear++;
        elems[rear] = value;
        size++;
    }

    public Object remove() {
        if (isEmpty()) {
            return null;
        }
        Object value = elems[front];
        elems[front] = null;
        if (front == maxSize - 1) {
            front = -1;
        }
        front++;
        size--;
        return value;
    }

    public Object peekFront() {
        return elems[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(3);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);//queArray数组数据为[1,2,3]

        System.out.println(queue.peekFront()); //1
        queue.remove();//queArray数组数据为[null,2,3]
        System.out.println(queue.peekFront()); //2

        queue.insert(4);//queArray数组数据为[4,2,3]
        queue.insert(5);//队列已满,queArray数组数据为[4,2,3]
    }

}