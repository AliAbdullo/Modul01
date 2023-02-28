import java.util.*;

public class Lessons {
    public static void main(String[] args) {
//        startsWidth()
//        endWith();
/*        String sozlar[] = {"vatandosh","vazifa","vafodor","sinfdosh","kursdosh"};
        for (String x:sozlar ) {
            if(x.startsWith("va"))
                System.out.println(x+" so'zi 'va' bilan boshlanadi. ");
        }
        System.out.println();
        for (String x:sozlar ) {
            if(x.endsWith("dosh"))
                System.out.println(x+" so'zi 'dosh' bilan tugaydi. ");
        }*/

        /*        String soz ="Ananas";
        System.out.println(soz.indexOf("na"));*/

/*        String sharfi = "Falonchiyev";
        String ismi = " Pistonchi";
        System.out.println(sharfi.concat(ismi));
        System.out.println(sharfi.toUpperCase());
        System.out.println(sharfi.toLowerCase());*/

/*        String gap = "Bu sturdent univesitet studentlari orasida "
                +"\nJavani eng yaxshi biluvchi talaba";
        System.out.println(gap.replace("student","talaba"));
        System.out.println(gap.replace("biluvchi","biladigan"));*/

/*        String soz = "       qidiriladigan so'z     ";
        System.out.println(soz.trim());
        System.out.println(soz);*/

//        System.out.println(faktorial(5));
/*
        String[] massiv1 = {"bir","ikki","uch","to'rt"};
        List<String> toplam1 = new ArrayList<String>();
        for(String x:massiv1)
            toplam1.add(x);*/
/*
        String[] massiv2 = {"uch","to'rt"};
        List<String> toplam2 = new ArrayList<String>();
        for(String x:massiv2)
            toplam2.add(x);*/

/*        for (int i = 0; i < toplam1.size(); i++) {
            System.out.printf("%s, ", toplam1.get(i));
        }*/

/*        System.out.println(toplam1);
        System.out.println(toplam2);
        System.out.println();
        royhatTahrirlash(toplam1,toplam2);
        System.out.print(toplam1);
        System.out.print(toplam2);*/

/*        for (int i = 0; i < toplam1.size(); i++) {
            System.out.printf("%s, ",toplam1.get(i));*/



        String[] massiv1 = {"bir","ikki","uch","to'rt","besh"};
        List<String> royhat1 = new LinkedList<>();
        for(String x:massiv1)
            royhat1.add(x);

        String[] massiv2 = {"olti","yetti","sakkiz","to'qiz"};
        List<String> royhat2 = new LinkedList<>();
        for(String x:massiv2)
            royhat2.add(x);

        royhat1.addAll(royhat2);
        System.out.println(royhat1);


    }

//        System.out.println(toplam1.contains(toplam2.get(0)));

//        Iterator<String> it = toplam1.iterator();
/*        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.hasNext());*/


/*        System.out.printf("Joriyelement - %s, undan keyin yana element %s\n",
                it.next(), (it.hasNext())?"bor":"yo'q");
        System.out.printf("Joriyelement - %s, undan keyin yana element %s\n",
                it.next(), (it.hasNext())?"bor":"yo'q");
        System.out.printf("Joriyelement - %s, undan keyin yana element %s\n",
                it.next(), (it.hasNext())?"bor":"yo'q");
        System.out.printf("Joriyelement - %s, undan keyin yana element %s\n",
                it.next(), (it.hasNext())?"bor":"yo'q");
    }*/

/*    private static void royhatTahrirlash(Collection<String> t1, Collection<String> t2) {
        Iterator<String> it = t1.iterator();
        while (it.hasNext())
            if(t2.contains(it.next()))
                it.remove();
    }
            */


 /*       public static long faktorial(long raqam){
            if(raqam <= 1)
                return 1;
            else
                return raqam * faktorial(raqam-1);
        }
*/
}
