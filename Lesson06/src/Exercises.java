public class Exercises {
    public static void main(String[] args) {
/*        char[] soz = {'a', 'g', 'h', 'e', 't'};
        String s = convertToString(soz);
        System.out.println(s);*/
/*
        String txt = ishora(10);
        System.out.println("txt = " + txt);*/

//        weekend(9);

//        System.out.println(yigindi(444));

//        System.out.println(fToC(50));

//        System.out.println(SLength(80));

//        System.out.println("mTokm(4) = " + mTokm(4)); // Millni km ga o'tkazish

//        System.out.println(kmToMetr(3)); // Kilometrni metrga aylantirish

//        juftToq(3);

//        metrS(7);




    }

    private static void metrS(double kmS) {
        double metrSekund = kmS / 3.6;
        System.out.println(metrSekund);
    }

    private static void juftToq(int a) {
        if(a % 2 == 0){
            System.out.println("Juft");
        }else {
            System.out.println("Toq");
        }
    }

    private static double kmToMetr(double km) {
        double Metr = km * 1000;
        return Metr;
    }

    private static double mTokm(double milya) {
        double km = (milya * 1609.344 )/1000;
        return km;
    }

    private static double SLength(double radius) {
        double AylanaUzunligi= radius * 2 *3.14;
        return AylanaUzunligi;
    }

    private static double fToC(double degree) {
        double sel = (degree - 32)*5/9;
        return sel;
    }

    private static int yigindi(int a) {
        int sum = 0;
        while (a >= 1) {
            sum += a % 10;
            a= a/10;
        }
        return sum;
    }

    private static void weekend(int a) {
        switch (a) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Bunday hafta kuni yo'q");
        }

    }

    private static String ishora(int son) {
        String a;
        if (son >= 0) {
            a = "musbat";
        } else {
            a = "manfiy";
        }
        return a;
    }

    public static String convertToString(char[] arr) {
        String s = "";
        for (char c : arr) {
            s += c;
        }
        return s;
    }
}

