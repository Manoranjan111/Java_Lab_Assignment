// package Assignment8;
// 2)	Find all 4-digit numbers which satisfies the condition that, square of (first two digit last two digit) =original number. E.g., if a number is 3025 then (30+25) ^2=3025.
public class q2 {
    public static void main(String args[]) {
        
        int i,parseValue,firstTwoDigit,lastTwoDigit;
        for(i=1000;i<9999;i++){
            String s = String.valueOf(i);
            firstTwoDigit=Integer.parseInt(s.substring(0, 2));

            lastTwoDigit =Integer.parseInt(s.substring(2,4));

            parseValue = ((firstTwoDigit+lastTwoDigit)*(firstTwoDigit+lastTwoDigit));
            if(i == parseValue){
                System.out.println(i);
            }
        }
    }
}
