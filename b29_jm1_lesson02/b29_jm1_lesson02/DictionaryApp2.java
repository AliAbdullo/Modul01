import java.util.Random;
import java.util.Scanner;

public class DictionaryApp2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] words = {"pen","cup","pencil","window","table","chair"};
        String[] translates = {"ruchka","piyola","qalam","oyna","stol","stul"};

        /*for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] +"  -   "+ translates[i]);
        }*/

        int correct = 0;
        int incorrect = 0;
        int [] massiv = {0,1,2,3,4,5};

        System.out.println();
          for(int i = 0; i < words.length; i++){
              int index = random.nextInt(words.length);

              if(index == massiv[index]){
                  massiv[index] = 100;
                  System.out.print(words[index]+" = ");
                  String answer = scanner.nextLine();


                  if (answer.equalsIgnoreCase(translates[index])){
                      correct++;
                      System.out.println("Correct ✔");
                  }
                  else {
                      incorrect++;
                      System.out.println("Incorrect❌");
                      System.out.println("Correct answer \""+translates[index]+"\"");
                  }
                  System.out.println("✅ "+correct+ "    :   "+incorrect+"❎");
                  System.out.println(
                  );
              }
              else {
                  i--;
              }
          }


        System.out.println();
        System.out.println("✅"+correct+"    :   "+incorrect+"❎");
        System.out.println("The end");

    }
}
