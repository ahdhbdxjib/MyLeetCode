package com.study.Primary;

import java.util.zip.CheckedOutputStream;

public class BestToBuy {
    public static void main(String[] args) {
        int[] p = {7,1,5,3,6,4};
        System.out.println(getMax(p));
    }
    public static int  getMax(int [] prices){
        int max = 0;
        for(int i = 1; i< prices.length;i ++){
            if(prices[i] - prices[i -1] > 0){
                max += prices[i] - prices[i - 1];
            }
        }
        return max;
    }
}
