package practice_10_11_2022.Simple;

public class Main {
    public static void main(String...args){
        A x = str -> str.toUpperCase();
        B y = Integer::sum;
        B z = (int a, int b) -> a * a * a;
        B w = (a, b)  -> {
            int c = a * b;
            return c + 5;
        };
        C<String> one = str -> str.substring(3,6);
        C<Integer> two = num -> num++;

        D<Integer,String> d1 = str -> str.length();
        D<String,Integer> d2 = num -> "Number square: " + (num * num);

        System.out.println(x.function("hello"));
        System.out.println(y.count(4,5));
        System.out.println(d1.function("qwertyuioiuytrewq"));
        System.out.println(d2.function(45));


    }
}
