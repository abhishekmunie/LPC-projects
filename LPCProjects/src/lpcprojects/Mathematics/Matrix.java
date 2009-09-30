package lpcprojects.Mathematics;

/**
 * This class provide a numbel of general Matrix Operations.
 * The object of this class represents a Matrix.
 * @author Abhishek
 */
public class Matrix implements Comparable {

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    /*~~~~~~~~~~~~~Member Variable & Method~~~~~~~~~~*/
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    int[][] elements;

    public Matrix(int[][] elements) {
        
        this.elements = elements;
    }

    public Matrix(int rows, int column) {
        this.elements = new int[rows][column];
    }

    public Matrix get() {
        return this;
    }

    public void set(Matrix m) {
        this.setElements(m.getElements());
    }

    public int[][] getElements() {
        return elements;
    }

    public void setElements(int[][] elements) {
        this.elements = elements;
    }

    public void setElementAt(int rowNo, int columnNo, int value) {
        this.elements[rowNo][columnNo] = value;
    }

    public int getElementAt(int rowNo, int columnNo) {
        return this.elements[rowNo][columnNo];
    }

    public int getNumberOFRows() {
        return elements.length;
    }

    public int getNumberOFColumns() {
        return elements[0].length;
    }

    public void add(Matrix M) throws MatrixException {
        set(add(this, M));
    }

    public void substract(Matrix M) throws MatrixException {
        set(substract(this, M));
    }

    public void multiply(Matrix M) {
        set(multiply(this, M));
    }

    public void transpose() {
        set(transpose(this));
    }

    public int[] getLeftDiagonal() {
        return getLeftDiagonal(this);
    }

    public int[] getRightDiagonal() {
        return getRightDiagonal(this);
    }

    public void printLeftDiagonal() {
        printLeftDiagonal(this);
    }

    public void printRightDiagonal() {
        printRightDiagonal(this);
    }

    public int sumLeftDiagonal() {
        return sumLeftDiagonal(this);
    }

    public int sumRightDiagonal() {
        return sumRightDiagonal(this);
    }


    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    /*~~~~~~~~~~~~~Static Variable & Method~~~~~~~~~~*/
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static Matrix add(Matrix A, Matrix B) throws MatrixException {
        if (A.getNumberOFRows() != B.getNumberOFRows()) {
            throw new MatrixException("No. of rows of the Matrix to be added is not equal.", A, B);
        }
        if (A.getNumberOFColumns() != B.getNumberOFColumns()) {
            throw new MatrixException("No. of columns of the Matrix to be added is not equal.", A, B);
        }
        Matrix Sum = new Matrix(A.getNumberOFRows(), A.getNumberOFColumns());
        for (int i = 0; i < Sum.getNumberOFRows(); i++) {
            for (int j = 0; j < Sum.getNumberOFColumns(); j++) {
                Sum.setElementAt(i, j, (A.getElementAt(i, j) + B.getElementAt(i, j)));
            }
        }
        return Sum;
    }

    public static Matrix substract(Matrix A, Matrix B) throws MatrixException {
        if (A.getNumberOFRows() != B.getNumberOFRows()) {
            throw new MatrixException("No. of rows of the Matrix to be substracted is not equal.", A, B);
        }
        if (A.getNumberOFColumns() != B.getNumberOFColumns()) {
            throw new MatrixException("No. of columns of the Matrix to be substracted is not equal.", A, B);
        }
        Matrix Diff = new Matrix(A.getNumberOFRows(), A.getNumberOFColumns());
        for (int i = 0; i < Diff.getNumberOFRows(); i++) {
            for (int j = 0; j < Diff.getNumberOFColumns(); j++) {
                Diff.setElementAt(i, j, (A.getElementAt(i, j) - B.getElementAt(i, j)));
            }
        }
        return Diff;
    }

    public static Matrix multiply(Matrix A, Matrix B) {
        if (A.getNumberOFColumns() != B.getNumberOFRows()) {
            throw new MatrixException("No. of columns of the First Matrix and No. of rows of the Second Matrix to be multiplied is not equal.", A, B);
        }
        Matrix Product = new Matrix(A.getNumberOFRows(), B.getNumberOFColumns());
        for (int i = 0; i < Product.getNumberOFRows(); i++) {
            for (int j = 0; j < Product.getNumberOFColumns(); j++) {
                int pro = 0;
                for (int k = 0; k < A.getNumberOFColumns(); k++) {
                    pro += A.getElementAt(i, k) * B.getElementAt(k, j);
                }
                Product.setElementAt(i, j, pro);
            }
        }
        return Product;
    }

    public static Matrix transpose(Matrix matrix) {
        Matrix T = new Matrix(matrix.getNumberOFColumns(), matrix.getNumberOFRows());
        for (int i = 0; i < T.getNumberOFRows(); i++) {
            for (int j = 0; j < T.getNumberOFColumns(); j++) {
                T.setElementAt(i, j, matrix.getElementAt(j, i));
            }
        }
        return T;
    }

    public static int[] getLeftDiagonal(Matrix matrix) {
        int[] lD = new int[matrix.getNumberOFRows()];
        for (int i = 0; i < matrix.getNumberOFRows(); i++) {
            lD[i] = (matrix.getElementAt(i, i));
        }
        return lD;
    }

    public static int[] getRightDiagonal(Matrix matrix) {
        int[] rD = new int[matrix.getNumberOFRows()];
        for (int i = 0; i < matrix.getNumberOFRows(); i++) {
            rD[i] = (matrix.getElementAt(i, matrix.getNumberOFRows() - 1 - i));
        }
        return rD;
    }

    public static void printLeftDiagonal(Matrix matrix) {
        for (int i = 0; i < matrix.getNumberOFRows(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            System.out.println(matrix.getElementAt(i, i));
        }
    }

    public static void printRightDiagonal(Matrix matrix) {
        for (int i = 0; i < matrix.getNumberOFRows(); i++) {
            for (int j = 0; j < (matrix.getNumberOFRows() - 1 - i); j++) {
                System.out.print("\t");
            }
            System.out.println(matrix.getElementAt(i, matrix.getNumberOFRows() - 1 - i));
        }
    }

    public static int sumLeftDiagonal(Matrix matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.getNumberOFRows(); i++) {
            sum += matrix.getElementAt(i, i);
        }
        return sum;
    }

    public static int sumRightDiagonal(Matrix matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.getNumberOFRows(); i++) {
            sum += matrix.getElementAt(i, (matrix.getNumberOFRows() - 1 - i));
        }
        return sum;
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    /*~~~~~~~~~~~~~~Core Variable & Method~~~~~~~~~~~*/
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public String toString() {
        String st = "";
        for (int i = 0; i < elements.length; i++) {
            st += java.util.Arrays.toString(elements[i]) + "\n";
        }
        return st;
    }

    @Override
    public int compareTo(Object o) {
        int c = 0;
        for (int i = 0; i < this.getNumberOFRows(); i++) {
            for (int j = 0; j < this.getNumberOFColumns(); j++) {
                if (this.getElementAt(i, j) != ((Matrix)o).getElementAt(i, j)) {
                    c = -1;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
}
