package six.constr;

public class App {
    public static void main(String...args){

        Tool tool = box::new;
        box a = tool.function(1,2,3);


        System.out.println("w: " + a.getW());
        System.out.println("H: " + a.getH());
        System.out.println("L: " + a.getL());
        //but this is no useful,try next one>>



    }
}
