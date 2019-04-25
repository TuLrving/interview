package com.排序.希尔排序;

public class ShellSort {
    public static void shellSort(int[] array){
        int h = 1;//增量序列
        int len = array.length;
        while(h < len / 3){
            h = 3 * h + 1;
        }
        while(h >= 1){
            for(int i = h;i < len; i+=h){
                int minElement = array[i];//默认第一个要比较的元素
                int minIndex = i - h;
                while (minIndex >= 0 && array[minIndex] > minElement){
                    array[minIndex+h] = array[minIndex];
                    minIndex -= h;
                }
                array[minIndex+h] = minElement;
            }
            h = h/3;//缩小插入间隔
        }
    }

    /**
     * 测试希尔排序
     */
    public static void main(String[] args){
        int[] array = {5,10,6,3,7,8,9,55,21};
        System.out.println("排序前：");
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("排序后：");
        shellSort(array);
        for (int i : array) {
            System.out.print(i+" ");
        }
    }
}
