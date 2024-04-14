public class Codes {
    public static void example1() {
        String source = "The quick fox jumps over the lazy dog";
        StringBuilder reversed = new StringBuilder();
        for(int i = source.length() - 1; i > 0; i--) {
            reversed.append(source.charAt(i));
        }
        System.out.println(reversed);
    }
    public static void example2() {
        int value1 = randomValue(100);
        int value2 = randomValue(100);
        System.out.println(String.format("Two random values: %d, %d", value1, value2));
    }
    private static int currentRandomValue = 377;
    private static int randomValue(int maxValue) {
        currentRandomValue = currentRandomValue*1103515245+12345;
        return Math.abs(currentRandomValue/65536)%(maxValue+1);
    }
    private static void example3() {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if(a && b && c) {
            System.out.println("Loading data");
        } else {
            System.out.println("data loaded");
        }
    }
//        int[][] arr = new int[5][6];
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = (int)(Math.random()*99);
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for(int i = 0; i < arr[2].length; i++) {
//            System.out.print(arr[2][i] + " ");
//        }

//        int[] numbers = new int[20];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = (int)(Math.random()*1000);
//        }
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//        String[] cars = {"Toyota", "Mercedes", "BMW", "Audi"};
//        Arrays.sort(cars);
//        System.out.println(Arrays.toString(cars));
//        Arrays.sort(cars, Collections.reverseOrder());
//        System.out.println(Arrays.toString(cars));

/*
        double[] doubles = {5.1,3.2,3.5,4.2,3.4};
        double sum = 0, multiplication = 1;
        int i =0;
        System.out.println("Все цифры: ");
        while(i < doubles.length) {
            System.out.print(doubles[i] + " ");
            sum += doubles[i];
            i++;
        }
        System.out.println("\nСумма цифр: " + sum);
        for(int j = 0; j < doubles.length; j++) {
            multiplication *= doubles[j];
        }
        System.out.println("Произведение цифр: " + multiplication);
        System.out.print("Четные индексы:");
        for(int j = 0; j < doubles.length; j++) {
            if(j % 2 == 0) System.out.print(doubles[j] + " ");
        }
        System.out.print("\nНечетные индексы: ");
        for(int j = 0; j < doubles.length; j++) {
            if(j % 2 == 1) System.out.print(doubles[j] + " ");
        }*/
/*
        int[] arr = {30,20,10,0};
        int pos1 = Arrays.binarySearch(arr, 20);
        int pos2 = Arrays.binarySearch(arr, 25);
        System.out.println(pos1);
        System.out.println(pos2);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
*/
/*        double[] myArray = {11,5.8, 11.1,10.9};
        double min = Double.MAX_VALUE;
        for (double v : myArray) {
            min = Math.min(min, v);
        }
        System.out.println(min);*/
/*        String[] weekDays = new String[7];
        weekDays[0] = "Monday";
        weekDays[1] = "Tuesday";
        weekDays[2] = "Wednesday";
        weekDays[3] = "Thursday";
        weekDays[4] = "Friday";
        weekDays[5] = "Saturday";
        weekDays[6] = "Sunday";
        System.out.println(weekDays[6]);

        double[] dbl = {2.3,3.1,4.3,5.0};
        System.out.println(dbl[0]);

        for (double a: dbl) {
            System.out.println(a);
        }*/
/*        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*3);
            System.out.println(arr[i]);
        }*/
/*        String regex = "www.(\\w+\\.)([a-z]{2,4})";
        String s = "адреса эл. почты: ivanov@gmail.com, sidorov@bsu.by!, www.google.com , www.ersa.ru";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while(matcher.find()) {
            System.out.println("site: " + matcher.group());
        }*/
/*        double x = 1000.0 / 3.0;
        Formatter f = new Formatter();
        f.format("I live in %1$s. %1$s is the capital of %2$s. %2$s is the country in %3$s. %3$s in %4$s. %4$s on %5$s. %5$s is in %6$s", "Astana", "Kazakhstan", "Asia", "Eurasia", "Earth", "Universe");
        System.out.println(f);*/
        /*String s = JOptionPane.showInputDialog(null, "Ersa");
        if(s != null && !s.equals("")) {
            StringBuilder sb = new StringBuilder(s);
            if(sb.toString().equals(sb.reverse().toString())) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }*/
/*        sb.replace(4, 11, "был");
        System.out.println("После замены: " + sb);*/
/*        StringBuilder str = new StringBuilder(40);
        int a = 3, b = 56;
        String s = str.append(a).append("+").append(b).append("=").append(a+b).toString();
        System.out.println(s);
        str.delete(0, str.length());
        s = str.append(a).append("-").append(b).append("=").append(a-b).toString();
        System.out.println(s);
        str.delete(0, str.length());
        s = str.append(a).append("*").append(b).append("=").append(a*b).toString();
        System.out.println(s);*/
/*        String[] names = {"Ерсагын","Нурасыл", "Даниар"};
        String[] subjects = {"Calculus","Linear Algebra", "English"};
        String[] grade = {"0","70", "100"};
        System.out.println("Студент " + names[0] + " получил " + grade[2] + " по " + subjects[1]);
        System.out.println("Студент " + names[1] + " получил " + grade[0] + " по " + subjects[0]);
        System.out.println("Студент " + names[2] + " получил " + grade[1] + " по " + subjects[2]);*/
/*        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());*/
/*        System.out.println("Welcome to Astana!!!".substring(11,17));
        String s = String.join("+","foobar","Ersa", "Не важно что то напишите","Ну и выводим");
        System.out.println(s);
        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());
        System.out.println(" ".isBlank());*/
/*        System.out.println("Hello ".concat("world"));
        System.out.println("Hello".replace('l', 'w'));
        System.out.println("Hello".toUpperCase());
        System.out.println(" Hello worlds! ".trim());
        System.out.println("");*/
/*        String[] animals = {"Хаски", "Моржи"};
        String[] foods = {"Колбаски", "Коржи"};
        String s1 = animals[0] + " едят " + foods[0];
        String s2 = animals[1] + " едят " + foods[1];
        System.out.println(s1 + "\n"+s2);*/
/*        System.out.println("Foobar".endsWith("bar"));
        System.out.println("Foobar".startsWith("Foo"));
        System.out.println("Foobar".contains("oob"));
        System.out.println("Foobar".regionMatches(2,"ob",0,2));
        char c = "abc".charAt(1);
        System.out.println(c);
        String s = "Для работы со строками в языке Java используются классы String, StringBuilder, StringBuffer.";
        System.out.println(s);
        System.out.println(s.indexOf('S'));
        System.out.println(s.indexOf("String", 60));
        System.out.println(s.lastIndexOf('S'));
        System.out.println(s.lastIndexOf("String"));*/
/*        String str = "ersa";
        System.out.println("str " + str.length());
        String str2 = new String(str);
        System.out.println(str2);

        byte[] bytes = {65,66,67,68,69};
        String s =new String(bytes);
        System.out.println(s);*/
//        Scanner scan = new Scanner(System.in);
//        for(int i = 1; i <= 10; i++) {
//            for(int j = 1; j <= 10; j++) {
//                System.out.print(i*j + " ");
//            }
//            System.out.println();
//        }
//        float money;
//        int months, i =0;
//        money = scan.nextFloat();
//        months = scan.nextInt();
//        do{
//            money += money * 0.07;
//            i++;
//        } while (i < months);
//        System.out.println(money);
/*    public static boolean oddIndexes() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a == 0) return;
        if() System.out.print(a);
        return !oddIndexes();
    }*/
/*    public static void odds() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a == 0) return;
        if(a % 2 == 1) System.out.print(a);
        odds();
    }*/
/*    public static boolean isPalindrome(String a) {
        if(a.charAt(0) == a.charAt(a.length() - 1)) {
            if(a.length() == 2 || a.length() == 1) return true;
            return isPalindrome(a.substring(1, a.length() - 1));
        }
        return false;
    }*/
/*    public static void number(int a) {
        System.out.print(a % 10 + " ");
        if(a / 10 == 0) return;
        number(a / 10);
    }*/
/*    public static void isPowerOfTwo(int a) {
        if(a % 2 == 0) {
            isPowerOfTwo(a/2);
            return;
        } else if(a % 2 == 1) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }*/
/*    public static void fromAtoB(int a, int b) {
        System.out.print(a + " ");
        if(a == b) return;
        if(a > b) fromAtoB(a-1, b);
        if(a < b) fromAtoB(a+1, b);
    }*/
}
