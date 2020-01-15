package chapter_8.exercise.exercise_8_11_complex_numbers;

/**
 *
 * imaginary numbers
 * real part + imaginary part * and -> where i -> the root of -1,
 * adds and subtracts
 */
public class Complex {

    private double realPart;
    private double theImaginaryPart;

    //complex numbers
    public Complex () {
        this.realPart = 1.0;
        this.theImaginaryPart = 1.0;
    }

    public Complex(double realPart, double theImaginaryPart) {
        this.realPart = realPart;
        this.theImaginaryPart = theImaginaryPart;
    }

    public void add(Complex complex2) {
        //complex 1
        double a = this.realPart;
        double b = this.theImaginaryPart;
        //complex 2
        double c = complex2.realPart;
        double d = complex2.theImaginaryPart;

        double realPart = a + c;
        double imaginaryPart = b + d; // -1 -> i to power 2
        if(realPart == 0 && imaginaryPart != 0 ) {
            System.out.println("result -> " + imaginaryPart + " i" + "\nresult real part -> " + realPart + " , imaginary part -> " + imaginaryPart);
        } else if(imaginaryPart == 0 && realPart != 0) {
            System.out.println("result -> " + realPart + " i" + "\nresult real part -> " + realPart + " , imaginary part -> " + imaginaryPart);
        } else if(realPart == 0 && imaginaryPart == 0) {
            System.out.println("result -> 0 ");
        } else {
            System.out.println("result -> " + realPart + (imaginaryPart < 0 ? " " : " + ") + imaginaryPart + " i" + "\nresult real part -> " + realPart + " , imaginary part -> " + imaginaryPart);
        }

    }


    public void subtract(Complex complex2) {
        //complex 1
        double a = this.realPart;
        double b = this.theImaginaryPart;
        //complex 2
        double c = complex2.realPart;
        double d = complex2.theImaginaryPart;

        double realPart = a - c;
        double imaginaryPart = b - d;
        if(realPart == 0 && imaginaryPart != 0 ) {
            System.out.println("result -> " + imaginaryPart + " i" + "\nresult real part -> " + realPart + " , imaginary part -> " + imaginaryPart);
        } else if(imaginaryPart == 0 && realPart != 0) {
            System.out.println("result -> " + realPart + " i" + "\nresult real part -> " + realPart + " , imaginary part -> " + imaginaryPart);
        } else if(realPart == 0 && imaginaryPart == 0) {
            System.out.println("result -> 0 ");
        } else {
            System.out.println("result -> " + realPart + (imaginaryPart < 0 ? " " : " + ") + imaginaryPart + " i" + "\nresult real part -> " + realPart + " , imaginary part -> " + imaginaryPart);
        }

    }


}
