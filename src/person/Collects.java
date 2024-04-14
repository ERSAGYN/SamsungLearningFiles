package person;

import box.HeavyBox;

import java.util.*;

public class Collects {
    public static void main(String[] args) {

        ArrayList<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(300));
        boxes.add(new HeavyBox(100));
        boxes.add(new HeavyBox(200));
        boxes.add(new HeavyBox(400));

        for (HeavyBox b: boxes) {
            System.out.println(b.getWeight());
        }
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        boxes.get(0).setWeight(1);
        boxes.remove(boxes.size() - 1);

        for (HeavyBox b: boxes) {
            System.out.println(b.getWeight());
        }
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        TreeSet<HeavyBox> boxes1 = new TreeSet<>();
        boxes1.add(new HeavyBox(300));
        boxes1.add(new HeavyBox(100));
        boxes1.add(new HeavyBox(200));
        boxes1.add(new HeavyBox(400));

        for (HeavyBox b: boxes1) {
            System.out.println(b.getWeight());
        }
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        ArrayDeque<HeavyBox> boxes2 = new ArrayDeque<>();
        boxes2.offer(new HeavyBox(300));
        boxes2.offer(new HeavyBox(100));
        boxes2.offer(new HeavyBox(200));
        boxes2.offer(new HeavyBox(400));
        for (HeavyBox b: boxes2) {
            System.out.println(b.getWeight());
        }
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        boxes2.poll();
        for (HeavyBox b: boxes2) {
            System.out.println(b.getWeight());
        }



        /*TreeMap<Integer, String> states = new TreeMap<>();
        states.put(10,"Germnay");
        states.put(2, "Fries");
        states.put(6,"MOMO");
        String first = states.get(6);
        System.out.println(first);

        for (Map.Entry<Integer, String> item: states.entrySet()) {
            System.out.printf("Key: %d value: %s\n",item.getKey(), item.getValue());
        }
        Map<Integer, String> afterMap = states.tailMap(6);
        Map.Entry<Integer, String> lastItem = states.lastEntry();
        System.out.printf("key %d, value %s\n", lastItem.getKey(), lastItem.getValue());*/

//        PersonComparator personComparator = new PersonComparator();
        //Comparator<Person> personComparator = new PersonAgeComparator().thenComparing(new PersonAgeComparator());
        /*TreeMap<String, Person> people = new TreeMap<>();
        people.put("e",new Person("Mike"));
        people.put("ne",new Person("Tom"));
        people.put("eshtene",new Person("Nick"));
        for (Map.Entry<String, Person> item: people.entrySet()) {
            System.out.printf("Key: %s value: %s\n",item.getKey(), item.getValue().getFullName());
        }
        System.out.println();*/

        /*HashSet<String> states = new HashSet<>();
        states.add("Germany");
        boolean isAdded = states.add("Germany");
        System.out.println(isAdded);*/

        /*ArrayDeque<String> ersapo = new ArrayDeque<>();

        ersapo.add("Ersapo");
        ersapo.addFirst("First");
        ersapo.push("Pushed");
        ersapo.addLast("Last");
        ersapo.add("Konec");

        System.out.println(ersapo);

        String sFirst = ersapo.getFirst();
        System.out.println(sFirst);
        System.out.println(ersapo.size());

        ArrayDeque<Person> eee = new ArrayDeque<>();
        eee.addFirst(new Person("eee", 2));
        eee.addLast(new Person("ers", 3));
        for (Person p: eee) {
            System.out.println(p.getFullName());
        }*/
    }
}
