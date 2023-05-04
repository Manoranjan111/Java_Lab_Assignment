// package Assignment9;
class fraction {
  private int num;
  private int denom;

  public fraction() {
    num = 1;
    denom = 2;
  }

  public fraction(int x) {
    num = x;
    denom = 2;
  }

  public fraction(int x, int y) {
    num = x;
    denom = y;
  }

  public fraction(fraction f) {
    num = f.num;
    denom = f.denom;
  }

  public void showFraction() {
    System.out.println("value of num and denom is : " + num + "/" + denom);
  }

  public void add(fraction f) {
    fraction f1 = new fraction();
    f1.num = (num * f.denom) + (f.num * denom);
    f1.denom = (denom * f.denom);
    System.out.println("Adding of two Fraction : " + f1.num + "/" + f1.denom);
  }

  public void subtract(fraction f) {
    fraction f1 = new fraction();
    f1.num = (num * f1.denom) - (f1.num * denom);
    f1.denom = (denom * f.denom);
    System.out.println("Substraction of two Fraction : " + f1.num + "/" + f1.denom);
  }

  public void multiply(fraction f) {
    fraction f1 = new fraction();
    f1.num = (num * f.num);
    f1.denom = (denom * f.denom);
    System.out.println("Multiplication of two Fraction : " + f1.num + "/" + f1.denom);
  }

  public void div(fraction f) {
    fraction f1 = new fraction();
    f1.num = (num * f.denom);
    f1.denom = (denom * f.num);
    System.out.println("Division of two Fraction : " + f1.num + "/" + f1.denom);
  }

  // public void compare() {
  // fraction f1 = new fraction();
  // f1.num = (num * f1.denom)-(f1.num * denom);
  // f1.denom = (denom * f.denom);
  // System.out.println("Substraction of two Fraction : " + f1.num + "/" +
  // f1.denom);
  // }

  public void reduceFraction(fraction f) {
    int p = f.num;
    int q = f.denom;
    int gcd = findGCD(p, q);
    p /= gcd;
    q /= gcd;
    System.out.println("After Reducing Fraction is " + p + "/" + q);
  }

  private static int findGCD(int a, int b) {
    if (b == 0) {
      return a;
    }
    return findGCD(b, a % b);
  }

}

class fractionApp {
  public static void main(String[] args) {
    fraction f1 = new fraction(3, 6);
    f1.showFraction();
    f1.add(f1);
    f1.subtract(f1);
    f1.multiply(f1);
    f1.div(f1);
    f1.reduceFraction(f1);
    f1.showFraction();
  }
}
