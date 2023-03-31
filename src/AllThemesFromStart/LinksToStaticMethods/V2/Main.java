package AllThemesFromStart.LinksToStaticMethods.V2;

public class Main {
    public static  String runS(MyFirst func, String t){
        return func.function(t);
    }

    public static void main(String...args){

        Code code = new Code();
        System.out.println(runS(Code::reverseOne,"hello world"));
        System.out.println(runS(code::reverseTwo,"dlrow olleh"));


    }
}
