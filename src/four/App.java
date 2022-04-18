package four;

public class App {

    static <T> String S(words<T> tool, T[] vals, T t){
                                                        //used by String interface (words)
       return "" + tool.function(vals,t);               //to access int and string G method in Metod.java
                                                        //return type String
    }
    static <T> Integer I(digits<T> tool,T[] vals,T t){


        return tool.function(vals,t);                   //used by Integer interface (digits)
                                                        //to access int and string G method in Metod.java
    }                                                   //return type Integer
    static <T,V> T A(all<T, V> tool, V[] vals, V v){
                                                        //used by Generic interface (all)
                                                        //to access int and string G method in Metod.java
                                                        //return type T
       return tool.function(vals,v);

    }


    public static void main(String... args){
        String[] str = new String[]{"hi","my","name","Is","Maks","hi","hi","my","name","Is","Maks","hi","hi","my","name","Is","Maks","hi"};
        Integer[] vals = new Integer[]{1,2,3,4,4,4,3,3,2,3,4,3,2,1,2,3,4,5,5,6,7,8,1,2,3,1,2,1,1};

        System.out.println("hi present: "+ S(Metod::One,str,"hi"));
        System.out.println("1 present: " + S(Metod::One,vals,1));

        System.out.println("is present: "+ I(Metod::Two,str,"is"));
        System.out.println("4 present: " + I(Metod::Two,vals,4));

        System.out.println("name present: "+ A(Metod::One,str,"name"));
        System.out.println("3 present: " + A(Metod::One,vals,3));

        System.out.println("my present: "+ A(Metod::Two,str,"my"));
        System.out.println("2 present: " + A(Metod::Two,vals,2));


    }
}
