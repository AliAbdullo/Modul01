public class RegexHome {
    public static void main(String[] args) {
/*        1) Berilgan satrning uzunligi aniqlovchi method yozing
        Input: “Hello Java”:   Output: 10

        3) Berilgan satrni palindromlikka tekshiruvchi method yozing
        Input: “uzum”:   Output: false
        Input: “aka”:      Output: true

        4) Berilgan matnda “text”, berilgan so’z “word” necha marta uchraganini aniqlovchi method yozing
        Input: text=”This is string”, word=”is”   Output: 2

        5) Kiritilgan satrni uz card karta raqami ekanligini tekshiring
        Input: 8600123412341234   Output: true
        Input: 4045123412341234   Output: false


        6) Kiritilgan satrni uz card yoki humo karta raqami ekanligini tekshiring
        Input: 8600123412341234   Output: “uz card”
        Input: 9860123412341234   Output: “humo card”
        Input: 4045123412341234   Output: “other card”
        Input: abcd123412341234   Output: “invalid card number”


        7) Kiritilgan satrni INN (9 talik raqam) raqami ekanligini tekshiring
        Input: 123412341                 Output: true
        Input: 9860123412341234   Output: false


        8) Kiritilgan satrni avtomobil raqami ekanligini tekshiring, agar u mashina raqami bo'lsa qaysi viloyatga tegishli ekanligini aniqlang


        Input: 01A001AA                  Output: Tashkent city
        Input: ab1cde23                   Output: Invalid car number


        9) Kiritilgan satrdagi butun sonlarning yig'indisini aniqlash
        Input: "Today is 28 th of February in 2023", Output: 28+2023 = 2051

        10) Berilgan parolning yaroqli ekanligini tekshiring, bunda parol yaroqli hisoblanadi agar quyidagi shartlarni qanoatlantirsa:
        uzunligi 8 tadan 16 tagacha bo’lishi kerak
        kamida bitta katta harf qatnashishi kerak
        kamida bitta kichik harf qatnashishi kerak
        kamida bitta raqam qatnashishi kerak
        kamida bitta “!.@#$%^&*_” shu belgilardan biri qatnashishi kerak*/
        System.out.println(indexlength("hello java"));
//        indexAdd("hello world");

    }

/*    private static void indexAdd(String word) {
        int counter;
        char[] words ={};
        for (int i = 0; i < word.length(); i++) {
            words = word.charAt(i);
        }
    }*/

    public static int indexlength(String word) {
        int length=word.length();
        return length;
    }
}
