package com.study.Primary;

/**
 *给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class StartZero {
    public static void main(String[] args) {
        int []arr = {1,2,2};
        plusOne(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1 ;
        return digits;
    }
}
