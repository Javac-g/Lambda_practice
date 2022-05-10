package L3;

public class App {

    static <T> String S_run(Stool<T> tool, T[] values, T t){

        return tool.function(values,t);

    }
    static <T> Integer I_run(Itool<T> tool , T[] values, T t){

        return tool.function(values,t);

    }
    static <V,T> V All (Atool<V,T> tool, T[] values, T t){

       return tool.function(values,t);

    }


    public static void main(String...args){
        Integer[] nums ={1,2,3,4,5,5,5,5,5,5,5,5,55,5,5};
        String[] str = {"one","one","one","one","one","one","one","one","one",};

        System.out.println("Values: " + S_run(Method::words,nums,5));
        System.out.println("Values: " + S_run(Method::words,str,"one"));
        System.out.println("Values: " + I_run(Method::digits,str,"one"));
        System.out.println("Values: " + I_run(Method::digits,nums,5));

        System.out.println("Values: " + All(Method::words,nums,5));
        System.out.println("Values: " + All(Method::words,str,"one"));
        System.out.println("Values: " + All(Method::digits,str,"one"));
        System.out.println("Values: " + All(Method::digits,nums,5));









    }

}
