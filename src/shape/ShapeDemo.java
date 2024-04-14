package shape;

import interfaces.DrawShape;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape p = new Shape(10,20){
            @Override
            public void draw() {
                System.out.println("Рисуем точку с координатами (" + x + ", " + y + ")");
            }
        };
        p.draw();
        DrawShape ds = new DrawShape() {
            @Override
            public void draw() {
                System.out.println("Еее солай де");
            }
        };
        ds.draw();
    }
}
