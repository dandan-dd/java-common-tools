package com.zeroten.common.classobject;

public class ClassCreateTest {

    private String name="小朋友";//1.在声明时赋值
    private String name2;
    private String name3;//普通域变量初始化有四种
    private String name4;//4.系统默认赋值

    //final  可在声明时、初始化代码块、构造器中初始化，三种方式
    private final String name9="";//final修饰的，必须进行显式初始化

    private static int MAXCOUNT=10;//静态变量初始化只有两种
    private static int MAXCOUNT2;

    {//2.初始化代码块中赋值
        name2="小朋友";
    }
    static{
        MAXCOUNT2=10;
    }

    public ClassCreateTest(){//3.构造器中赋值
        name3="小朋友";
    }


    public void println(){//
        System.out.println(name);
    }

    public static void main(String[] args){
        //执行顺序：静态代码块-->代码块-->构造器,各自从上到下
        new ClassCreateTest().println();
    }


    /*
    Java有自动垃圾回收机制
    如果确实需要自己手动进行回收处理，可使用系统方法 Runtime,getRuntime().addShutdownHook() 方法添加关闭钩（shutdown hook)
     */
}
