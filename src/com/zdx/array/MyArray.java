package com.zdx.array;

/**
 * Created by zhoudunxiong on 2019/3/21.
 */
public class MyArray {
    private int[] myArray;

    private int length;

    private int elems;

    public MyArray() {
        myArray = new int[50];
        length = 50;
        elems = 0;
    }

    public MyArray(int l) {
        myArray = new int[l];
        length = l;
        elems = 0;
    }

    /**
     * 获取数组的有效长度
     * @return
     */
    public int getSize() {
        return elems;
    }

    /**
     * 遍历显示yuans
     */
    public void display() {
        for (int i = 0; i < elems; i ++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }

    /**
     * 添加元素
     */
    public boolean add(int value) {
        if (elems == length) {
            return false;
        } else {
            myArray[elems] = value;
            elems++;
        }
        return true;
    }

    /**
     * 根据下标获取元素
     */
    public int get(int i) {
        if (i < 0 || i >= length) {
            System.out.println("访问数组下标越界");
            return -1;
        }
        return myArray[i];
    }

    /**
     * 查找元素
     */
    public int indexOf(int data) {
        for (int i = 0; i < elems; i++) {
            if (myArray[i] == data) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 删除元素
     */
    public boolean delete(int data) {
        int index = indexOf(data);
        if (index == -1) {
            return false;
        } else if (index == elems - 1) {
            elems--;
        } else {
            for (int j = index; j < elems - 1; j++) {
                myArray[j] = myArray[j + 1];
            }
            elems--;
        }
        return true;
    }

    /**
     * 修改数组
     */
    public boolean modify(int data, int newData) {
        int index = indexOf(data);
        if (index == -1) {
            return false;
        }
        myArray[index] = newData;
        return true;
    }

}

