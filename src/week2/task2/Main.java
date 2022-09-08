package week2.task2;

import java.util.Arrays;
/*
        Task2

            [3, 4, 2, 7], 10 -> [3, 7] - вывести пару менно в скобках, которые дают сумму - 10
         */

public class Main {

    public static void main(String[] args) {

        final int[] RAW_DATA = new int[]{3,4,2,7};
        int summResult = 10;
        System.out.println(Arrays.toString(twoSum(RAW_DATA, summResult)));
    }

    //Решение с помощью двуx указателей
    public static int[] twoSum(int[] nums, int summResult){
        if (nums.length == 0){
            throw new IllegalArgumentException();
        }
        int l = 0;
        int r = nums.length-1;
        while (l<r){
            int sum = nums[l]+nums[r];
            if(sum == summResult){
                return new int[]{nums[l],nums[r]};
            }
            if(sum<summResult){
                l++;
            } else {
                r--;
            }
        }
        return new int[0];
    }
}
