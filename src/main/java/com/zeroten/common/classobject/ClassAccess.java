package com.zeroten.common.classobject;

import org.testng.annotations.Test;

public class ClassAccess {

    /*
    public 公开       当前类，同包，子类，不同包，  可用于类、接口、成员变量、方法
    protected 保护    当前类，同包，子类            可用于成员变量、方法
    default 默认      当前类，同包                  可用于类、接口、成员变量、方法
    private 私有      当前类                        可用于成员变量、方法
     */

    public String pub="public公开";
    protected String pro="protected保护";
    String def="defaalt默认";
    private String pri="private私有";

    public String getPub(){
        return pub;
    }
    protected String getPro(){
        return pro;
    }
    String getDef(){
        return def;
    }
    private String getPri(){
        return pri;
    }

    @Test
    public void testInnerAcl(){
        System.out.println(pub);
        System.out.println(pro);
        System.out.println(def);
        System.out.println(pri);

        System.out.println(getPub());
        System.out.println(getPro());
        System.out.println(getDef());
        System.out.println(getPri());
    }
}
