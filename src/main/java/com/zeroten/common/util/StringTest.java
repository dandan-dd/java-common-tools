package com.zeroten.common.util;

import org.testng.annotations.Test;

public class StringTest {
    @Test
    public void test字符串的使用(){//字符串常量池和堆
        //指向常量池同一位置
        String str1="hello";
        String str2="hello";
        System.out.println(str1==str2);//true

        String str3="hello world";//常量池
        String str4=str1+" world";//堆新建
        System.out.println(str3==str4);//false

        String str5=new String("hello");//堆新建
        String str6=new String("hello");//堆新建
        System.out.println("str5=str6  :"+(str5==str6));//false

        String str7=str6.intern();//先去常量池找，找不到再在堆中创建
        System.out.println("str1=str7  :"+(str1==str7));
    }

    @Test
    public void testLength(){//长度
       String str1="hello,\uD835\uDD5D\uD835\uDD60\uD835\uDD60\uD835\uDD5C";
       System.out.println(str1);
        System.out.println(str1.length());//字符串总长
        System.out.println(str1.codePointCount(0,str1.length()));//点长
    }

    @Test
    public void testSubstring(){//子字符串
       String str1="hello,china.";
       String str2=str1.substring(7,str1.length());
       String str3=str1.substring(7);
       System.out.println(str2);
       System.out.println(str3);
       String str4=str1.substring(7,str1.length()-1);
       System.out.println(str4);
    }

    @Test
    public void testMerge(){//字符串拼接
        String str1="hello"+",world";
        str1+=".2019";
        System.out.println(str1);
    }

    @Test
    public void testFormat(){//代码格式化
        String str1="大写a:"+'A'+""+"\n";
        System.out.println(str1);
        String str2=String.format("大写a:%c ,它的ASCII码值是:%d %n",'A',(int)'A');
        System.out.println(str2);
    }

    @Test
    public void testEqual(){
        String str1="hEllo";
        String str2="hello";
        System.out.println(str1.equals(str2));//内容是否相等
        System.out.println(str1.equalsIgnoreCase(str2));//忽略大小写内容相等
    }

    @Test
    public void testJu(){
        String str1="hello";
        System.out.println(str1.startsWith("h"));//以什么开始
        System.out.println(str1.startsWith("he"));
        System.out.println(str1.startsWith(" h"));
        System.out.println(str1.startsWith("a"));

        System.out.println(str1.endsWith("llo"));//以什么结束
        System.out.println(str1.endsWith("o"));
        System.out.println(str1.endsWith("o "));
        System.out.println(str1.endsWith("a"));

        System.out.println(str1.contains("ello"));//包含
        System.out.println(str1.contains("ell"));
        System.out.println(str1.contains("hello"));
    }

    @Test
    public void testFind(){//寻找对应元素的下表
        String str1="hello word,today is 2019-12-12.say hi to me";
        int index=-1;
        do {
            int at1=str1.indexOf("o",index+1);
            if(at1==-1){
                break;
            }
            System.out.println(String.format("第%d位置是小写字母o",at1+1));
            index=at1;

        }while(true);

        int at2=str1.lastIndexOf("o");
        System.out.println(at2);

        int index2=str1.length();
        do {
            int at1=str1.lastIndexOf("o",index2-1);
            if(at1==-1){
                break;
            }
            System.out.println(String.format("第%d位是小写字母o",at1+1));
            index2=at1;
        }while(true);
    }

    @Test
    public void testRepl(){//替换
        System.out.println("hello,world".replace("o","O"));
        System.out.println("hello,world".replaceAll("o","O"));
    }

    @Test
    public void testRemovePlace(){//只能去前后空格，不能去中间空格
        String str1="                             hello,world ";
        System.out.println(str1.trim());
        System.out.println(str1.trim().toUpperCase());
        System.out.println(str1.trim().toLowerCase());

        String strEmpty="";//空字符串
        String strNull=null;//null
    }

    @Test
    public void testNew(){//效率：String <StringBuilder（线程安全）<StringBuffer
        String str1="hello";
        str1+=",";
        str1+="world";
        str1+=".";
        System.out.println(str1);

        StringBuilder sb1=new StringBuilder();
        sb1.append("hello");
        sb1.append(",");
        sb1.append("world");
        sb1.append(".");
        System.out.println(sb1.length());
        System.out.println(sb1.toString());

        sb1.setLength(10);
        System.out.println(sb1.toString());

        sb1.setLength(20);
        System.out.println(sb1.toString());
    }

    @Test
    public void testOpt1(){
        String str1="hello"+",world";
        System.out.println(str1);
        String str2=str1+"say hi.";
        System.out.println(str2);

        StringBuilder sb1=new StringBuilder();//效率高
        sb1.append(str1);
        sb1.append("say hi.");
        System.out.println(sb1.toString());
    }

    @Test
    public void testOpt2(){
        String str1="hello world";
        System.out.println(str1);
    }

    @Test
    public void testOpt3(){//循环里面尽量少代码
        long start=System.currentTimeMillis();
        String str="";
        for(int i=0;i<20000;i++){
            str+=i;
        }

        System.out.println(str.length());
        System.out.println(String.format("耗时：%d ms", System.currentTimeMillis()-start));

        str="";
        start=System.currentTimeMillis();
        for(int n=0;n<20000;n++){
            StringBuilder sb=new StringBuilder();
            sb.append(str);
            sb.append(n);
            str=sb.toString();
        }
        System.out.println(str.length());
        System.out.println(String.format("耗时：%d ms",System.currentTimeMillis()-start));

        str="";
        start=System.currentTimeMillis();
        StringBuilder sb1=new StringBuilder();
        for(int m=0;m<20000;m++){
            sb1.append(str);
            sb1.append(m);
        }
        str=sb1.toString();
        System.out.println(str.length());
        System.out.println(String.format("耗时：%d ms",System.currentTimeMillis()-start));
    }

    @Test
    public void zhi代码(){
        String s1="hello"+",world";
        String s2="hello";
        s2+=",world";
        String s3="hello,world";
        String s4=s2.intern();
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s2==s3);
        System.out.println(s2==s4);
    }

    //面试题中的练习
    public String trimAll(String str){//去开头之间结尾的空格
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==' '){
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public String reverse(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(str.length()-1-i);
            sb.append(c);
        }
        return sb.toString();
    }

    @Test
    public void trimAllTest(){
        String str="sd sdf sdf 3 4 3 4 ";
        System.out.println(trimAll(str));
    }

    @Test
    public void reverseTest(){
        String str=" d dy8879  88 %*& d dd ll 33#   %";
        System.out.println(reverse(str));
    }


}
