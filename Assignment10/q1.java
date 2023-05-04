import java.util.Scanner;

class CustomArray {
    private int size;
    private int[] arr;

    public CustomArray(int size) {
        this.size = size;
        this.arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public void setElement() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + i + " Element: ");
            arr[i] = sc.nextInt();

        }
        sc.close();
    }

    public void getElement() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public void occurence() {
        int[] unique = new int[arr.length];
        int[] count = new int[arr.length];
        int index = 0;
        boolean isUnique;

        for (int i = 0; i < arr.length; i++) {
            isUnique = true;
            for (int j = 0; j < index; j++) {
                if (arr[i] == unique[j]) {
                    count[j]++;
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[index] = arr[i];
                count[index] = 1;
                index++;
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.println(unique[i] + " occurs " + count[i] + " time(s)");
        }
    }

    public void swap() {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, maxPosition = 0, minPosition = 0;

        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxPosition = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minPosition = i;
            }
        }

        System.out.println();
        // int arr1 = new int[size];
        arr[maxPosition] = min;
        arr[minPosition] = max;
        System.out.print("After Swap: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public float average() {
        int sum = 0;
        float average;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        average = sum / size;
        return average;
    }

}

public class q1 {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        CustomArray arr = new CustomArray(5);
        arr.setElement();
        arr.swap();
        arr.occurence();

    }
}
