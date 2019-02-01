package com.study.Primary;

import javax.smartcardio.TerminalFactory;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class StartZero {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        int res[] = plusOne(arr);
        System.out.println(res);

    }

    private static int[] plusOne(int[] arr) {
        if(arr.length == 0 || arr==null) return arr;
        for (int i = arr.length -1;i >= 0;i--) {
            if(arr[i] < 9){
                arr[i]+=1;
                return arr;
            }else{
                arr[i] = 0;
            }
        }
        int nums[] = new int[arr.length+1];
        nums[0] = 1;
        return nums;
    }
/*    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        int res = 0;
        for (int i = 0; i < length; i++) {
            res = res * 10 + digits[i];

        }
        res+=1;
        String str = Integer.toString(res);
        int [] nums = new int[str.length()];
        for (int i = 0; i < nums.length; i++) {
            num[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return  nums;
    }*/
}
