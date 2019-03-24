package com.zdx.sort;

/**
 * Created by zhoudunxiong on 2019/3/23.
 */
public class InsertSort {

    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && temp < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
            System.out.print("第" + i + "轮排序的结果为：");
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
