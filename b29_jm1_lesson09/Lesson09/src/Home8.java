public class Home8 {
    public static void main(String[] args) {

/*        8) Kiritilgan satrni avtomobil raqami ekanligini tekshiring, agar u mashina raqami bo'lsa qaysi viloyatga tegishli ekanligini aniqlang


        Input: 01A001AA                  Output: Tashkent city
        Input: ab1cde23                   Output: Invalid car number*/


    }
    public static String CarNumber(String s) {
        boolean car=s.matches("([0-9]{2}[A-Z][0-9]{3}[A-Z]{2})||[0-9]{2}[0-9]{3}[A-Z]{3}");
        String startTwoNumber=s.substring(0, 2);
        int number =Integer.parseInt( startTwoNumber);
        if (car){
            if(number<10) return "Tashkent city";
            if(number<20) return "Tashkent region";
            if(number<25) return "Sirdaryo region";
            if(number<30) return "Jizzakh region";
            if(number<40) return "Samarkand region";
            if(number<50) return "Fergana region";
            if(number<60) return "Namangan region";
            if(number<70) return "Andijon region";
            if(number<75) return "Qashqadaryo region";
            if(number<80) return "Surxondaryo region";
            if(number<85) return "Buxoro region";
            if(number<90) return "Navoiy region";
            if(number<95) return "Xorazm region";
            if(number<100) return "Karakalpakiston Respulic";
        }

        return "Kiritilgan Mashina no'meri mavjut emas!";
    }
}
