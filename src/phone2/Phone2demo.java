package phone2;

public class Phone2demo {
    public static void main(String[] args) {
        Phone2 first = new Phone2("87007030303", "ERSA", 1);
        Phone2 second = new Phone2("8777777878", "EEEE", 1.2);
        Phone2 third = new Phone2("3884844", "Ed", 1.3);

        Phone2 ersa = new Phone2("8700", "ersa");
        Phone2 ersa2 = new Phone2();

        System.out.println(first.getModel() + " " + first.getNumber() + " " + first.getWeight());
        System.out.println(second.getModel() + " " + second.getNumber() + " " + second.getWeight());
        System.out.println(third.getModel() + " " + third.getNumber() + " " + third.getWeight());

        first.receiveCall("Bireu");
        second.receiveCall("Ekinsheu");
        third.receiveCall("Ushinsheu");

        first.receiveCall("EEE", "9494");
        first.sendMessage("343", "435665", "3433", "34322243", "FDJKSHFDJS", "GFSJHFDSJ");

        Phone2 ersa3 = new Phone2();


    }
}
