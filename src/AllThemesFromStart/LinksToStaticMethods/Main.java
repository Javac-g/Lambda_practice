package AllThemesFromStart.LinksToStaticMethods;

public class Main {
    public static String runner(MyInterface myInterface,String str){
        return  myInterface.function(str);
    }
    public static void main(String...args){
        String in = "Hi my name is Max";
        String out = runner(Coder::code,in);
        System.out.println(out);
        Coder coder = new Coder();

        String s = runner(coder::reverse,out);
        System.out.println(s);
    }
}
