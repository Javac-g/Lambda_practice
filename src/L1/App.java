package L1;

public class App {


    static <T> String S_run(Stool<T> tool, T[] values, T t){

        return  tool.function(values,t);

    }

    static <T> Integer I_run(Itool<T> tool , T[] values,T t){

        return tool.function(values,t);

    }

    static <V,T> V A_run(Atool<V,T> tool, T[] values, T t){

        return tool.function(values,t);

    }
    public static void main(String...args){

        Integer[] nums = {1,2,3,4,5,3,2,1,34,5,3,2,1,1,11,1,1,1,1};
        String[] str ={"one" , "one" , "one" ,"one"};

        System.out.println(S_run(Metod::words,str,"one"));
        System.out.println(S_run(Metod::words,nums,1));
        System.out.println(I_run(Metod::digits,str,"one"));
        System.out.println(I_run(Metod::digits,nums,1));

        System.out.println("" + A_run(Metod::words,str,"one"));
        System.out.println("" + A_run(Metod::words,nums,1));
        System.out.println("" + A_run(Metod::digits,str,"one"));
        System.out.println("" + A_run(Metod::digits,nums,1));







    }

}
