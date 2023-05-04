// package Assignment12;

// TwoDArray.java
import java.util.Scanner;

class TwoDArray {
    int[][] array;
    int m, n;

    // Constructor to allocate memory size (m x n) for the array
    public TwoDArray(int m, int n) {
        this.m = m;
        this.n = n;
        array = new int[m][n];
    }

    // Method to input data into the array
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element at index (" + i + ", " + j + "): ");
                array[i][j] = sc.nextInt();
            }
        }
    }

    // Method to display the array element in row-wise
    public void displayRowWise() {
        System.out.println("Array elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to split the array into two different arrays
    public int[][][] splitArray() {
        int[][][] split = new int[2][m / 2][n];

        for (int i = 0; i < m / 2; i++) {
            for (int j = 0; j < n; j++) {
                split[0][i][j] = array[i][j];
                split[1][i][j] = array[i][j + n / 2];
            }
        }

        return split;
    }
}

// OneDArray.java
class OneDArray {
    int[] array;
    int n;

    // Constructor to allocate memory of size (n)
    // has the column size of 2D Array class
    public OneDArray(int n) {
        this.n = n;
        array = new int[n];
    }

    // Method to show the array
    public void showArray() {
        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

// Array_Split_Array.java

public class splt {
    public static void main(String[] args) {
        TwoDArray a = new TwoDArray(2, 4);
        a.inputData();
        a.displayRowWise();

        int[][][] splitA = a.splitArray();
        OneDArray a1 = new OneDArray(a.n);
        OneDArray a2 = new OneDArray(a.n);

        for (int i = 0; i < a.m; i++) {
            for (int j = 0; j < a.n / 2; j++) {
                a1.array[i * a.n / 2 + j] = splitA[0][i][j];
                a2.array[i * a.n / 2 + j] = splitA[1][i][j];
            }
        }

        System.out.println("Array A splitted into two 1D arrays:");
        a1.showArray();
        a2.showArray();
    }
}
