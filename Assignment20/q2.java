import java.util.*;

public class q2 {
    public static void main(String[] args) {
        LinkedList<String> np =new LinkedList<String>();
        // nodepack np = new nodepack();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1 for add: ");
            System.out.println("2 for remove: ");
            System.out.println("3 for removeFirst: ");
            System.out.println("4 for removeLast: ");
            System.out.println("5 for Exit(): ");

            System.out.print("Enter the Input Key: ");
            int key = sc.nextInt();

            switch (key) {
                case 1:
                    System.out.print("Enter String to add: ");
                    String value = sc.next();
                    np.add(value);
                    System.out.print(np + "");
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter Position to Remove: ");
                    np.remove(sc.nextInt());
                    System.out.print(np + "");
                    System.out.println();
                    break;
                case 3:
                    np.removeFirst();
                    System.out.print(np + "");
                    System.out.println();
                    break;
                case 4:
                    np.removeLast();
                    System.out.print(np + "");
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Exit Program.............");
                    System.exit(-1);
                    break;
            
                default:
                    System.out.println("Invalid Input!!!!");
                    break;
            }
            
        }
        
    }
    
}

