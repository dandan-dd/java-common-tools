package com.zeroten.common.classobject;

import org.testng.annotations.Test;//加载包

import java.util.*;//*每次只能导入一个包下的所有类，而不能导入它的子包下的其它类
import java.util.zip.ZipFile;//*每次只能导入一个包下的所有类，而不能导入它的子包下的其它类

public class PkgTest {

    @Test
    public void testPkg(){
        Date date=new Date();
        System.out.println(date.toString());

        int[] numbs1=new int[3];
        int[] numbs2=new int[]{1,2,3};
        int[] numbs={2,3,4,5};
        System.out.println(Arrays.toString(numbs));
        System.out.println(Arrays.toString(numbs1));
        System.out.println(Arrays.toString(numbs2));

        Collections c;

        ZipFile zipFile;


    }

}
