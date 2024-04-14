package reader;

public class Reader {
    String fullName;
    String cardNumber;
    String faculty;
    String dateOfBirth;
    String phone;

    public void takeBook(int count) {
        System.out.println(fullName + " took " + count + " books.");
    }

    public void takeBook(String... titles) {
        System.out.println(fullName + " took ");
        for(String s: titles) {
            System.out.print(s + " ");
        }
    }
    public void takeBook(Book... books) {
        System.out.println(fullName + " took ");
        for(Book b: books) {
            System.out.print(b.getName() + " ");
        }
    }

    public void returnBook(int count) {
        System.out.println(fullName + " returned " + count + " books.");
    }

    public void returnBook(String... titles) {
        System.out.println(fullName + " returned ");
        for(String s: titles) {
            System.out.print(s + " ");
        }
    }
    public void returnBook(Book... books) {
        System.out.println(fullName + " returned ");
        for(Book b: books) {
            System.out.print(b.getName() + " ");
        }
    }
}
