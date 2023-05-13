// package Assignment20;
import mathoppkg.mathop;
import statoppkg.statop;

public class packageDemo {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        mathop mop = new mathop();
        int max = mop.max_Number(arr);
        System.out.println(max);
    
        statop sop = new statop();
        int avg = sop.findAvg(arr);
        System.out.println(avg);
    }
    

}
