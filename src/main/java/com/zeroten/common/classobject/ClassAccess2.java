package com.zeroten.common.classobject;

import org.testng.annotations.Test;

public class ClassAccess2 {

    @Test
    public void testPkgAccess(){//同包

        ClassAccess ca=new ClassAccess();

        System.out.println(ca.pub);//公开
        System.out.println(ca.getPub());

        System.out.println(ca.getPro());//保护
        System.out.println(ca.pro);

        System.out.println(ca.def);//默认
        System.out.println(ca.getDef());

//        System.out.println(ca.pri);//私有不行
//        System.out.println(ca.getPri);
    }

}
