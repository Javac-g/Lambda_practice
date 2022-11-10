package practice_10_11_2022.LinksToCOnstructors;

public class Main {
    static <T,V> T factory(C<T,V>c , V val){
       return c.function(val);
    }
    public static void main(String...args){
        A a = Box :: new;

        B<Integer> b = Circle::new;
        B<String> bb = Circle::new;
        C<Box,Integer> c1 = Box::new;
        C<Circle<String>,String> c2 = Circle::new;

        Box box = a.function(10);

        Circle<Integer> fcircle = b.function(32);
        Circle<String> scircle = bb.function("Hello");

        Box bx = factory(c1,10);
        Circle<String> circle = factory(c2,"Hello");

        System.out.println(box.getA());
    }
}
