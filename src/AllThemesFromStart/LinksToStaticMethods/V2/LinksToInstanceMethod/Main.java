package AllThemesFromStart.LinksToStaticMethods.V2.LinksToInstanceMethod;

public class Main {
    public static<T> String runner(Tool<T> tool,T caller,T argument){
        return tool.useService(caller,argument);
    }
    public static<T> String runnerAlt(MyAltTool<T> tool,T argument){
        return tool.useService(argument);
    }

    public static void main(String... args) {
        User first = new User("Admin");
        User second = new User("User");
        User third = new User("Moder");

        System.out.println(runner(User::whoCalled,first,second));// automatic first - calls method, second - passed as argument
        System.out.println(runnerAlt(first::whoCalled,second)); // more clear example of same

    }
}
