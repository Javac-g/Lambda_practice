package AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task4;

public class Person {
    private final String name;
    private MakeDecision goShopping = (String productName, int discount)-> {
        return productName.equals("banana") & discount > 10;
    };
    public Person(String name){
        this.name = name;
    }


}
