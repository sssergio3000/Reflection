package Task2;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Sergey Khaykov
 * @since 2023/1/29
 *
 */


public class Main {
    private String str = "world";
    private int i = 6;

    public Main() {
    }

    public Main(String str, int i) {
        this.str = str;
        this.i = i;
    }
    /**
     * @author Sergey Khaykov
     * @since 2023/1/29
     *
     */
@Deprecated
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static void main(String[] args) {



        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[35m";

        System.out.println(s2+"world");
    }
}
