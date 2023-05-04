
// package Assignment11;
import java.util.Scanner;

class SortedArray {
    private int size;
    private int[] arr;

    public SortedArray(int size) {
        this.size = size;
        this.arr = new int[size];

    }

    public void inputElement() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " Element: ");
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public void showElement() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public void bubbleSort() {
        System.out.print("Before Sorting array: ");
        showElement();

        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i - 1; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("After Sorting array: ");
        showElement();
    }

}

public class customArray {
    public static void main(String args[]) {
        SortedArray s = new SortedArray(5);
        s.inputElement();
        // s.showElement();
        // s.bubbleSort();
    }
}
