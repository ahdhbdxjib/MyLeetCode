package com.study.Primary;

import java.util.Arrays;

/**
 * 从数组中找到只出现一个的数字
 * s时间复杂度为线性的
 * 不使用额外的空间
 */
public class SingleOne {
    public static void main(String[] args) {
        int[] arr = {1,0,1};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }
        //将数组排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 && nums[i] != nums[i + 1]) {

                return nums[i];
            }
            if (i == nums.length - 1 && nums[i] != nums[i - 1]) {
                return nums[i];
            }
            if (i > 0 && i < nums.length - 1) {
                if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                    return nums[i];
                }
            }


        }
        return -1;

    }


}

