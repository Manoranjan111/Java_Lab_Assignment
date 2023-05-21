// package Assignment21;
// Write a program to show the use of NullPointerException.

public class q3 {
    public static void main(String[] args) {

        String ID = null;
        try {
             // because ptr is null
             if (ID .equals("a"))
             System.out.print("Same");
         else
             System.out.print("Not Same");
        } catch (NullPointerException  e) {
            System.out.println("Null Pointer Execption Caught"+e);
        }
    }
}
