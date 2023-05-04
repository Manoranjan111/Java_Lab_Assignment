// package Assignment9;
// create a class complex having member variable real and imag.Also create constructor and methods as follows:
// complex()
// complex(int,int)
// complex(complex)
// void showComplex()
// complex addComplex(complex)
// complex substractComplex(Complex)
// Complex multiplyComplex(Complex)
// Write a java program to create objects of above class and perform operations as the methods specified above
class Complex {
    private int real;
    private int imag;

    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex(Complex c) {
        this.real = c.real;
        this.imag = c.imag;
    }

    public void showComplex() {
        System.out.println(this.real + " + " + this.imag + "i");
    }

    public Complex addComplex(Complex c) {
        int real = this.real + c.real;
        int imag = this.imag + c.imag;
        return new Complex(real, imag);
    }

    public Complex subtractComplex(Complex c) {
        int real = this.real - c.real;
        int imag = this.imag - c.imag;
        return new Complex(real, imag);
    }

    public Complex multiplyComplex(Complex c) {
        int real = (this.real * c.real) - (this.imag * c.imag);
        int imag = (this.real * c.imag) + (this.imag * c.real);
        return new Complex(real, imag);
    }
}

public class complexApp {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, 5);
        Complex c3 = new Complex(c1);

        c1.showComplex();
        
        Complex c4 = c1.addComplex(c2);
        c4.showComplex(); 
        
        Complex c5 = c2.subtractComplex(c3);
        c5.showComplex(); 
        
        Complex c6 = c1.multiplyComplex(c2);
        c6.showComplex(); 

    }
}
