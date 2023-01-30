package AllThemesFromStart.LinksToStaticMethods;

public class Coder {
    public static String code(String str){
        return str.toLowerCase().replaceAll("m","");
    }
    public String reverse(String str){
        StringBuilder ans = new StringBuilder();
        for(int i = str.length()-1;i >=0;i--){
            ans.append(str.charAt(i));
        }
        return ans.toString();
    }
}
