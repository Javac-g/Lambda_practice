package AllThemesFromStart.LambdaAsArguments.V2;

public class One {
    public static String myStringRunner(MyString func,String str){
        return func.getString(str);
    }
    public static <T> T myGenericRunner(MyGeneric<T> genfunc,T t){
        return genfunc.getSome(t);
    }

    public static <T,V> T myFullGeneric(FullGeneric<T,V>func, V v1,V v2){
        return func.function(v1,v2);
    }
    public static <Type ,Arg,F extends FullGeneric<Type,Arg>> Type mySecondFull(Arg arg1,Arg arg2,F func){
      return   func.function(arg1,arg2);
    }
    public static void main(String...args){
        //Using String type Functional Interface

        System.out.println("String without braces: " + myStringRunner(str -> str + " Maks","Hello"));
        System.out.println("String without type: " + myStringRunner((str)->str.toUpperCase(),"hello"));
        System.out.println("String with braces and type: " + myStringRunner((String str)->str.toUpperCase(),"hello"));
        System.out.println("String link to method: " + myStringRunner(String::toUpperCase,"upper case"));

        MyString arg = (String str)->{ // Arg - Block lambda expression
            String res = "";
            System.out.println("L: " + str.length());
            for (int i = str.length()-1; i >= 0;i--){
                res += str.charAt(i);
            }
            return res;
        };
        System.out.println("String created lambda block body passed: " + myStringRunner(arg,"Hello"));// arg-Passed here

        //Using Generic Functional Interface with args type bond. Return type and args type must be same T func(T t)
        System.out.println("Generic without braces and type: " + One.<Integer>myGenericRunner(x -> x * x,44));
                                                                //here called Static generic method with Type
        System.out.println("Generic without type: " + One.<String>myGenericRunner((x) -> x.toUpperCase(),"upper"));
        System.out.println("Generic with braces and type: " + One.<Double>myGenericRunner((Double x) -> x+x,4.44));
        System.out.println("Generic link to Method: " + One.<Double>myGenericRunner(Double::doubleValue,4.32));

        MyGeneric<Integer> arg2 = (Integer x) ->{//arg2 - block lambda expression body
            x = x + x * x;
            return x - 4;
        };
        System.out.println("Generic created lambda block body passed: " + One.<Integer>myGenericRunner(arg2,45)); // arg2 passed here

        System.out.println("Full generic without braces,type: " + One.<String,Integer>myFullGeneric((x,y) -> String.valueOf(x * y),67,88));
        System.out.println("My advanced full generic method: " + One.<Integer,Double,FullGeneric<Integer,Double>>mySecondFull(224.4,33.2,(x,y)->(x.intValue()+ y.intValue())));

    }
}
