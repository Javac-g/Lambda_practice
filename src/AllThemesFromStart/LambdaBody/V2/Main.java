package AllThemesFromStart.LambdaBody.V2;

public class Main {
    public static void main(String...args){
        //one-line expressions
        MyNumber num = () -> 23.4F; // without args

        MyString str1 = a -> a.toUpperCase(); // One argument
        MyString str2 = (a) -> a.trim(); // One argument with braces
        MyString str3 = (String a) -> "Hello " + a; // One argument with braces and type
        MyString str4 =  String::toLowerCase; // Link to Method in class String

        MyDouble db1 = (a,b) -> a+b;// Two arguments can be only with braces
        MyDouble db2 = (double a,double b) -> a+b; // Two args can be typed or not but BOTH;
        MyDouble db3 = Double::sum;//Link to method sum
        // block expressions
        MyDouble db4 = (a,b) ->{
            a = a * b;
            b = b * a;
            return a + b;
        };
        MyDouble db5 = (double a, double b)->{
            a = a * a;
            b = b * b;
            return a + b;
        };

        System.out.println("Num: " + num.getNumb());
        System.out.println("Str 1: " + str1.getStr("hello uppercase string"));
        System.out.println("Str 2: " + str2.getStr("   Trim   "));
        System.out.println("Str 3: " + str3.getStr("Maks"));
        System.out.println("Str 4: " + str4.getStr("HELLO LOWERCASE STRING"));

        System.out.println("Double 1: " + db1.getDouble(2.1,1.2));
        System.out.println("Double 2: " + db2.getDouble(11.4, 33.2));
        System.out.println("Double 3: " + db3.getDouble(234.44, 321.99));
        System.out.println("Double 4: " + db4.getDouble(3232.2,2323.3));
        System.out.println("Double 5: " + db5.getDouble(111.1,233.3));

    }
}
