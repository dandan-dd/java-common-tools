package com.zeroten.common.classobject;

import org.testng.annotations.Test;

public class classConstitute {
    private static String count;//类变量、静态域变量
    private String name;//实例变量、域变量

    {
        //实例代码块，也叫初始化代码块
        System.out.println("类里、方法外用大括号括起来的一段代码");
    }

    static{
        //静态代码块，也叫静态初始化代码块
        System.out.println("类里、方法外用大括号括起来且前面有static修饰的一段代码");
    }

    public void println(){//方法
        {
            System.out.println("代码块");
        }
    }

    public static void staticPrintln(){//静态方法

    }

    public classConstitute(){//无参构造器方法

    }

    public classConstitute(String name){//有参构造器方法

    }

    class innerClass{

    }

    @Test
    public void test1(){

    }
}
