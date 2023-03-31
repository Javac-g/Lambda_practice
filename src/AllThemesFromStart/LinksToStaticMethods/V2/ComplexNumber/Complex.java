package AllThemesFromStart.LinksToStaticMethods.V2.ComplexNumber;

public class Complex {
    private final double re;
    private final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
    public void print(String txt){
        System.out.println(txt);
        System.out.print(re);
        if (im > 0) System.out.print(" +  j" + im);
        if (im<0){

            System.out.print(" - j" + (im * (-1)));
        }
        System.out.println();
    }
    public Complex add(Complex c){
        return new Complex(getRe() + c.getRe(), getIm() + c.getIm());
    }
    public Complex sub(Complex c){
        return new Complex(getRe() - c.getRe(), getIm() - c.getIm());
    }
}
