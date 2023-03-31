package AllThemesFromStart.LinksToStaticMethods.V2;

public class Code {

    public static String reverseOne(String s){
        String res = "";
        for ( int i = s.length()-1; i >= 0 ; i-- )
        {
            res += s.charAt(i);
        }
        return res;
    }
    public  String reverseTwo(String s){
        String res = "";
        for ( int i = s.length()-1; i >= 0 ; i-- )
        {
            res += s.charAt(i);
        }
        return res;
    }



}