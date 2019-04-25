package com.排序.归并排序;

public class MergeSort {
    public static int[] aux;//辅助数组
    public static void mergeSort(int[] array){
        aux = new int[array.length];
        sort(array,0,array.length-1);
    }

    private static void sort(int[] array,int left,int right){
        if(right <= left)
            return;
        int mid = (left + right) / 2;
        sort(array,left,mid);
        sort(array,mid + 1,right);
        merge(array,left,mid,right);
    }

    private static void merge(int[] array,int left,int mid,int right){
        int i = left;int j = mid + 1;//左右起点
        for(int k = i;k <= right;k ++){
            aux[k] = array[k];
        }
        for(int k = i;k <= right;k ++){
            if(i > mid){//左边没数据了
                array[k] = aux[j++];
            }else if(j > right){//右边没数据了
                array[k] = aux[i++];
            }else if(aux[j] < aux[i]){//左边数据大于右边
                array[k] = aux[j++];
            }else {
                array[k] = aux[i++];
            }
        }
    }

    /**
     * 测试归并排序
     */
    public static void main(String[] args){
        int[] array = {5,10,6,3,7,8,9,55,21};
        System.out.println("排序前：");
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("排序后：");
        mergeSort (array);
        for (int i : array) {
            System.out.print(i+" ");
        }
    }
}
