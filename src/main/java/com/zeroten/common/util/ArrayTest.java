package com.zeroten.common.util;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Random;

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
        Arrays.fill(arr,5);
//        for(int i=0;i<arr.length;i++){
//            arr[i]=5;
//        }
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr,arr.length-3,arr.length,3);
//        for(int i=arr.length-3;i<arr.length;i++){
//            arr[i]=3;
//        }
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testSort(){
        //实例：
        //1.定义一个大小为100的int 数组
        //2.随机给每一位赋值一个0~100的数值
        //3.然后对该数组进行排序
        //4.并打印排序结果
        int[] arr=new int[100];
        for(int i=0;i<arr.length;i++){
            arr[i]=new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testWeiShuZu(){
        //实例：定义一个二维数组
        //第一维表示用户
        //第二维表示用户具体信息
        //（1.编码  2.姓名  3.性别  4.年龄
        //定义赋值并打印
        String[][] users=new String[5][];
        users[0]=new String[4];
        users[0][0]="001";
        users[0][1]="张三";
        users[0][2]="男";
        users[0][3]="25";

        users[1]=new String[3];
        users[1][0]="002";
        users[1][1]="李四";
        users[1][2]="女";
       // users[1][3]="未知";
        for(int i=0;i<users.length;i++) {
            System.out.println(Arrays.toString(users[i]));
        }
        for(String[] user:users){
            System.out.println(Arrays.toString(user));
        }
        Arrays.asList(users).forEach(user->System.out.println(Arrays.toString(user)));
    }

    public int[] twoSum(int[] nums,int target){
        int times=0;
        for(int index=0;index<nums.length-1;index++){
            for(int twoIndex=index+1;twoIndex<nums.length;twoIndex++){
                times++;
                if(nums[index]+nums[twoIndex]==target){
                    System.out.println("循环"+times+"次");
                    return new int[]{index,twoIndex};
                }
            }
        }
        System.out.println("循环"+times+"次");
        return null;

    }
    public int[] twoSum2(int[] nums,int target){
        System.out.println("传入数组："+Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("排序数组："+Arrays.toString(nums));

        int times=0;
        for(int index = 0;index<nums.length-1;index++){
            if(nums[index]>=target){
                System.out.println("第一个数（"+index+"）"+nums[index]+"已经大于"+target+",返回不存在");
                System.out.println("循环"+times+"次");
                return null;
            }
            for(int twoIndex=index+1;twoIndex<nums.length;twoIndex++){
                times++;
                if(nums[twoIndex]>target){
                    break;
                }
                if(nums[index]+nums[twoIndex]==target){
                    System.out.println("循环"+times+"次");
                    return new int[]{index,twoIndex};
                }
            }
        }

        return null;
    }

    @Test
    public void testTwoSum(){
        int[] intArray={33,22,2,7,11,15,30,6};
        int target=9;
        System.out.println(Arrays.toString(twoSum(intArray,target)));
        System.out.println("==============================");
        System.out.println(Arrays.toString(twoSum2(intArray,target)));
    }

    @Test
    public void testFaceTest1(){
        int[] n=new int[]{1,2,3};
        int[] n2=new int[3];
        n2[0]=1;
        n2[1]=2;
        n2[2]=3;
        System.out.println(n[1]);
        System.out.println(n2[1]);
    }

    private static void pluslForEvenIndex(int[] arr){
        for(int index=0;index<arr.length;index++){
            if((index+1)%2==0){
                arr[index]=arr[index]+1;
            }
        }
    }
    public static void main(String[] args) {
        int[] n={1,2,3,4,5,6,7,8,9,10};
        pluslForEvenIndex(n);
        System.out.println(Arrays.toString(n));
    }

    @Test
    public void testFaceTest(){
        int[] n=new int[3];
        String[] s=new String[3];
        System.out.println(n[1]);
        System.out.println(s[1]);
    }
}
