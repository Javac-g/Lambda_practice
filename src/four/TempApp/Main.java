package four.TempApp;

public class Main {
    static <T> int coonter(Tool<T> tool, T[] vals ,T t){

        int count = 0;

        for (int i = 0; i <= vals.length-1; i++){

            if(tool.function(vals[i],t)){

                count++;
            }

        }
        return count;
    }

    public static void main(String...args){

        Temperature[] weekdays = {new Temperature(12),new Temperature(22),new Temperature(33),
                                  new Temperature(42),new Temperature(52),new Temperature(63),
                                  new Temperature(33),new Temperature(64),new Temperature(33)
        };

        System.out.println(coonter(Temperature::isHiger,weekdays,new Temperature(42)));
        System.out.println(coonter(Temperature::isSame,weekdays,new Temperature(33)));


    }
}
