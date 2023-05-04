// package Assignment8;
// Q 6) Generate the following pattern
// 10001        54321
// 01010        5432
// 00100        543
// 01010        54
// 10001        5

 public class q5 {
    static void pattern1() {
        int n = 5; // number of rows
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i == n - j + 1) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    
    static void pattern2() {
        int n = 5,i,j;
        for (i = 1; i <= n; i++) {
            for (j = n; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        pattern1();
        pattern2();
    }
}
