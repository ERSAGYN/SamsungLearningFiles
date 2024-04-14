package matrix;

public class MatrixDemo {
    public static void main(String[] args) {
        int[][] e = {{3,4,5},{3,5,6},{3,3,4}};
        Matrix m = new Matrix(e);
        m.printout();
        m.addition(m);
        m.printout();
        m.multiplication(5);
        m.printout();
    }
}
