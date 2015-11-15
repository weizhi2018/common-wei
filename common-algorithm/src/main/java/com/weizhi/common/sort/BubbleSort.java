package com.weizhi.common.sort;

import com.weizhi.common.util.PrintUtil;

/**
 * ProjectName:common-wei
 * Created By:weizhi
 * Created Date:2015/11/15
 * Updated By:
 * Updated Date:
 * Copyright@2014-2015 weizhi2018
 * Version:V1.0
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr1 = {8,9,10,3,2,4,7,6,7,3,2,1,0,-1,7,8,9,11};
        int[] arr2 = new int[]{20,30,100,80,60,10,40,45,90,35};
        PrintUtil.printMsgWithoutNewline("arr1 before sort:");
        PrintUtil.printArr(arr1);
        PrintUtil.printMsgWithoutNewline("arr2 before sort:");
        PrintUtil.printArr(arr2);
        BubbleSort.sort(arr1);
        BubbleSort.sort(arr2);
        PrintUtil.printMsgWithoutNewline("arr1 after sort:");
        PrintUtil.printArr(arr1);
        PrintUtil.printMsgWithoutNewline("arr2 after sort:");
        PrintUtil.printArr(arr2);
    }

    /**
     * Bubble Sort
     * @param arr Array for Sort
     */
    public static void sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
//                    swap(arr[i],arr[j]);
                }
            }
        }
    }

//    private static void swap(int a,int b){
//        int temp = a;
//        a = b;
//        b = temp;
//    }
}
