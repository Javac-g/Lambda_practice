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





    }
}
