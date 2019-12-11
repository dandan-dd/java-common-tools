"# java-common-tools" 

###课后练习
1.⾃⼰编写练习⼀下课程中的示例和练习。

2.编写数据验证⼯具类，并编写相应单元测试⽤例，具体要求如下：
  GitHub上创建项⽬java-common-tools
  创建maven项⽬（使⽤⾃⼰熟悉的IDE），并提交到GitHub上
  
  创建数据验证⼯具类com.zeroten.common.util.CheckUtils。（src/main/java⽬录下）
  
  为⼯具类编写如下数据验证⽅法（使⽤静态⽅法）：
  publicstaticbooleanisAnyEmpty(String...strings)
  String...strings为可变参数，你可以认为它是String[]strings。如果strings中有
  任意⼀个字符串为空，则返回false，否则返回true。
  
  publicstaticbooleanisEmpty(Object[]arr)
  判断引⽤类型数组是否为空，为空或null则返回true，否则返回false。
  
  publicstaticbooleanequals(Stringstr1,Stringstr2)
  判断str1字符串是否相等，相等则返回true，否则返回false。当其中⼀个是null时返回false。
  
  publicstaticbooleanequals(Integern1,Integern2)
  判断n1和n2的值是否相等，相等则返回true，否则返回false。当其中⼀个是null时返回false。

  编写测试类com.zeroten.common.util.CheckUtilsTest（src/main/test⽬录下）对数据验证⼯具
  类进⾏测试，设计的测试⽤例尽量把各种输⼊情况都考虑到。

  将作业提交GitHub并写清楚提交说明。
  
3.注册LeanCloud账号，并试着创建应⽤，安装它的客户端⼯具。
  后边web部分会⽤到LeanCloud来托管咱们⾃⼰写的应⽤，提前注册熟悉⼀下，
  ⽹址：https://www.leancloud.cn/
