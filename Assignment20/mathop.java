package mathoppkg;
// Create a package named mathop. Define class MathsOperations with static
// methods to find the maximum and minimum of n numbers. Create another
// package statop. Define class StatsOperations with methods to find the average
// and median of n numbers. Import these packages to use the above methods to
// perform above operations on n numbers. 

public class mathop {
    public int max_Number(int arr[]){
        int size = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
               max = arr[i];
            }
        }
        return max;
    }
    public int min_Number(int arr[]){
        int size = arr.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
               min = arr[i];
            }
        }
        return min;
    }


}
