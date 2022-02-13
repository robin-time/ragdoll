package com.example.demo;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1002, 34, 450, 99};
        int[] ints = bubbleSort(arr);
        System.out.println(ints);
    }


    public static int[] bubbleSort(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
//                int tmp = 0;
                //升序排序>,降序排序<
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
}
