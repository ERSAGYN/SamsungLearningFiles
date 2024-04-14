package oop;

public class BoxDemo1 {
    public static void main(String[] args) {
        Box1 myBox = new Box1(10,20,30);
        //Box1 myBox2 = new Box1();

        /*myBox.setDim(10,20, 15);
        myBox2.setDim(9,3, 6);*/

        System.out.println("Box 1 volume = " + myBox.getVolume());
        //System.out.println("Box 2 volume = " + myBox2.getVolume());
    }
}
