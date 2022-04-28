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
    public static void main(String...args){

        Integer[] arr1 = {1,1,1,1,2,2,3,3,3,3,4,4,5,5,5,5,5,5,56,6,6,6,6,6,6,7,7,7,7,7,8,8,8,8,8,8,8,9,9,9,9,9,9};
        String[] arr2 = {"one","one","two","two","two","three","one","one","two","two","two","three","one","one","two","two","two","three"};
        Double[] arr3 = {22.3,11.2,1.2,3.4,5.6,7.8,6.6,4.3,1.22};
        Float[] arr4 = {1.53F,2.34F,3.24556F,1234.45678F};
        Boolean[] arr5 = {true,false,true, true ,true,false,false,true,false , false,true,true,false,true, true ,true,false,false,true,false , false,true};








    }
}
