
// package Assignment12;
import java.util.Scanner;
// Q1 WAP in java to create two classes such as 2D Array and 1D Array
//     Members of 2D Array are:
// a> One 2D Array
// b> Constructor to allocate Memory size(2 X n) for the array.
// c> Input Data into the array
// d> Display the array Element in Row Wise
// e> Split the array into two different arrays and store then in the array available in two different objects of class OneArray.
// f> Add the arrays(m X N martices) of two objects of 2D Array class
// g> Multiply the arrays(m X n) of two objects of 2D Array class
//     Members of 1D Array class are:
//     a>One 1D Array
//     b>Constructor to allocate memory of size (n) has the column size of 2D Array class
//     c> Show the Array
class TwoDArray {
    private int size, m = 2;
    private int[][] arr;
    int n = size;

    public TwoDArray(int size) {
        this.size = size;
        this.arr = new int[2][size];

    }

    public void input_Element() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Emter " + i + j + " Element: ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public void show_Element() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][][] splitArray() {
        int[][][] split = new int[2][m / 2][n];

        for (int i = 0; i < m / 2; i++) {
            for (int j = 0; j < n; j++) {
                split[0][i][j] = arr[i][j];
                split[1][i][j] = arr[i][j + n / 2];
            }
        }

        return split;
    }
}

class OneDArray {
    private int size;
    private int[] arr;

    public OneDArray(int size) {
        this.size = size;
        this.arr = new int[size];

    }

    public void input_Element() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + i + " Element: ");
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public void show_Element() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

public class _1D_2DArray {
    public static void main(String[] args) {

        TwoDArray d2 = new TwoDArray(2);
        OneDArray d1 = new OneDArray(3);

        int[][][] splitA = d2.splitArray();
        OneDArray a1 = new OneDArray(d2.n);
        OneDArray a2 = new OneDArray(d2.n);

        d2.input_Element();
        d2.show_Element();

        d1.input_Element();
        d1.show_Element();

    }
}
