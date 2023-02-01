package Task4;

import java.lang.reflect.Field;

public class Cat extends Animal{
    public Cat(int x1, int x2, int x3) {
        super(x1,x2,x3);

    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Animal cat = new Cat(1,2,3);
        Class<?> cl = cat.getClass();
        Class<?> cl1 = Animal.class;
        Field fldx1 = cl1.getDeclaredField("x1");
        Field fldx2 = cl1.getDeclaredField("x2");
        Field fldx3 = cl1.getDeclaredField("x3");
        fldx1.setAccessible(true);
        fldx2.setAccessible(true);
        fldx3.setAccessible(true);
        System.out.println("Old values: ");
        System.out.println(fldx1.getInt(cat));
        System.out.println(fldx2.getInt(cat));
        System.out.println(fldx3.getInt(cat));
        fldx1.setInt(cat,12);
        fldx2.setInt(cat,12);
        fldx3.setInt(cat,12);

        System.out.println("New values: ");
        System.out.println(fldx1.getInt(cat));
        System.out.println(fldx2.getInt(cat));
        System.out.println(fldx3.getInt(cat));





    }


}
