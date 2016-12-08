/*
 *  @author Bulat Muzipov, 11-604
 *
 *  Variant 1, task 55 (http://study.istamendil.info/tasks/55)
 *  This program has methods and algorithms to work with complex numbers.
 *
 *
 *  @param Add returns the sum of A + B
 *  @param subtract returns the difference of A - B
 *  @param multiply returns the product of A * B
 *  @param divide returns the quotient of A / B
 *  @param Abs returns the absolute value of number
 */

import java.lang.Math;
import java.util.Scanner;

public class Complex {
    protected double real, imaginary;

    public Complex() {}

    public Complex(double a, double b) {
        this.real = a;
        this.imaginary = b;
    }

    public String toString() {
        if (imaginary >= 0) {
            return(real + " + " + imaginary + "i");
        }
        else {
            return(real + " - " + -imaginary + "i");
        }
    }

    /***************METHODS***************/

    public Complex Add(Complex num) {
        Complex sum = new Complex();

        sum.real = real + num.real;
        sum.imaginary = imaginary + num.imaginary;

        return(sum);
    }

    public Complex subtract(Complex num) {
        Complex diff = new Complex();

        diff.real = real - num.real;
        diff.imaginary = imaginary - num.imaginary;

        return (diff);
    }

    public Complex multiply(Complex num) {
        Complex prod = new Complex();

        prod.real = real * num.real - imaginary * num.imaginary;
        prod.imaginary = imaginary * num.real + real * num.imaginary;

        return(prod);
    }

    public Complex divide(Complex num) {
        Complex div = new Complex();
        double r, den;

        if(Math.abs(num.real) >= Math.abs(num.imaginary)) {
            r = num.imaginary / num.real;
            den = num.real + r * num.imaginary;
            div.real = (real + r * imaginary) / den;
            div.imaginary = (imaginary - r * real) / den;
        } else {
            r = num.real /num.imaginary;
            den = num.imaginary + r*num.real;
            div.real = (r * real + imaginary) / den;
            div.imaginary = (r* imaginary - real) / den;
        }

        return(div);
    }


    public double Abs() {
        double r, y, tmp, answer;

        r = Math.abs(real);
        y = Math.abs(imaginary);

        if (r == 0) {
            answer = y;
        }
        else if (y == 0) {
            answer = r;
        }
        else if (r > y) {
            tmp = y / r;
            answer = r*Math.sqrt((double) (1.0 + Math.pow(tmp, 2)));
        }
        else {
            tmp = r / y;
            answer = y * Math.sqrt((double) (1.0 + Math.pow(tmp, 2)));
        }

        return (answer);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part of complex number A: ");
        double real1 = sc.nextDouble();
        System.out.println("Enter imaginary part of complex number A: ");
        double imaginary1 = sc.nextDouble();
        System.out.println();
        System.out.println();
        System.out.println("Enter real part of complex number B: ");
        double real2 = sc.nextDouble();
        System.out.println("Enter imaginary part of complex number B: ");
        double imaginary2 = sc.nextDouble();

        Complex a = new Complex(real1, imaginary1);
        Complex b = new Complex(real2, imaginary2);

        System.out.println("A = " + a.toString());
        System.out.println("B = " + b.toString());

        Complex c = a.Add(b);
        System.out.println("A + B = " + c.toString());
        Complex d = a.subtract(b);
        System.out.println("A - B = " + d.toString());
        Complex e = a.multiply(b);
        System.out.println("A * B = " + e.toString() );
        Complex f = a.divide(b);
        System.out.println("A / B = " + f.toString() );

        System.out.println("Absolute value of A = " + a.Abs() );
        System.out.println("Absolute value of B = " + b.Abs() );
    }
