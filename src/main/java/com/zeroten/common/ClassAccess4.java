package com.zeroten.common;

import com.zeroten.common.classobject.ClassAccess;
import org.testng.annotations.Test;

public class ClassAccess4 extends ClassAccess{//同包，子类

    @Test
    public void testAcl(){//子类，不同包，
        System.out.println(pub);
        System.out.println(pro);
  //      System.out.println(def);
 //       System.out.println(pri);

        System.out.println(getPub());
        System.out.println(getPro());
  //      System.out.println(getDef());
  //      System.out.println(getPri());
    }

}
