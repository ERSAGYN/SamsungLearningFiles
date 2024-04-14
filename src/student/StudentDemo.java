package student;

public class StudentDemo {
    public static void main(String[] args) {
        Student aspirants[] = new Aspirant[6];
        Student students[] = new Student[6];

        for(int i = 0; i < 6; i++) {
            aspirants[i] = new Aspirant("firstName" + i, "lastName" + i, "group" + i, i, "work" + i);
            System.out.println("Aspirant " + aspirants[i].averageMark + " " + aspirants[i].getScholarShip());
            students[i] = new Student("firstName" + i, "lastName" + i, "group" + i, i);
            System.out.println("Student " + students[i].averageMark + " " + students[i].getScholarShip());
        }
    }
}
