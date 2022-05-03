package Ten;

public class App {

    static <T> String s_run(Stool<T> tool,T[] values, T t){

        return  tool.function(values,t);

    }
    static <T> Integer i_run(Itool<T> tool, T[] values,T t){

        return tool.function(values,t);


    }

    static <V,T> V all(Atool<V,T> tool, T[] values, T t){

        return tool.function(values,t);

    }
    public static void main(String...args){
        Integer[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        String[] str = {"one","one","one","one","one","one","one","one","one"};

        System.out.println(s_run(Methods::words,nums,1));
        System.out.println(s_run(Methods::words,str,"one"));

        System.out.println(i_run(Methods::digits,nums,1));
        System.out.println(i_run(Methods::digits,str,"one"));

        System.out.println(" " + all(Methods::words,nums,1));

        System.out.println(" " + all(Methods::words,str,"one"));

        System.out.println(" " + all(Methods::digits,nums,1));

        System.out.println(" " + all(Methods::digits,str,"one"));








    }
}
