

public class Main {
    public static void main(String[] args) {
//        System.out.println(" = " + seeColor("blueTimes"));
//        System.out.println("args = " + minCat("ddf", "dfsf"));
//        addd("a","b");
//        System.out.println("twoCharsSubster(\"hello\") = " + twoCharsSubster("hello"));
//        System.out.println("repit(\"hi\") = " + repit("h"));

//        System.out.println(chack("fly"));
        System.out.println(" = " + chackBob("acbi"));

    }

    public static boolean chackBob(String str) {
        for (int i = 0; i < str.length()-2; i++) {  /// bbi   a
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
                return true;
        }
        return false;
    }

/*    private static boolean chack(String str) {
        return str.endsWith("ly");*/

/*    public static String repit(String str) {
        if(str.length() > 2){
            return str.substring(0,2).repeat(3);
        }return str.repeat(3);
    }*/


/*    private static String twoCharsSubster(String str) {
        return str.length() > 2 ? str.substring(0,2) : str;
    }*/

/*    public static void addd(String a,String b) {
        System.out.println(a+b+b+a);
    }*/

/*    private static String minCat(String a, String b) {
        if (a.length() < b.length()) {
            b.substring(a.length() - b.length());
            if (a.length() > b.length()) {
                a.substring(b.length() - a.length());
            }
            return a + b;
        }}*/
/*
    public static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        }
        else if(str.startsWith("blue")) {
            return "blue";
        }
        return "";
    }*/

}

