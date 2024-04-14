package inheritance;

public class BoxDemo {
    public static void main(String[] args) {
/*        Box box = new Box(15,10,25);
        HeavyBox heavyBox = new HeavyBox(15, 20, 20, 6);
        ColorBox colorBox = new ColorBox(25, 12, 30, "Red");
        System.out.println("Объем коробки = " + box.getVolume());
        System.out.println("Объем коробки = " + heavyBox.getVolume() + " вес " + heavyBox.weight);
        System.out.println("Объем коробки = " + colorBox.getVolume() + " цвет " + colorBox.color);*/
        Shipment shipment = new Shipment(2, 4, 5, 9, 7);
        System.out.println(shipment.cost);
        System.out.println(shipment.weight);

    }
}
