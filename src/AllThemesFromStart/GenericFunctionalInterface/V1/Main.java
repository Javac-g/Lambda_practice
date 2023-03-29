package AllThemesFromStart.GenericFunctionalInterface.V1;

public class Main {
    public static void main(String...args){
        myFunction<String> myStr = (String str)->{
            StringBuilder result = new StringBuilder();
            for (int i = str.length()-1; i >= 0;i--){
                result.append(str.charAt(i));
            }
            return result.toString().toUpperCase();
        } ;
        System.out.println(myStr.method("Hello world"));

        myFunction<Integer> myInt = (Integer a) -> a * a + a + a;

        System.out.println(myInt.method(33));
    }
}
