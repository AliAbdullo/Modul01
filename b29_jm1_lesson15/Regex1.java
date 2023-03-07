public class Regex1 {
    public static void main(String[] args) {
        "".matches("abc");
        "".replaceAll("abc", "ABC");
        "".split("abc");

        // . (dot) - any character
//        System.out.println("1a".matches(".+"));
//        System.out.println("1A".matches("."));
//        System.out.println("1?".matches("."));
//        System.out.println("15".matches("."));
//        System.out.println("1_".matches("."));
//        System.out.println("1 ".matches("."));

        // [man] "man" - any character

       /* // "man" - "man"
        System.out.println("man".matches("man"));
        System.out.println("Man".matches("man"));
        System.out.println("a".matches("man"));
        System.out.println("m".matches("man"));
        System.out.println("m".matches("man"));
        System.out.println("nam".matches("man"));
        System.out.println("mana".matches("man"));*/

        /*// "[man]" - "m", "a", "n"
        System.out.println("man".matches("[man]"));
        System.out.println("Man".matches("[man]"));
        System.out.println("a".matches("[man]"));
        System.out.println("m".matches("[man]"));
        System.out.println("m".matches("[man]"));
        System.out.println("t".matches("[man]"));
        System.out.println("nam".matches("[man]"));
        System.out.println("mana".matches("[man]"));*/

        // "[m-z]" - from "m" to "z"
        /*System.out.println("man".matches("[m-z]"));
        System.out.println("Man".matches("[m-z]"));
        System.out.println("a".matches("[m-z]"));
        System.out.println("m".matches("[m-z]"));
        System.out.println("n".matches("[m-z]"));
        System.out.println("t".matches("[m-z]"));
        System.out.println("nam".matches("[m-z]"));
        System.out.println("mana".matches("[m-z]"));
        */

        // "[^m-z]" - one any character, except from "m" to "z"
//        System.out.println("man".matches("[^m-z]"));
//        System.out.println("Man".matches("[^m-z]"));
//        System.out.println("a".matches("[^m-z]"));
//        System.out.println("m".matches("[^m-z]"));
//        System.out.println("n".matches("[^m-z]"));
//        System.out.println("t".matches("[^m-z]"));
//        System.out.println("nam".matches("[^m-z]"));
//        System.out.println("mana".matches("[^m-z]"));

        // "[m-z[a-d]]" -  from "m" to "z" OR from "a" to "d"
//        System.out.println("man".matches("[m-za-d]"));
//        System.out.println("Man".matches("[m-za-d]"));
//        System.out.println("a".matches("[m-za-d]"));
//        System.out.println("m".matches("[m-za-d]"));
//        System.out.println("n".matches("[m-za-d]"));
//        System.out.println("t".matches("[m-za-d]"));
//        System.out.println("f".matches("[m-za-d]"));
//        System.out.println("nam".matches("[m-za-d]"));
//        System.out.println("mana".matches("[m-za-d]"));

        // "[\\w&&\\D]" -  [a-zA-Z0-9_] && [^0-9] => [a-zA-Z_]
//        System.out.println("man".matches("[\\w&&\\D]"));
//        System.out.println("Man".matches("[\\w&&\\D]"));
//        System.out.println("a".matches("[\\w&&\\D]"));
//        System.out.println("m".matches("[\\w&&\\D]"));
//        System.out.println("n".matches("[\\w&&\\D]"));
//        System.out.println("A".matches("[\\w&&\\D]"));
//        System.out.println("_".matches("[\\w&&\\D]"));
//        System.out.println("5".matches("[\\w&&\\D]"));
//        System.out.println("nam".matches("[\\w&&\\D]"));
//        System.out.println("mana".matches("[\\w&&\\D]"));

//          \w  - [a-zA-Z0-9_]
//          \W  - ^\w

//          \d  - [0-9]
//          \D  - ^\d

//          \s  - [\n\t ]
//          \S  - ^\s

//          \b  - boundary
//          \B  - ^\b

    /*    // "[man]?" - "m", "a", "n", ""
        System.out.println("man".matches("[man]?"));
        System.out.println("Man".matches("[man]?"));
        System.out.println("a".matches("[man]?"));
        System.out.println("m".matches("[man]?"));
        System.out.println("n".matches("[man]?"));
        System.out.println("".matches("[man]?"));
        System.out.println("t".matches("[man]?"));
        System.out.println("nam".matches("[man]?"));
        System.out.println("mana".matches("[man]?"));*/

        /*// "[man]+" - "m", "a", "n" (length >= 1)
        System.out.println("aaa".matches("[man]+"));
        System.out.println("man".matches("[man]+"));
        System.out.println("Man".matches("[man]+"));
        System.out.println("Man".matches("(?i)[man]+"));
        System.out.println("a".matches("[man]+"));
        System.out.println("m".matches("[man]+"));
        System.out.println("n".matches("[man]+"));
        System.out.println("".matches("[man]+"));
        System.out.println("t".matches("[man]+"));
        System.out.println("nam".matches("[man]+"));
        System.out.println("mana".matches("[man]+"));*/


/*        // "[man]*" - "m", "a", "n" (length >= 0)
        System.out.println("aaa".matches("[man]*"));
        System.out.println("man".matches("[man]*"));
        System.out.println("Man".matches("[man]*"));
        System.out.println("Man".matches("(?i)[man]*"));
        System.out.println("a".matches("[man]*"));
        System.out.println("m".matches("[man]*"));
        System.out.println("n".matches("[man]*"));
        System.out.println("".matches("[man]*"));
        System.out.println("t".matches("[man]*"));
        System.out.println("nam".matches("[man]*"));
        System.out.println("mana".matches("[man]*"));*/

        /*// "[man]{3}" - "m", "a", "n" (length == 3)
        System.out.println("aaa".matches("[man]{3}"));
        System.out.println("man".matches("[man]{3}"));
        System.out.println("Man".matches("[man]{3}"));
        System.out.println("Man".matches("(?i)[man]{3}"));
        System.out.println("a".matches("[man]{3}"));
        System.out.println("m".matches("[man]{3}"));
        System.out.println("n".matches("[man]{3}"));
        System.out.println("".matches("[man]{3}"));
        System.out.println("t".matches("[man]{3}"));
        System.out.println("nam".matches("[man]{3}"));
        System.out.println("mana".matches("[man]{3}"));*/

        /*// "[man]{3,}" - "m", "a", "n" (length >= 3)
        System.out.println("aaa".matches("[man]{3,}"));
        System.out.println("man".matches("[man]{3,}"));
        System.out.println("Man".matches("[man]{3,}"));
        System.out.println("Man".matches("(?i)[man]{3,}"));
        System.out.println("a".matches("[man]{3,}"));
        System.out.println("m".matches("[man]{3,}"));
        System.out.println("n".matches("[man]{3,}"));
        System.out.println("".matches("[man]{3,}"));
        System.out.println("t".matches("[man]{3,}"));
        System.out.println("nam".matches("[man]{3,}"));
        System.out.println("mana".matches("[man]{3,}"));*/

        // "[man]{3,5}" - "m", "a", "n" (length >= 3 && length <= 5)
/*        System.out.println("aaa".matches("[man]{3,5}"));
        System.out.println("man".matches("[man]{3,5}"));
        System.out.println("Man".matches("[man]{3,5}"));
        System.out.println("Man".matches("(?i)[man]{3,5}"));
        System.out.println("a".matches("[man]{3,5}"));
        System.out.println("m".matches("[man]{3,5}"));
        System.out.println("n".matches("[man]{3,5}"));
        System.out.println("".matches("[man]{3,5}"));
        System.out.println("t".matches("[man]{3,5}"));
        System.out.println("nam".matches("[man]{3,5}"));
        System.out.println("mana".matches("[man]{3,5}"));
        System.out.println("manamana".matches("[man]{3,5}"));*/

    }
}
