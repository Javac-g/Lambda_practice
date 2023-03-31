package AllThemesFromStart.LinksToStaticMethods.V2.Counter;

public class Main {

    public static<T> boolean runner(MyInterf<T> f,T call,T arg){
        return f.function(call,arg);
    }
    public static void main(String...args){

        High one = new High(234);
        High two = new High(532);

        System.out.println("One temp is bigger than Two temp: " +  runner(High::isHighger,one,two));
        System.out.println("Two temp is bigger than One temp: " + runner(High::isHighger,two,one));


    }
}
