package matrix;

public class Matrix {
    int[][] numbers;
    int rows;
    int columns;

    public Matrix(int[][] numbers) {
        this.numbers = numbers;
        this.rows = numbers.length;
        this.columns = numbers[0].length;
    }

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.numbers = new int[rows][columns];
    }

    public int[][] getNumbers() {
        return numbers;
    }

    public void addition(Matrix matrix) {
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.numbers[i][j] += matrix.getNumbers()[i][j];
            }
        }
    }

    public void multiplication(int number) {
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.numbers[i][j] *= number;
            }
        }
    }

    public void printout() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(this.numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
