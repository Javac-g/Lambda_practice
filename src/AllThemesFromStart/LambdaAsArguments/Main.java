package AllThemesFromStart.LambdaAsArguments;

public class Main {
    public static  String runner(MyInterface  interf,String str){
        return interf.func(str);
    }
    public static void main(String...args){
        System.out.println(runner((str)->str.toUpperCase(),"hello"));
        System.out.println(runner(String::toUpperCase,"hello"));
    }
}
