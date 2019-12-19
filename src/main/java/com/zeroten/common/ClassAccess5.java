package com.zeroten.common;

import com.zeroten.common.classobject.ClassAccess;
import org.testng.annotations.Test;

public class ClassAccess5 {

    @Test
    public void testAcl(){//不同包，非子类

        ClassAccess ca=new ClassAccess();

        System.out.println(ca.pub);//公开,只有public可访问
        System.out.println(ca.getPub());

//        System.out.println(ca.getPro());//保护不行
//        System.out.println(ca.pro);
//
//        System.out.println(ca.def);//默认不行
//        System.out.println(ca.getDef());
//
//        System.out.println(ca.pri);//私有不行
//        System.out.println(ca.getPri);
    }

}
