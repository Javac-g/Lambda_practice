package J1.LinksToMethod;

public class App {
    static <S> String S_Runner(Stool<S> tool, S[] values, S s){

        return tool.function(values,s);

    }
    static <I> Integer I_Runner(Itool<I> tool, I[] values , I i){

        return tool.function(values,i);

    }
    static <A,V>A A_Runner(Atool<A,V> tool, V[] values, V v){

        return tool.function(values,v);

    }
    public static void main(String...args){

        Integer[] numb = {1,1,1,1,1,1,1,1,1,11,1,1,1,1,1,1,1,1,1,1,1};
        String[] str = {"one","one","one","one","one","one","one","one","one","one","one","one"};

        System.out.println("String Value: " + S_Runner(Method::words,str,"one"));
        System.out.println("String Value: " + S_Runner(Method::words,numb,1));

        System.out.println("Integer Value: " + I_Runner(Method::digits,str,"one"));
        System.out.println("Integer Value: " + I_Runner(Method::digits,numb,1));

        System.out.println("Generic Value: " + A_Runner(Method::words,str,"one"));

        System.out.println("Generic Value: " + A_Runner(Method::words,numb,1));

        System.out.println("Generic Value: " + A_Runner(Method::digits,str,"one"));

        System.out.println("Generic Value: " + A_Runner(Method::digits,numb,1));

    }
}
