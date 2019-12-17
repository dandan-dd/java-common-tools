package com.zeroten.common.util;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayTest {

    @Test
    public void testArrayDeclare(){
        //数组的定义
        int[] arr1;
        String[] arr2;
        char[] arr3;
        boolean[] arr4;
    }

    @Test
    public void testInitialize(){
        //数组赋值
        int[] arr1=new int[5];
        String[] arr2=new String[5];
        char[] arr3=new char[5];
        boolean[] arr4=new boolean[5];
        Object[] arr5=new Object[5];

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));

        int[] arr6=new int[]{2,23,444};
        System.out.println("arr6="+Arrays.toString(arr6));

        int[] arr7={2,23,444};
        System.out.println("arr6="+Arrays.toString(arr7));

        String[] arr8={"sb","gb"};
        System.out.println("arr8="+Arrays.toString(arr8));

        Integer[] arr9={null,3,43,};
        System.out.println("arr9="+Arrays.toString(arr9));

    }
    @Test
    public void testTraverse(){
        //数组遍历
        Integer[] arr={1,2,3,4,5};
        //for
        for(int i=0;i<arr.length;i++){
            System.out.println("下标"+i+"存放的值是："+arr[i]);
            System.out.println(String.format("下标：%d存放的值是：%d",i,arr[i]));
        }
        //foreach 不能读null
        int i=0;
        for(int val:arr){
            System.out.println("第"+i+"次取到的值为"+val);
            i++;
        }
        //数组工具
        Arrays.asList(arr).forEach(val->{
            System.out.println("值是："+val);
            if(val%2==0){
                System.out.println("它是一个偶数");
            }else{
                System.out.println("它是一个奇数");
            }
        });
    }


}
