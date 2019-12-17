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

    @Test
    public void testCopy(){
        //数组的复制
        Integer[] arr1={1,2,3,4,5};
        Integer[] arr2={6,7,8,9,10};
        //拷贝数组arr1的前三个元素生成一个新数组
        Integer[] arr11=new Integer[3];
        arr11[0]=arr1[0];
        arr11[1]=arr1[1];
        arr11[2]=arr1[2];
        System.out.println("arr11="+Arrays.toString(arr11));
        Integer[] arr12=Arrays.copyOf(arr1,3);
        System.out.println("arr12="+Arrays.toString(arr12));

          //拷贝数组arr1的后三位元素到一个新数组
        Integer[] arr13=Arrays.copyOfRange(arr1,arr1.length-3,arr1.length);
        System.out.println("arr13="+Arrays.toString(arr13));

        //拷贝数组arr1的第一到第三元素（不包括第三）
        Integer[] arr14=Arrays.copyOfRange(arr1,0,2);
        System.out.println("arr14="+Arrays.toString(arr14));

        //拷贝数组arr2的后三位到arr1的后三位
        System.arraycopy(arr2,arr2.length-3,arr1,arr1.length-3,3);
        System.out.println("arr1="+Arrays.toString(arr1));

    }

    @Test
    public void testFill(){
        //实例：定义一个大小为10的int数组，并将数组初步初始化为指定值5，打印数组
        //然后将数组后三赋值为3，再次打印
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=5;
        }
        System.out.println(Arrays.toString(arr));

        for(int i=arr.length-3;i<arr.length;i++){
            arr[i]=3;
        }
        System.out.println(Arrays.toString(arr));
    }
}
