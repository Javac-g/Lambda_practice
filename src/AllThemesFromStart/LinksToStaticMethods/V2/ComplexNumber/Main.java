package AllThemesFromStart.LinksToStaticMethods.V2.ComplexNumber;

public class Main {
    public static Complex runner(Tool tool,Complex c1,Complex c2){
        return tool.Function(c1, c2);
    }
    public static Complex oneRun(ToolOne tool,Complex argument){
        return tool.Function(argument);
    }

    public static void main(String... args) {

        Complex c1 = new Complex( 5,-8);
        Complex c2 = new Complex(5,6);

        c1.print("Complex number 1: ");
        c2.print("Complex number 2: ");

        Complex c3 = runner(Complex::add,c1,c2);
        Complex c4 = runner(Complex::sub,c1,c2);

        c3.print("Complex numbers sum: ");
        c4.print("Complex numbers sub: ");

        Complex c5 = oneRun(c1::add,c2);
        c5.print("Complex numbers sum: ");
    }
}
