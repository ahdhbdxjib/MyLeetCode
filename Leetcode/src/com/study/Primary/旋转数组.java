package com.study.Primary;

import org.junit.Test;

public class 旋转数组 {
    @Test
    public void test() {
        int[][] nums = {
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}
        };
        rotate(nums);
    }
    public void rotate(int[][] matrix) {
        //做题思路：
        //1.先沿着下坡对角线对调一次
        //2.再沿着竖着的中线对调一次即可
        //做题思路：
        //1.先沿着下坡对角线对调一次
        //2.再沿着竖着的中线对调一次即可
        //每一行有多少个数
        int row = matrix.length;
        //每一列有多少个数
        int cell = matrix[0].length;
        int temp = 0;
        //1.先沿着下坡对角线对调一次
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cell; j++) {
                //如果两个为对角线就将两个对换
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
            }
        }
        //2.再沿着竖着的中线对调一次
        int mid = (row + 1) / 2;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= mid; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][row - 1 - j];
                matrix[i][row - 1 - j] = temp;
            }

        }
    }
}
