package practice_10_11_2022;

public class Main {
    public static void main(String...args){
        Tool x = str -> str.toUpperCase();
        Counter y = Integer::sum;
        Counter z = (int a,int b) -> a * a * a;
        Counter w = (a,b)  -> {
            int c = a * b;
            return c + 5;
        };
        System.out.println(x.function("hello"));
        System.out.println(y.count(4,5));
    }
}
