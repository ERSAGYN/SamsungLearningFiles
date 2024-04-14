package animals;

public class Animal {
    String food;
    String location;
    String name;

    public Animal(String food, String location, String name) {
        this.food = food;
        this.location = location;
        this.name = name;
    }

    public void makeNoise() {
        System.out.println(name + " is making noise");
    }

    public void walk() {
        System.out.println(name + " is walking");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}
