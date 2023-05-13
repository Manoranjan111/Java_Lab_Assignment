package statoppkg;
import java.util.Arrays;
public class statop {
    public int findAvg(int arr[]){
        int size = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int average = sum/size;
        return average;
    }
    public double findMedian(int array[]){
        Arrays.sort(array);
        int length = array.length;
        double median;

        // Check if the length of the array is odd
        if (length % 2 != 0) {
            median = array[length / 2];
        }
        // If the length is even, average the middle two elements
        else {
            int middleIndex = length / 2;
            median = (array[middleIndex - 1] + array[middleIndex]) / 2.0;
        }

        return median;
    }
}
