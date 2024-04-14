package phone2;

public class Phone2 {
    private String number;
    private String model;
    private double weight;

    public Phone2(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
        System.out.println("Создался объект");
    }

    public Phone2(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone2() {
        System.out.println("СоЗДАЛСЯ ОБЪЕКТ ");
    }

    public void receiveCall(String name) {
        System.out.println(name + " is ringing");
    }

    public void receiveCall(String name, String number) {
        System.out.println(name + " (" + number + ") is ringing");
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void sendMessage(String... number) {
        for(int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}
