package AllThemesFromStart.VariableCatch;

public class Main {
    public static void main(String...args){
        int num = 100;

        MyInterface myInterface = (n)->{
            //num++ will not work

            //num = 9 same
            return n++;
        };

    }
}
