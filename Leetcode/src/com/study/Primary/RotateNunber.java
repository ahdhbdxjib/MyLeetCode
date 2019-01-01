package com.study.Primary;

import sun.security.util.Length;

/**
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 */
public class RotateNunber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] nums1 = {1, 2};
        int move = 2;
        rotate(nums1, move);
    }

    /**
     * 使用转换为字符串的方法来转换
     * 如果多次的话将数组的长度取模运算
     * @param nums
     * @param k
     */
    public static void rotate1(int[] nums, int k) {
        StringBuffer sb = new StringBuffer();
        int length = nums.length;
        //将数组转化为字符串
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
        }
        String str1 = sb.substring(0,length - 1 - k);
        String str2 = sb.substring(length - 1 - k,length - 1);
        str2 += str1;
        for (int i = 0; i < str2.length(); i++) {
            nums[i] = str2.charAt(i) - '0';
        }
    }

    public static void rotate(int[] nums, int k) {
        int length = nums.length - 1;
        int i = length;
        int j = 0;
        int temp = 0;
         k = k % (length + 1);
        while (j < k) {
            while (i >= 0) {
                //每一次将最后的数存起来
                if( i == length) {
                     temp = nums[length];
                   // System.out.println(temp);
                }
                //将小于长度的数前面赋值给后面
                nums[i] = nums[--i];
                if( i == 0){
                    nums[0] = temp;
                    break;
                }
            }
            i = length;
            j++;
        }
        for (int c:nums){
            System.out.println(c);
        }
    }
}