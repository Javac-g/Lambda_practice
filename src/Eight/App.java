package Eight;

public class App {
    static <T> String S_runner(Stool<T> tool, T[] values, T t){

        return tool.function(values,t);

    }

    static <T> Integer I_runner(Itool<T> tool, T[] values, T t){

        return tool.function(values,t);

    }

    static <V,T> V All(All<V,T> tool, T[] values,T t){

        return tool.function(values,t);

    }
    static void get_things_happen(Integer[] arr1,String[] arr2,Double[] arr3, Float[] arr4,Boolean[] arr5){

        String msg = "Values matched: ";

        System.out.println(msg + S_runner(Metod::words,arr1,1));

        System.out.println(msg + S_runner(Metod::words,arr2,"one"));

        System.out.println(msg + I_runner(Metod::digits,arr1,2));

        System.out.println(msg + I_runner(Metod::digits,arr2,"two"));

        System.out.println(msg + All(Metod::digits,arr3,22.3)); //still return 0

        System.out.println(msg + All(Metod::words,arr3,22.3)); // same 0

        System.out.println(msg + All(Metod::digits,arr4,1.53F));//same 0

        System.out.println(msg + All(Metod::words,arr5,false));



    }
    public static void main(String...args){

        Integer[] arr1 = {1,1,1,1,2,2,3,3,3,3,4,4,5,5,5,5,5,5,56,6,6,6,6,6,6,7,7,7,7,7,8,8,8,8,8,8,8,9,9,9,9,9,9};

        String[] arr2 = {"one","one","two","two","two","three","one","one","two","two","two","three","one","one","two","two","two","three"}
                ;
        Double[] arr3 = {22.3,11.2,1.2,3.4,5.6,7.8,6.6,4.3,1.22};

        Float[] arr4 = {1.53F,2.34F,3.24556F,1234.45678F};

        Boolean[] arr5 = {true,false,true, true ,true,false,false,true,false , false,true,true,false,true, true ,true,false,false,true,false , false,true};

        get_things_happen(arr1,arr2,arr3, arr4,arr5);






    }
}
