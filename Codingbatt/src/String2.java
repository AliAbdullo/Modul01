public class String2 {
    public static void main(String[] args) {

    }
    public static String withoutX(String str){
        if( str.length()==0){
            return str;
        }
        if (str.length() == 1){
            if (str.charAt(0) == 0)
                return "";
            else return str;
        }
        if (str.charAt(0) == 'x')
            str= str.substring(0,str.length()-1);
        return str;
    }
}
