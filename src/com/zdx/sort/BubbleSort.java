package com.zdx.sort;

/**
 * Created by zhoudunxiong on 2019/3/23.
 */
public class BubbleSort {

    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
            System.out.print("第" + i + "次排序的结果为: ");
            display(array);
        }
        return array;
    }

    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {4,2,8,9,5,7,6,1,3};
        //未排序数组顺序为
        System.out.print("未排序数组顺序为：");
        display(array);
        array = sort(array);
        System.out.print("经过冒泡排序后的数组顺序为：");
        display(array);
    }
}
