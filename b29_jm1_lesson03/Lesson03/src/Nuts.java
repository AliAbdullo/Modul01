public class Nuts {
    public static void main(String[] args) {
        System.out.println("cigarParty(60, true) = " + cigarParty(80, false));
    }
        public static boolean cigarParty(int nuts, boolean isWeekend) {

            return nuts >= 40 && (isWeekend || nuts <= 60);
        }

            // return isWeekend ? nuts >= 40 : nuts >= 40 && nuts <= 60;

            // if(isWeekend){
            //   return nuts >= 40;
            // }
            // return nuts >= 40 && nuts <= 60;


            // if(isWeekend){
            //   if(nuts >= 40) return true;
            //   return false;
            // }

            // if(nuts >= 40 && nuts <= 60) return true;

            // return false;


            // if(isWeekend==true){
            //   if(nuts >= 40) return true;
            //   else           return false;
            // }else{
            //   if(nuts >= 40 && nuts <= 60) return true;
            //   else           return false;
            // }

        }


