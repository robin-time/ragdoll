package com.example.demo;

public class BinaryChop {


    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 34, 450, 333, 999, 232323};
        Integer integer = searchDichotomy(arr, 999);
        System.out.println(integer);
    }

    /**
     * 二分查找法
     *
     * @param array  传入存放全部数据的容器
     * @param target 需要查找的目标数
     * @return
     */
    public static Integer searchDichotomy(Integer[] array, int target) {
        int low = 0;
        int hight = array.length - 1;
        while (low <= hight) {                 //遍历还没结束
            int mid = (low + hight) / 2;       //取中间值mid点位置
            if (array[mid] == target) {        //寻找到目标数
                return mid;
            }
            if (array[mid] > target) {        //如果中间值大于目标数，则将highr点位置移动mid位置左边
                hight = mid - 1;
            }
            if (array[mid] < target) {       //如果中间值小于目标数，则将low点位置移动mid位置右边
                low = mid + 1;
            }
        }
        return null;
    }

}
