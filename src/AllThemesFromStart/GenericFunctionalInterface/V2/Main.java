package AllThemesFromStart.GenericFunctionalInterface.V2;

public class Main {
    public static void main(String...args){
        MyFunction<String> getMsg = () -> "Hello";
        MyFunction<Integer>getInt = () ->{
            return 42;
        };

        MyFuncSecond<String> getMsgSecond = str -> str.toUpperCase();
        MyFuncSecond<Integer> getIntSecond = (num) -> num + num;
        MyFuncSecond<Double> getDoubleSecond = (Double n) -> n + n;
        MyFuncSecond<String> getMsgThird = String::toLowerCase;

        MyThird<String> getMsgFour = (m1,m2) -> " M1: " + m1 + " M2: " + m2;
        MyThird<Integer> getNum = (Integer m1,Integer m2) -> m1 * m2;

        MyThird<Double> average = (m1,m2) ->{
            double sum = m1 + m2;
            return sum / 2;
        };
        MyThird<Long> sum = (Long m1, Long m2)->{
            long s = m1 + m2;
            return s;
        };

        System.out.println(getMsg.myFirst());
        System.out.println(getInt.myFirst());
        System.out.println(getMsgSecond.mySecond("hello upper case string"));
        System.out.println(getIntSecond.mySecond(421));
        System.out.println(getDoubleSecond.mySecond(9.999));
        System.out.println(getMsgThird.mySecond("HELLO LOWER CASE STRING"));
        System.out.println(getMsgFour.myThird("First","Second"));
        System.out.println(getNum.myThird(44,333));
        System.out.println(average.myThird(21.12,34.43));
        System.out.println(sum.myThird(123L,432L));

    }
}
