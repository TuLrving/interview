package com.排序.插入排序;

public class InsertionSort {
    public static void insertionSort(int[] array){
        int insertIndex = 0;
        int insertElement = 0;
        for(int i = 1;i < array.length; i ++){//默认第一个元素为有序
            insertIndex = i-1;//默认第一个比较的位置
            insertElement = array[i];//无序区第一个元素
            while(insertIndex >= 0 && array[insertIndex] > insertElement){
                array[insertIndex+1] = array[insertIndex];
                insertIndex--;
            }
            array[insertIndex + 1] = insertElement;
        }
    }

    /**
     * 测试插入排序
     */
    public static void main(String[] args){
        int[] array = {5,10,6,3,7,8,9,55,21};
        System.out.println("排序前：");
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("排序后：");
        insertionSort(array);
        for (int i : array) {
            System.out.print(i+" ");
        }
    }
}
