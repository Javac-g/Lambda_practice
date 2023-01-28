package AllThemesFromStart.LambdaBody;

public class One {


    public static void main(String...args){

        MyNumber myNumber = ()-> 123;
        MyStr A =  ss -> ss.toUpperCase();
        MyStr B = (String ss)-> ss.toLowerCase();
        MyStr C = String::toUpperCase;

        MyNumTwo numA = (a,b) -> a + b;
        MyNumTwo numB = (int a,int b) -> a + b;
        MyNumTwo numC =  (a, b) -> {
            return  a * b;
        };
        MyNumTwo numD =  (int a,int b) -> {
            return  a / b;
        };
        MyNumTwo numE = Integer::compare;


        System.out.println(myNumber.getValue());
        System.out.println(C.getStr("hello"));
        System.out.println(numE.add(23,51));
    }
}
