package com.排序.快速排序;

public class QuickSort {
    public static void quickSort(int[] array){
        sort(array,0,array.length-1);//默认第一个元素为基准
    }

    private static void sort(int[] array,int left,int right){
        if(left < right){//只有一个元素时排序完成
            int i = left, j = right,x = array[i];
            while (i < j){
                while (i < j && array[j] >= x)
                    j--;
                if(i < j)
                    array[i++] = array[j];
                while (i < j && array[i] <= x)
                    i++;
                if(i < j)
                    array[j--] = array[i];
            }
            array[i] = x;
            sort(array,left,i-1);
            sort(array,i+1,right);
        }
    }

    /**
     * 测试快速排序
     */
    public static void main(String[] args){
        int[] array = {5,10,6,3,7,8,9,55,21};
        System.out.println("排序前：");
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("排序后：");
        quickSort (array);
        for (int i : array) {
            System.out.print(i+" ");
        }
    }
}
