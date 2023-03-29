package AllThemesFromStart.LambdaAsArguments.V1;

public class Main {
    public static  String runner(MyInterface  interf,String str){
        return interf.func(str);
    }
    public static void main(String...args){
        System.out.println(runner((str)->str.toUpperCase(),"hello"));
        System.out.println(runner(String::toUpperCase,"hello"));
        System.out.println(runner(One::getSt,"hi"));

        MyInterface a = String::toUpperCase;
        String str = "abcdefg";
        System.out.println(runner(a,str));
    }
}
