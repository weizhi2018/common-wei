package com.weizhi.common.search;

/**
 * ProjectName:common-wei
 * Decription:
 * Created By:weizhi
 * Created Date:2015/11/22
 * Updated By:
 * Updated Date:
 * Copyright@2014-2015 weizhi2018
 * Version:V1.0
 */
public class BinarySearch {

    /**
     * 二分查找-递归方式
     * @param arr
     * @param start
     * @param end
     * @return
     */
    public static int searchByRecursion(int[] arr,int start,int end,int key){
        if(start <= end) {
            int index = (end - start) / 2 + start ;
            if (key == arr[index]) {
                return index;
            } else if (key < arr[index]) {
               return  searchByRecursion(arr,start,index -1,key );
            }else{
                return searchByRecursion(arr, index + 1, end, key);
            }
        }else{
            return -1;
        }
    }


    /**
     * 二分查找-循环方式
     * @param arr
     * @param key
     * @return
     */
    public static int searchByLoop(int[] arr,int key){
        int start = 0;
        int end = arr.length - 1;
        int index = 0;
        while(start <= end){
            index = (end -start)/2 + start;
            if(key == arr[index]) {
                return index;
            }else if(key < arr[index]){
                end = index -1;
            }else{
                start = index + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {10,20,30};
        System.out.println(BinarySearch.searchByRecursion(arr,0,arr.length-1,10));
        System.out.println(BinarySearch.searchByRecursion(arr,0,arr.length-1,20));
        System.out.println(BinarySearch.searchByRecursion(arr,0,arr.length-1,30));
        System.out.println(BinarySearch.searchByRecursion(arr,0,arr.length-1,40));

        int[] arr2 = {10,20,30};
        System.out.println(BinarySearch.searchByLoop(arr2,10));
        System.out.println(BinarySearch.searchByLoop(arr2,20));
        System.out.println(BinarySearch.searchByLoop(arr2,30));
        System.out.println(BinarySearch.searchByLoop(arr2,40));
    }
}
