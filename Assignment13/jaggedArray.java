import java.util.Scanner;

class storeMarks {
  int arr[][] = new int[5][];
  String student[] = { "child1", "child2", "child3", "child4", "child5" };
  int subjects[] = { 3, 5, 2, 6, 4 };

  public storeMarks() {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < student.length; i++) {
      arr[i] = new int[subjects[i]];
      int temp = 1;
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print("Enter " + student[i] + " sub" + (temp) + " marks: ");
        arr[i][j] = sc.nextInt();
        temp++;
      }
    }
    sc.close();
  }
}

public class jaggedArray {
  public static void main(String[] args) {
    storeMarks sm = new storeMarks();
    for (int i = 0; i < sm.student.length; i++) {
      System.out.println(sm.student[i]);
      int TotalMarks = 0;
      System.out.println("This is " + sm.student[i]);
      for (int j = 0; j < sm.arr[i].length; j++) {
        System.out.print(sm.arr[i][j] + "  ");
        TotalMarks += sm.arr[i][j];
      }
      System.out.println();
      System.out.println("Total Marks: " + TotalMarks);
    }
  }
}