public class q2 {
    public static void main(String[] args) {
        int[] arr = { 3, 7, 4, 25, 190, 2, 87 };
        int n = arr.length;
        int[] newValues = new int[n - 2];

        // Create new three-digit numbers and store them in newValues array
        for (int i = 0; i < n - 2; i++) {
            int num = arr[i] * 100 + arr[i + 1] * 10 + arr[i + 2];
            if (num >= 1000) {
                num = (num % 1000) + ((num / 1000) % 10) + (num / 10000);
            }
            newValues[i] = num;
        }

        // Find the maximum value in the newValues array
        int max = newValues[0];
        for (int i = 1; i < n - 2; i++) {
            if (newValues[i] > max) {
                max = newValues[i];
            }
        }

        // Print the new values and the greatest value
        System.out.print("New values are: ");
        for (int i = 0; i < n - 2; i++) {
            System.out.print(newValues[i] + " ");
        }
        System.out.println("\nGreatest value is: " + max);
    }
}
