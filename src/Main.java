public class Main {

    static  String Srunner(ToolS tool, String msg){

        return "Value: " + tool.function(msg);

    }
    static  Integer Irunner(ToolI tool,Integer num){

        return tool.function(num);

    }

    static <T> Integer Irun(IT<T> tool,T t){

        return tool.function(t);

    }
    static <T> String Srun(ST<T> tool , T t){

        return tool.function(t);

    }
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

        System.out.println(toolI.function(321));
        System.out.println(toolS.function("hello my name is maks markes"));
        System.out.println(IntBlock.function(23));
        System.out.println(StrBlock.function("qwerty"));






    }
}
