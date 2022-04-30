package Nine;

public class App {
    static <T> String S_runner(Stool<T> tool, T[] values, T t){

        return tool.function(values,t);

    }

    static <T> Integer I_runner(Itool<T> tool,T[] values, T t){

        return tool.function(values,t);

    }

    static <V,T> V All(Atool<V,T> tool, T[] values, T t){

        return tool.function(values,t);

    }
    public static void main(String ...args){

        Integer[] nums = {1,2,1,1,1,1,1,1,1,1,13,4,5,6};
        String[] str = {"on","on","on","on","on","on","on","on","on","on","on","on"};

        System.out.println(S_runner(Metod::words,str,"on" ));
        System.out.println(S_runner(Metod::words,nums,1));

        System.out.println(I_runner(Metod::digits,str,"on" ));
        System.out.println(I_runner(Metod::digits,nums,1));

        System.out.println("" + All(Metod::words,str,"on" ));
        System.out.println("" + All(Metod::words,nums,1));

        System.out.println("" + All(Metod::digits,str,"on" ));
        System.out.println("" + All(Metod::digits,nums,1));






    }
}
