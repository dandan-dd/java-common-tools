package com.zeroten.common.util;


public class CheckUtils {

    public static boolean isAnyEmpty(String[] strings){
        boolean AE=true;
        for(int i=0;i<strings.length;i++){
            if(strings[i]==""){
                AE=false;
            }
        }
        return AE;
    }

    public static boolean isEmpty(Object[] arr){
        boolean E=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==""||arr[i]==null){
                E=true;
            }
        }
        return E;
    }

    public static boolean equals1(String str1,String str2){
        boolean e=false;
        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                if(str1.charAt(i)==str2.charAt(i)){
                    e=true;
                }
            }
        }
        return e;
    }

    public static boolean equals2(Integer n1,Integer n2){
        boolean ee=false;
        if(n1==n2){
            ee=true;
        }
        return ee;
    }

}
