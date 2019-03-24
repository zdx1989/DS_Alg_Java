package com.zdx.recursion;

import com.sun.jndi.cosnaming.CNCtx;

import java.util.Arrays;

/**
 * Created by zhoudunxiong on 2019/3/24.
 */
public class recursion {

    public static int getFactorial(int n) {
        if (n >= 0) {
            int temp = 1;
            for (int i = 0; i <= n; i ++) {
                temp *= n;
            }
            return temp;
        } else {
            return -1;
        }
    }

    public static int getFactorialRec(int n) {
        if (n >= 0) {
            if(n == 0) {
                System.out.println(n+"!=1");
                return 1;
            } else {
                System.out.println(n);
                int temp = n * getFactorialRec(n - 1);
                System.out.println(n+"!="+temp);
                return temp;
            }
        } else {
            return -1;
        }
    }

    public static int getFactorialTail(int n) {
        if (n >= 0) {
            return loop(n, 1);
        } else {
            return -1;
        }
    }

    public static int loop(int n, int res) {
        if (n == 0) {
            return res;
        } else {
            return loop(n - 1, n * res);
        }
    }

    public static int search(int[] array, int key, int low, int high) {
        int mid = (high - low) / 2;
        if (array[mid] == key) {
            return mid;
        } else if (low > high) {
            return -1;
        } else {
            if (array[mid] > key) {
                return search(array, key, low, mid);
            }
            if (array[mid] < key) {
                return search(array, key, mid, high);
            }
        }

        return -1;
    }

    public static void move(int dish,String from,String temp,String to){
        if(dish == 1){
            System.out.println("将盘子"+dish+"从塔座"+from+"移动到目标塔座"+to);
        }else{
            move(dish-1,from,to,temp);//A为初始塔座，B为目标塔座，C为中介塔座
            System.out.println("将盘子"+dish+"从塔座"+from+"移动到目标塔座"+to);
            move(dish-1,temp,from,to);//B为初始塔座，C为目标塔座，A为中介塔座
        }
    }

    public static int[] sort(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int aNum = 0; int bNum = 0; int cNum = 0;
        while(aNum < a.length && bNum < b.length) {
            if (a[aNum] <= b[bNum]) {
                c[cNum] = a[aNum];
                cNum++;
                aNum++;
            } else {
                c[cNum] = b[bNum];
                cNum++;
                bNum++;
            }
        }
        while(aNum == a.length && bNum < b.length) {
            c[cNum] = b[bNum];
            bNum++;
            cNum++;
        }
        while(bNum == b.length && aNum < a.length) {
            c[cNum] = a[aNum];
            aNum++;
            cNum++;
        }
        return c;
    }

    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] mergeSort(int[] a, int start, int last) {
        if (start < last) {
            int mid = (start + last) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, last);
            merge(a, start, mid, last);
        }
        return a;
    }

    public static int[] merge(int[] c, int start, int mid, int last) {
        int[] temp = new int[last-start+1];//定义临时数组
        int i = start;//定义左边数组的下标
        int j = mid + 1;//定义右边数组的下标
        int k = 0;
        while(i <= mid && j <= last){
            if(c[i] < c[j]){
                temp[k++] = c[i++];
            }else{
                temp[k++] = c[j++];
            }
        }
        //把左边剩余数组元素移入新数组中
        while(i <= mid){
            temp[k++] = c[i++];
        }
        //把右边剩余数组元素移入到新数组中
        while(j <= last){
            temp[k++] = c[j++];
        }

        //把新数组中的数覆盖到c数组中
        for(int k2 = 0 ; k2 < temp.length ; k2++){
            c[k2+start] = temp[k2];
        }
        return c;

    }


    public static void main(String[] args) {
        getFactorialRec(4);
        System.out.println("----------");
        int res= getFactorialTail(4);
        System.out.println(res);
        System.out.println("----------");
        int[] a = {1, 5, 9};
        int[] b = {2, 8, 15, 89};
        int[] c = sort(a, b);
        display(c);
        System.out.println("-----------");
        int[] c1 = {2,7,8,3,1,6,9,0,5,4};
        c1 = mergeSort(c1,0,c1.length-1);
        System.out.println(Arrays.toString(c1));

    }


}
