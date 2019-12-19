package com.zeroten.common.classobject;

import org.testng.annotations.Test;

public class VarTest {

    //使用static修饰的是类变量，所有的实例共享
    //count用于记录创建该类的实例的个数
    private static int count=0;


    /**
     * Java类构造器特征：
     * 1.构造器与类同名
     * 2.每个类可以有一个或多个构造器，但是参数个数或类型不一样
     * 3.构造器没有返回值
     * 4.构造器总是伴随new操作一起被调用
     * 5.编写类时未调用构造器时，系统会自动提供一个默认构造器（无参构造器）
     */
    public VarTest(){//当没有编写构造器时，系统自动添加无参构造器方法

    }

    public VarTest(int index){
        this();
        this.index=index;
    }

    public VarTest(int index,int count){
        this(index);//只能出现在第一句，且一个构造器中只能调用其它构造器一次，不能出现两个this
        this.count=count;
    }

    public void println(){
        String logStr=String.format("当前创建第%d个实例，共%d个",index,count);
        System.out.println(logStr);
    }

    //没有用static修饰的是实例变量
    //每个实例有单独的拷贝
    //index用于存放当前是类的第几个实例
    public int index;


   public static void main (String[] args){
       VarTest v1=new VarTest();//通过new定义赋值的变量也叫对象变量，一个对象变量并没有实际包含一个对象，而仅仅引用一个对象，Java对象存放在堆中
       v1.index=1;
       VarTest.count++;

       v1.println();
       System.out.println("当前创建第"+v1.index+"个实例，共"+VarTest.count+"个");

       VarTest v2=new VarTest();
       v2.index=2;//VarTest.index不行
       v2.count++;//VarTest.count++

       v2.println();
       System.out.println("当前创建第"+v2.index+"个实例，共"+v2.count+"个");//VarTest.count++
       System.out.println("v2看到的count="+v2.count);
       System.out.println("v1看到的count="+v1.count);
       System.out.println("v2看到的index="+v2.index);
       System.out.println("v1看到的index="+v1.index);


       VarTest v3=new VarTest(3,3);//调用构造器方法
       v3.println();
       System.out.println("v3看到的count="+v3.count);
       System.out.println("v3看到的index="+v3.index);
   }
}
