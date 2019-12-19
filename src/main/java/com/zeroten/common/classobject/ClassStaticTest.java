package com.zeroten.common.classobject;

public class ClassStaticTest {
    private static final int MAX_COUNT;//不赋值会报错，赋值后不能修改

    private static int count=0;

    {//每一次new操作都会执行
        //代码块，也叫初始化代码块
        System.out.println("代码块一");
    }
    static{//当前类第一次被调用时执行一次
        //静态代码块，也叫静态初始化代码块
        MAX_COUNT=6;
        System.out.println("静态代码块一");
    }
    {
        //代码块，也叫初始化代码块
        System.out.println("代码块二");
    }
    static{
        //静态代码块，也叫静态初始化代码块
        System.out.println("静态代码块二");
    }
    public ClassStaticTest() throws Exception {
        count++;
        if(count>MAX_COUNT){
            throw new Exception("只能创建"+MAX_COUNT+"个对象");
        }

    }

    public static void printlnCount(){
        System.out.println("总共有"+count+"个实例");
    }

    public  static  void main(String[] args) throws Exception {
        new ClassStaticTest();
        ClassStaticTest obj2=new ClassStaticTest();
        new ClassStaticTest();
        new ClassStaticTest();
        new ClassStaticTest();
        new ClassStaticTest();


        ClassStaticTest.printlnCount();
        obj2.printlnCount();//不推荐
    }

}
