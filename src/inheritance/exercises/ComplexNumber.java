package inheritance.exercises;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber c) {
        double real = c.getReal();
        double imaginary = c.getImaginary();

        add(real, imaginary);
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber c) {
        double real = c.getReal();
        double imaginary = c.getImaginary();

        subtract(real, imaginary);
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
