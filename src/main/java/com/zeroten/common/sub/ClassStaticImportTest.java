package com.zeroten.common.sub;

//import com.zeroten.common.classobject.ClassStaticImport;//导包，若在同一个包下，则不用导
import org.testng.annotations.Test;
import static com.zeroten.common.classobject.ClassStaticImport.name;//静态导入
import static com.zeroten.common.classobject.ClassStaticImport.println;//静态导入

public class ClassStaticImportTest {

//    @Test
//    public void testUser1(){
//        System.out.println(ClassStaticImport.name);
//        ClassStaticImport.println();
//    }
//
    @Test
    public void testUser2(){
        System.out.println(name);
        println();
    }

}
