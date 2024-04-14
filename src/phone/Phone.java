package phone;

public class Phone {
    String number;
    String model;
    double weight;
    String name;
    public static int count = 0;

    Phone(String n, String m, double w) {
        this(n, m);
        weight = w;
    }

    Phone(String n, String m) {
        this();
        number = n;
        model = m;
    }

    Phone() {
        count++;
    }

    void receiveCall() {
        System.out.println("Звонит " + name);
    }

    String getNumber() {
        return number;
    }
}
