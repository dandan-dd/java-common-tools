package com.zeroten.common.classobject;

import org.testng.annotations.Test;

public class ClassThisTest {

    private int index;

    public ClassThisTest(){

    }
    public void println(String name){
        System.out.println(this.index+".hello,"+name);
    }

    public void println(int...numbs){//可变参数数量，只能有一个且在最后一位
        if(numbs==null){
            System.out.println("is null");
            return;
        }
        if(numbs.length==0){
            System.out.println("param length is zero");
            return;
        }
        for(int n=0;n<numbs.length;n++){
            System.out.println(numbs[n]);
        }
    }

    @Test
    public void test1(){
        ClassThisTest obj=new ClassThisTest();
        obj.println("wendy");
    }

    @Test
    public void testPrintlnParams(){
        println();
        println(1);
        println(1,2,3,8,9);
    }

}
