package L5;

public class App {
    static <T> String S_Runner(Stool<T> tool,T[] values,T t){

        return tool.function(values,t);

    }
    static <T> Integer I_Runner(Itool<T> tool,T[] values, T t){

        return tool.function(values,t);

    }
    static <V,T> V A_Runner(Atool<V,T> tool, T[] values,T t){

        return tool.function(values,t);

    }
    public static void main(String...args){

        Integer[] nums = new Integer[] {1,2,3,4,51,1,1,1,1,1,1};
        String[] str = new String[]{"one","one","one"};

        System.out.println("String: " + S_Runner(Metods::Words,nums,1));
        System.out.println("String: " + S_Runner(Metods::Words,str,"one"));

        System.out.println("Integer: " + I_Runner(Metods::Digits,nums,1));
        System.out.println("Integer: " + I_Runner(Metods::Digits,str,"one"));

        System.out.println("Generic: " + A_Runner(Metods::Words,nums,1));
        System.out.println("Generic: " + A_Runner(Metods::Words,str,"one"));

        System.out.println("Generic: " + A_Runner(Metods::Digits,nums,1));
        System.out.println("Generic: " + A_Runner(Metods::Digits,str,"one"));




    }
}
