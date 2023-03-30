package AllThemesFromStart.LambdaAndExceptions.V2;

public class Main {
    public static void runner(Myinterface func,Object ob) throws EntityNotFoundException {
        func.one(ob);
    }
    public static void main(String...args) throws EntityNotFoundException {
        Myinterface one = (Object ob) ->{
            if (ob instanceof Number){
                System.out.println("Number");
                throw new ArithmeticException();

            }else{
                throw new EntityNotFoundException("Not number");
            }
        };
        try{
            runner(one,900);
            runner(one,new String("Hello"));
        }catch(Exception e){
            System.out.println("Exception here: " + e);
        }
    }
}
