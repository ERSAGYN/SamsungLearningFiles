package abc;

public class Generic {
    public static void main(String[] args) {
        Test t = new Test<Integer, String>(10, "Hello");
        t.print();
        t.setData1(15);
        t.setData2("World!");
        t.print();
        Test t1 = new Test(true, false);
        t1.print();
    }
}
