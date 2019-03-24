package com.zdx.sort;

/**
 * Created by zhoudunxiong on 2019/3/23.
 */
public class ChioceSort {

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
            System.out.print("第" + (i + 1) + "轮的排序结果为：");
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
