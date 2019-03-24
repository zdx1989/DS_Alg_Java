package com.zdx.array;

/**
 * Created by zhoudunxiong on 2019/3/22.
 */
public class MyArrayTest {

    public static void main(String[] args) {
        MyArray arr = new MyArray(4);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.display();
        arr.modify(3, 33);
        arr.display();
        arr.delete(33);
        arr.display();
    }
}
