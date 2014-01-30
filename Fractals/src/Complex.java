/*
    William Ames Spring 2010
    Complex class for use by the Mandelbrot class
*/

// Representation of complex numbers
public class Complex
{
    private double real, imag;

    public Complex() {
        real = 0;
        imag = 0;
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {return real;}
    public double getImag() {return imag;}

    public void setReal(double real) {this.real = real;}
    public void setImag(double imag) {this.imag = imag;}

    public static Complex add(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real,
                           c1.imag + c2.imag);
    }

    public static Complex mult(Complex c1, Complex c2) {
        double real = c1.real * c2.real   -   c1.imag * c2.imag;
        double imag = c1.real * c2.imag   +   c2.real * c1.imag;

        return new Complex(real, imag);
    }

    public double modulus() {
        return Math.sqrt(modSquared());
    }

    public double modSquared() {
        return real*real + imag*imag;
    }

    public boolean isNan() {
        return Double.isNaN(real) || Double.isNaN(imag);
    }

    public boolean isZero() {
        return real==0 && imag==0;
    }

    public String toString() {
        return "(" + real + "+" + imag + "i)";
    }
}