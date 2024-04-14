import java.util.Scanner;

public class Calculator {
    public static boolean isValidNumber(String num) {
        if(num.length() == 0) return false;
        for(int i = 0; i < num.length(); i++) {
            if(num.charAt(i) < 48 || num.charAt(i) > 57) return false;
        }
        return true;
    }

    public static boolean isValidOperation(String operation) {
        if(operation.length() != 1) return false;
        if(operation.charAt(0) == '+') return true;
        if(operation.charAt(0) == '-') return true;
        if(operation.charAt(0) == '*') return true;
        if(operation.charAt(0) == '/') return true;
        return false;
    }

    public static int getInt() {
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        while(!isValidNumber(num)) {
            System.out.println("Введите правильное число!");
            num = scan.nextLine();
        }
        return Integer.parseInt(num);
    }

    public static char getOperation() {
        Scanner scan = new Scanner(System.in);
        String operation = scan.nextLine();
        while(!isValidOperation(operation)) {
            System.out.println("Введите правильную операцию! (+, -, *, /)");
            operation = scan.nextLine();
        }
        return operation.charAt(0);
    }

    public static int calc(int num1, int num2, char operation) {
        if(operation == '+') return num1 + num2;
        else if(operation == '-') return num1 - num2;
        else if(operation == '*') return num1 * num2;
        else return num1 / num2;
    }
}
