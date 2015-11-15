package com.weizhi.common.util;

/**
 * ProjectName:common-wei
 * Decription:输出相应的参数
 * Created By:weizhi
 * Created Date:2015/11/15
 * Updated By:
 * Updated Date:
 * Copyright@2014-2015 weizhi2018
 * Version:V1.0
 */
public class PrintUtil {
    /**
     * 输出数组
     * @param arr
     */
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * 输出字符串，且不换行
     * @param msg
     */
    public static void printMsgWithoutNewline(String msg){
        System.out.print(msg);
    }

    /**
     * 输出字符串，且不换行
     * @param msg
     */
    public static void printMsgWithNewline(String msg){
        System.out.print(msg);
    }

    /**
     * 输出整数
     * @param i
     */
    public static void printIntWithNewline(int i){
        System.out.println(i);
    }
}
