import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println(1.0+1.0+1.0+1.0+1.0==5.0);
    }
}
 class Base {
    public static final String FOO = "foo";
public static void main(String[] args) {
        Base b = new Base();
Sub s=new Sub();
        System.out.print(Base.FOO);
        System.out.print(Sub.FOO);
        System.out.print(b.FOO);
System.out.print(s.FOO);
System.out.print(((Base)s).FOO);
}}
class Sub extends Base {public static final String FOO="bar";
}


class Test2 {public static void main(String[ ] args){ boolean[ ][ ] x = new boolean[3][ ];x[0] = new boolean[1];x[1] = new boolean[2];x[2] = new boolean[3];System.out.println("x[2][2] is " + x[2][2]);}}