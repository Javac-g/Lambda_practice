package AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Person {
    private  String name;
    public Person(String name){
        this.name = name;
    }
    public  Tool<Product> tool = (Product x)->{
        return x.getProductName().equals("Banana") & x.getDiscount() > 10;
    };

    public String getName(){
        return name;
    }
    public static List<Person> getPersons(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alex"));
        personList.add(new Person("Max"));
        personList.add(new Person("Ivan"));
        personList.add(new Person("Semen"));
        personList.add(new Person("Daria"));
        return personList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
