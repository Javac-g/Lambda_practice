package AllThemesFromStart.LambdaAndExceptions;

public class Main {
    public static void main(String...args) throws EmptyArrayException{
        double[] arr = {1.0,2.0,3.0,4.0,5.0};
        MyInterface myInterface = (n)->{
            double sum = 0;
            if(n.length == 0){
                throw new EmptyArrayException();
            }
            for(int i = 0;i < n.length;i++){
                sum += n[i];
            }
            return sum/n.length;
        };
        System.out.println(myInterface.function(arr));
        System.out.println(myInterface.function(new double[0]));
    }
}
