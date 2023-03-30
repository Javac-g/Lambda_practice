package AllThemesFromStart.LambdaAndExceptions.V2;

public class Main {
    public static void runner(Myinterface func,Object ob) throws EntityNotFoundException {
        func.one(ob);
    }
    public static <T>String runnerString(MySecond<T> func,T[] array) throws EmptyArrayException {
        return func.getArr(array);
    }
    public static void main(String...args) throws EntityNotFoundException, EmptyArrayException {
        Myinterface one = (Object ob) ->{
            if (ob instanceof Number){
                System.out.println("Number");
                throw new ArithmeticException();

            }else{
                throw new EntityNotFoundException("Not number");
            }
        };
//        try{
//            runner(one,900);
//            runner(one,new String("Hello"));
//        }catch(Exception e){
//            System.out.println("Exception here: " + e);
//        }
        Integer[] n1 = {1,2,3,4,5};
        Integer[] n2 = {};

        MySecond<Integer> arg = (x) ->{
            if (x.length > 0){
            return "Length: " + x.length;
            }else {
                throw new EmptyArrayException("Empty array");
            }
        } ;
        System.out.println("Array " + runnerString(arg,n1));
        System.out.println("Array " + runnerString(arg,n2));
    }
}
