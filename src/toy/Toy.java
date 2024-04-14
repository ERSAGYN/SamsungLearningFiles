package toy;

public class Toy {
    String name;
    int cost;
    String manufactrer;
    int age;

    public Toy (String name, int cost, String manufactrer, int age){
        this(name, cost, manufactrer);
        this.age=age;
        System.out.println("В конструкторе с 4 параметрами");
    }
    public Toy (String name, int cost, String manufactrer){
        this();
        this.name=name;
        this.cost=cost;
        this.manufactrer=manufactrer;
        System.out.println("В конструкторе с 3 параметрами");
    }
    public Toy(){
        System.out.println("В конструкторе по умолчанию");
    }
}

