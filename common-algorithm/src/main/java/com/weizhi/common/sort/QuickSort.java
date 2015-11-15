package com.weizhi.common.sort;


import com.weizhi.common.util.PrintUtil;

/**
 * ProjectName:common-wei
 * Description:普通快速排序算法
 * Created By:weizhi
 * Created Date:2015/11/15
 * Updated By:
 * Updated Date:
 * Copyright@2014-2015 weizhi2018
 * Version:V1.0
 */
public class QuickSort {

    /**
     * 快速排序-递归
     *
     * @param arr
     * @param startIdx
     * @param endIdx
     */
    public static void sort(int[] arr, int startIdx, int endIdx) {
        if (startIdx >= endIdx) {
            return;
        }
        int base = arr[startIdx];
        int i = startIdx;
        int j = endIdx;
        while (i < j) {
            while (i < j) {
                if (base < arr[j])
                    j--;
                else {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    break;
                }
            }
            while (i < j) {
                if (base > arr[i])
                    i++;
                else {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j--;
                    break;
                }
            }
        }
        if(i>startIdx) {
            sort(arr, startIdx, j - 1);
        }
        if(j<endIdx) {
            sort(arr, j + 1, endIdx);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {8, 9, 10, 3, 2, 4, 7, 6, 7, 3, 2, 1, 0, -1, 7, 8, 9, 11};
        int[] arr2 = new int[]{20, 30, 100, 80, 60, 10, 40, 45, 90, 35};
        QuickSort.sort(arr1, 0, arr1.length - 1);
        QuickSort.sort(arr2, 0, arr2.length - 1);

        PrintUtil.printArr(arr1);
        PrintUtil.printArr(arr2);
    }
}
