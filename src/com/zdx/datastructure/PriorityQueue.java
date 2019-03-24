package com.zdx.datastructure;

/**
 * Created by zhoudunxiong on 2019/3/23.
 */
public class PriorityQueue {
    private int[] elems;
    private int maxSize;
    private int size;

    public PriorityQueue(int s) {
        elems = new int[s];
        maxSize = s;
        size = 0;
    }

    public void insert(int value) {
        if(isFull()) {
            System.out.println("队列已经满了");
        } else {
            if (size == 0) {
                elems[size] = value;
            } else {
                int j = size - 1;
                while (j >= 0 && value > elems[j]) {
                    elems[j + 1] = elems[j];
                    j--;
                }
                elems[j + 1] = value;
                size++;
            }
        }
    }

    public int remove() {
        int value = elems[size - 1];
        elems[size - 1] = -1;
        size--;
        return value;
    }

    public int peekMin() {
        return elems[size - 1];
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
