package AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task3;

public class Person {
    private final String name,surname;

    public Person(String name, String  surname){
        this.name  = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
