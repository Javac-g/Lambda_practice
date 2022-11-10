package practice_10_11_2022.LinksToMethods;

public class Main {
    static  <T> String One(A<T> a ,T[] vals,T str){
        return a.function(vals,str);
    }
    static <T> Integer Two(B<T> b, T[] vals, T t){
        return b.function(vals,t);
    }
    static <T,V> T Three(C<T,V> c ,V[] vals, V v){
        return c.function(vals,v);
    }
    public static void main(String...args){
        String[] str = {"hello","Me","one","take","For"};
        Integer[] num = {1,2,3,4,3,2,3,1,3,4,3,2,1,2,3,4,3,2,1};
        System.out.println(One(Method::first,str,"hello"));
        System.out.println(One(Method::first,num,1));
        System.out.println(Two(Method::second,str,"take"));
        System.out.println(Two(Method::second,num,4));

        System.out.println("" + Three(Method::first,str,"hello"));
        System.out.println("" +Three(Method::first,num,1));
        System.out.println("" +Three(Method::second,str,"take"));
        System.out.println("" +Three(Method::second,num,4));


    }
}
