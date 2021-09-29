public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    public void addTwoParameters(double real, double imaginary){
       this.real += real;
       this.imaginary +=imaginary;

    }
    public void addOneParameters(ComplexNumber c){
 addTwoParameters(c.real,c.imaginary);
    }
    public void substractTwoParameters(double real, double imaginary){
        this.real-=real;
        this.imaginary-=imaginary;
    }
    public void substractOneParameters(ComplexNumber c){
        substractTwoParameters(c.real,c.imaginary);

    }
}

