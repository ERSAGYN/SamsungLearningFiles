package magic;

public class Magic {
    public static void main(String[] args) {
        Point p = new Point(10, 20);
        System.out.println(p);

        String s = "Наш объект: " + p;
        System.out.println(s);
        System.out.println("____________________________________");

        Point pNew = p;
        System.out.println(pNew);
        p.x = 30;
        System.out.println(pNew);
        pNew = p.clone();
        p.x = 50;
        System.out.println(pNew);

    }
}
