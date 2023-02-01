package Task3;

import com.sun.java.swing.plaf.windows.WindowsTreeUI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ClassReflectionTest {
    private String name="";
    int num;
    public Integer sum;

    public ClassReflectionTest(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public  Integer getSum() {
        return sum;
    }

    public  void setSum(Integer sum) {
//        ClassReflectionTest.sum = sum;
    }
}
class Main{
    public static void main(String[] args) {

        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[35m";

        Class<?> cl = ClassReflectionTest.class;
        Field[] fieldArr = cl.getDeclaredFields();
        Method[] methodArr = cl.getDeclaredMethods();
        Constructor[] constructorArr = cl.getConstructors();
        int classMod = cl.getModifiers();

        System.out.println(s+ "Fields: ");
        for (Field fld : fieldArr) {
            System.out.println(s2+ "Field name: "+ s1+fld.getName()+s2+  "  Field type: "
                    +s1+fld.getType() +s2+"   modifier: " + s1+ fld.getModifiers());

        }
        System.out.println(s+ "methods: ");
        for (Method method : methodArr) {
            System.out.println(s2+"\tMethod name: "+ s1+ method.getName() + s2 + " \tmethod return: " + s1 +
                    method.getReturnType() + s2 + " \tparams: " + s1 + Arrays.asList(method.getParameters())+ s2 +
                    " \tmodifier: " +s1 + method.getModifiers());
        }
        System.out.println(s+ "constructors: ");
        for (Constructor constructor : constructorArr) {

            System.out.println(s2+"\tConstructor name: "+ s1+ constructor.getName() + s2 + " \tparams: " + s1 + Arrays.asList(constructor.getParameters())+ s2 +
                    " \tmodifier: " +s1 + constructor.getModifiers());
        }

    }
}