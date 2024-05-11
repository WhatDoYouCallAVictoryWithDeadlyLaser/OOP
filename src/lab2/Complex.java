package lab2;

public class Complex {
    private double im;
    private double re;

    public void setIm(double im) {
        this.im = im;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public double getRe() {
        return re;
    }

    public Complex(double im, double re) {
        this.im = im;
        this.re = re;
    }
    
    public Complex() {
    }
    
    public void Input() {
        
    }
    
    public void Print() {
    System.out.print(this.re + " + " + this.im + "i");
    }
    
    public Complex Plus(Complex cp1)
    {
        double resultIm = this.im + cp1.getIm();
        double resultRe = this.re + cp1.getRe();
        return new Complex(resultRe, resultIm);
    }
    
    public Complex Minus(Complex cp1) {
        double resultIm = this.im - cp1.getIm();
        double resultRe = this.re - cp1.getRe();
        return new Complex(resultRe, resultIm);
    }
    
    public Complex Multiplication(Complex cp1) {
        double resultRe = this.re * cp1.getRe() - this.im * cp1.getIm();
        double resultIm = this.re * cp1.getRe() + this.im * cp1.getIm();
        return new Complex(resultRe, resultIm);
    }
    
    public Complex Division(Complex cp1) {
        double resultRe = (this.re * cp1.getRe() + this.im * cp1.getIm()) / (cp1.getIm() * cp1.getIm() + cp1.getRe() * cp1.getRe());
        double resultIm = (this.im * cp1.getRe() - this.re * cp1.getIm()) / (cp1.getIm() * cp1.getIm() + cp1.getRe() * cp1.getRe());
        return new Complex(resultRe, resultIm);
    }
}
