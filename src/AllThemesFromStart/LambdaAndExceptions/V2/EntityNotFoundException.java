package AllThemesFromStart.LambdaAndExceptions.V2;

public class EntityNotFoundException extends Throwable{
    private final String msg;
    public EntityNotFoundException(String msg){
        this.msg = msg;
    }
    @Override
    public String toString(){
        return msg;
    }
}
