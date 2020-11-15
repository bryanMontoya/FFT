package com.company;

public class Complex {
    private double re;   // the real part
    private double im;   // the imaginary part

    // create a new object with the given real and imaginary parts
    public Complex(double real, double imagi) {
        this.re = real;
        this.im = imagi;
    }

    public void exp(Double a){
        this.re = Math.cos(a);
        this.im = Math.sin(a);
    }

    public Complex times(Double a){
        double real = a*this.re;
        double imag = a*this.im;
        return new Complex(real,imag);
    }

    public Complex suma(Complex a){
        double real = a.re + this.re;
        double imag = a.im + this.im;
        return new Complex(real,imag);
    }

    public String toStringC(Complex complejo1) {
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im <  0) return re + " - " + (-im) + "i";
        return re + " + " + im + "i";
    }
}