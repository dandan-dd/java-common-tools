package com.zeroten.common.classobject;

import org.testng.annotations.Test;

public class ClassAccess3 extends ClassAccess{//同包，子类

    @Test
    public void testAcl(){
        System.out.println(pub);
        System.out.println(pro);
        System.out.println(def);
 //       System.out.println(pri);

        System.out.println(getPub());
        System.out.println(getPro());
        System.out.println(getDef());
  //      System.out.println(getPri());
    }

}
