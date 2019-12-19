package com.zeroten.common.classobject;

import org.testng.annotations.Test;

public class ClassMethodParamTest {

    private void changPrimitive(int numb){
        System.out.println("传入："+numb);//10
        numb=20;//20
        System.out.println("修改后："+numb);//20
    }

    public void changeReference(StringBuilder sb){
        System.out.println("传入："+sb.toString());
        sb.append("追加");
        System.out.println("修改后："+sb.toString());

        sb=new StringBuilder();
        sb.append("新字符串");
    }
    @Test
    public void testModifyMethodParam(){//方法不能修改传入的基本数据类型的参数值，也不能修改引用类型参数的指向
        int numb=10;//10
        changPrimitive(numb);//20
        System.out.println("numb="+numb);//10

        StringBuilder sb=new StringBuilder();
        sb.append("字符串");
        changeReference(sb);
        System.out.println("sb="+sb.toString());
    }


}
