import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Namuna {
    public static void main(String[] args) {

/*        String matn = "Bir bor ekan, bir yo'q ekan, qadim o'tgan zamonda";
        String ajratuvchilar = "\\s+|,\\s*|\\.\\s*";
        String[] bolaklar = matn.split(ajratuvchilar);
        System.out.println("Bo'laklar soni "+bolaklar.length+" ta");
        for (int i = 0; i < bolaklar.length; i++) {
            System.out.println((i+1)+") "+bolaklar[i]);
        }*/


/*        String matn = "Bir bor edi, bir yo'q edi, qadim o'tgan zamonda";
        String muntazamIfoda = "edi";
        StringBuffer yangiMatn = new StringBuffer();

        Pattern tartib = Pattern.compile(muntazamIfoda);
        Matcher moslik = tartib.matcher(matn);
        while (moslik.find()){
            moslik.appendReplacement(yangiMatn, "ekan");
        }
        System.out.println(yangiMatn);*/

//        System.out.println(Math.pow(2.0,5.0));
//        "(Math.pow)"
//        "([a-zA-Z])"

        String matn = "w2w2";
        System.out.println(matn.matches("(\\w\\d)\\1"));

    }
}
