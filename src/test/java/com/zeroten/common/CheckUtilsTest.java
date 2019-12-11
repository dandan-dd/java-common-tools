package com.zeroten.common;

import org.junit.Test;

import static com.zeroten.common.util.CheckUtils.isAnyEmpty;
import static com.zeroten.common.util.CheckUtils.isEmpty;
import static com.zeroten.common.util.CheckUtils.equals1;
import static com.zeroten.common.util.CheckUtils.equals2;

public class CheckUtilsTest {
    @Test
     public void isAE(){
        String[] strings={"6adf787","576ufi","123ewq"};//空就false
        String[] strings1={"6adf787","576ufi",""};
        System.out.println(isAnyEmpty(strings1));
        System.out.println(isAnyEmpty(strings));
    }

    @Test
    public void isE(){
        Object[] arr={"asd","www",'s',23,""};//空就true
        Object[] arr1={"asd","www",'s',23,null};
        Object[] arr2={"asd","www",'s',23};
        System.out.println(isEmpty(arr1));
        System.out.println(isEmpty(arr2));
        System.out.println(isEmpty(arr));
    }

    @Test
    public void eq1(){//相等就true
        String str1="sd33rrr";
        String str2="sd33rrr";
        String str3="-=3￥@ ";
        String str4=" 0 8 7h";
        String str5="-=3￥@";
        System.out.println(equals1(str3,str4));
        System.out.println(equals1(str1,str2));
        System.out.println(equals1(str3,str5));
    }

    @Test
    public void eq2(){//相等就true
        Integer n1=213;
        Integer n2=231;
        Integer n3=231;
        Integer n5=0;
        Integer n6=0;
        Integer n7=-3;
        Integer n8=-3;
        Integer n9=-4;
        System.out.println(equals2(n1,n3));
        System.out.println(equals2(n1,n2));
        System.out.println(equals2(n5,n6));
        System.out.println(equals2(n7,n8));
        System.out.println(equals2(n6,n9));
        System.out.println(equals2(n7,n9));
    }
}
