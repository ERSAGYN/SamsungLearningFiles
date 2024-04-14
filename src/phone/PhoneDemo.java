package phone;
public class PhoneDemo {
    public static void main(String[] args) {
        new Phone();
        System.out.println("dfksjf " + Phone.count);
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        phone1.name = "Nurasyl";
        phone2.name = "Daniyar";
        phone3.name = "Ersagyn";

        phone1.model = "Samsung";
        phone2.model = "iPhone";
        phone3.model = "Xiaomi";

        phone1.number = "87007022543";
        phone2.number = "87007007070";
        phone3.number = "87077393723";

        phone1.weight = 0.2;
        phone2.weight = 0.3;
        phone3.weight = 0.5;

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        phone1.receiveCall();
        phone2.receiveCall();
        phone3.receiveCall();

    }
}