package exceptions;

import javax.swing.*;

public class Exceptions {
    public static void main(String[] args){
        String in_1 = JOptionPane.showInputDialog(null, "1");
        String in_2 = JOptionPane.showInputDialog(null, "2");
        try {
            int a = Integer.parseInt(in_1);
            int b = Integer.parseInt(in_2);
            if(a <= 0 || b <= 0) throw new Exception();
            if(a > 100) throw new NegativeException();
            JOptionPane.showMessageDialog(null, "Sum" + (a+b));
        }
        catch (NegativeException e){
            System.out.println(e);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Вы не ввели число");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("fdfd");
        }
        finally {
            System.out.println("Программа закрывается");
        }
    }
}
