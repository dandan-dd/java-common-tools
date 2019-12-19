package com.zeroten.common.classobject;

import org.testng.annotations.Test;

public class ClassThisTest {

    private int index;

    public ClassThisTest(){

    }
    public void println(String name){
        System.out.println(this.index+".hello,"+name);
    }
    @Test
    public void test1(){
        ClassThisTest obj=new ClassThisTest();
        obj.println("wendy");
    }

}
