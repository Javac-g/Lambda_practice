package four.practice;

public class Temp {

    private static int Max;

    Temp(int Max){
        this.Max = Max;

    }
    Temp(){

        Max = 0;


    }


     static <T extends Comparable<T>> T run(Tool<T> tool,T[] vals,T t){

        return tool.Max(vals,t);

     }

    public static void main(String...args){
        Integer[] vals = {1,2,3,4,5,6,0,5,32,1};
        Metod<Integer> metod = new Metod<>();
        System.out.println(run(metod,vals,5));
    }


}
