package AllThemesFromStart.LinksToStaticMethods.V2.LinksToInstanceMethod;

public class User {
    private final String role;
    public User(String role){
        this.role = role;
    }
    public String getRole(){
        return role;
    }
    public  String whoCalled(User arg){
        return "Method Owner: " + this.role + "\nArgument: "+ arg.getRole();
    }

}
