// package Assignment21;
// Define an array of size n and set some values to it. Show an
// ArrayIndexOutOfBoundException when trying to access the index that is more
// than size of the array
public class q2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        try {
            arr[5] = 3;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        
    }
}
