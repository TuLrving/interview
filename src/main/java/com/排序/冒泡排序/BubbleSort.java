package com.排序.冒泡排序;

public class BubbleSort {
    public static int[] bubbleSort(int[] array){
        for(int i = 0;i < array.length;i ++){
            boolean isExchanged = false;
            for(int j = 0;j < array.length-i-1;j ++){
                if(array[j] > array[j+1]){
                    int num = array[j];
                    array[j] = array[j+1];
                    array[j+1] = num;
                    isExchanged = true;
                }
            }
            if(!isExchanged){
                break;
            }
        }
        return array;
    }

    /**
     * 测试冒泡排序
     */
    public static void main(String[] args){
        int[] array = {5,10,6,3,7,8,9,55,21};
        System.out.println("排序前：");
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("排序后：");
        bubbleSort(array);
        for (int i : array) {
            System.out.print(i+" ");
        }
    }
}
