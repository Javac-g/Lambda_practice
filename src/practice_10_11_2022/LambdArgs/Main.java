package practice_10_11_2022.LambdArgs;

public class Main {
    static  String One(A a,String str){
        return a.function(str);
    }
    static Integer Two(B b, int num){
        return b.function(num);
    }

    public static void main(String...args){
    String revers = One( str ->{

        String ans = " ";
        char[] c = str.toCharArray();
        for (int i = c.length-1 ; i >= 0;--i){
            ans = ans + c[i] + "";
        }
        return ans;
    },"Hello");

    String up = One(str ->str.toUpperCase().trim().replaceAll(" ","")," efefD FFDF Dsdsd ");
        System.out.println(revers);
        System.out.println(up);
        System.out.println("Result 1000 + 129 = "+ Two(num -> num + 1000,129));




    }

}
