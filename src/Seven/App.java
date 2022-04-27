package Seven;

public class App {


    static <T> String S_runner(Stool<T> tool, T[] vals,T t){

        return tool.function(vals,t);

    }

    static <T> Integer I_runner(Itool<T> tool, T[] vals, T t){

        return tool.function(vals,t);

    }

    static <V,T> V All_runner(All<V,T> tool, T[] vals, T t){

        return tool.function(vals,t);

    }
    public static void main(String...args){

        Integer[] num = {1,2,3,4,5,6,7,1,1,1,1,2,3,3,3,3,2,2,3,4,4,5,4,4,3,2,1,1,2,3,4};
        String[] str = {"one","one","one"};

        System.out.println(S_runner(Metod::words,num,1));
        System.out.println(S_runner(Metod::words,str,"one"));

        System.out.println(I_runner(Metod::digits,num,4));
        System.out.println(I_runner(Metod::digits,str,"one"));

        System.out.println("" + All_runner(Metod::words,num,2));
        System.out.println("" + All_runner(Metod::words,str,"one"));

        System.out.println("" + All_runner(Metod::digits,num,3));
        System.out.println("" + All_runner(Metod::digits,str,"one"));






    }

}
