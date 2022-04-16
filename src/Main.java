public class Main {





    public static void main(String...args){

        ToolI toolI = num -> num * 9;
        ToolI IntBlock = num-> {
            int res = 0;

            for (int i = 0; i <= num;i++){
                res+=i;
            }
            return res;
        };

        ToolS toolS = msg -> msg.replace('a',' ');
        ToolS StrBlock = msg ->{
            String res = "";
            for (int i = msg.length()-1; i >= 0 ; i--){

                res+= msg.charAt(i);

            }
            return res;
        };

        IT<Integer> itgen= num->num+99;
        ST<String> strgen = msg-> msg.replace('e','Q');

        //One-liners
        System.out.println(toolI.function(321));
        System.out.println(toolS.function("hello my name is maks markes"));

        //Blocks
        System.out.println(IntBlock.function(23));
        System.out.println(StrBlock.function("qwerty"));









    }
}
