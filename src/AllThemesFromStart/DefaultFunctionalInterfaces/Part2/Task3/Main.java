package AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    private static BinaryOperator<String> binaryOperator = (String name,String surname)->{
        return String.format("Hello %s %s !!!", name , surname);
    };

    public static List<String> createGreetings(List<Person> persons,BinaryOperator<String> binaryOperator){
        List<String> greetings = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++){
            greetings.add(binaryOperator.apply(persons.get(i).getName(),persons.get(i).getSurname()));
        }
        return greetings;
    }
    public static void main(String...args){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Anna","Stoffel"));
        persons.add(new Person("Maddie","Strong"));
        persons.add(new Person("Tessa","Lynn"));
        persons.add(new Person("Heather","Dean"));

        List<String> greetings = createGreetings(persons,binaryOperator);
        System.out.println(greetings);
    }
}
