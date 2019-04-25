package com.排序.选择排序;

public class SelectionSort {
    //每次从无序区选出最小的元素放到无序区第一位
    public static void selectionSort(int[] array){
        int minNum = 0;
        int minIndex = 0;
        for(int i = 0;i < array.length;i ++){
            minNum = array[i];//默认每次最小值为无序区第一位
            for(int j = i;j < array.length - 1; j++){
                if(minNum > array[j + 1]){
                    minNum = array[j+1];
                    minIndex = j + 1;
                }
            }
            int num = array[i];
            array[i] = minNum;
            array[minIndex] = num;
        }
    }

    /**
     * 测试选择排序
     */
    public static void main(String[] args){
        int[] array = {5,10,6,3,7,8,9,55,21};
        System.out.println("排序前：");
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("排序后：");
        selectionSort(array);
        for (int i : array) {
            System.out.print(i+" ");
        }
    }
}
