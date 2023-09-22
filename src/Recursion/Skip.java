package Recursion;

public class Skip {
    public static void main(String[] args){
        String p = "";
        String up = "aabacappledaefgah";
        System.out.println(skipApple(p,up));
    }

    public static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
         char ch = up.charAt(0);
        if(ch =='a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }

    public static String skip1(String p,String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch =='a'){
            return skip1(p,up.substring(1));
        }
        else{
            return ch + skip1(p+ch,up.substring(1));
        }
    }

    public static String skipApple(String p,String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipApple(p,up.substring(5));
        }
        else{
            return up.charAt(0) + skipApple(p,up.substring(1));
        }
    }
}
