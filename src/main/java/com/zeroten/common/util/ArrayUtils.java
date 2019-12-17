package com.zeroten.common.util;

import java.util.Arrays;

public class ArrayUtils {
    public static int[] sort(int[] arr){
        System.out.println(Arrays.toString(arr));
        int mix;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    mix=arr[j];
                    arr[j]=arr[i];
                    arr[i]=mix;
                }
            }
        }
        return arr;
    }
        public static void main (String[] args){
        int[] arr={9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
