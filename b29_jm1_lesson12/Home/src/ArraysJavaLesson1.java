public class ArraysJavaLesson1 {
    public static void main(String[] args) {


// Ko'p o'lchovli massivlar:
        int massiv[][] = {{1, 2, 3, 4, 5},
                        {5, 6, 7, 8},
                        {9, 10, 1, 11,}};
        int massiv2[][] = {{545, 65, 12, 45, 3},
                            {54, 24, 78, 998, 45, 4}};

        System.out.println("Bu massiv ");
        kursatish(massiv);

        System.out.println("%n Bu massiv2");
        kursatish(massiv2);
    }
    public static void kursatish(int x[][]) {
        for (int qator = 0; qator < x.length; qator++){
            for (int ustun = 0; ustun < x[qator].length; ustun++)
                System.out.print(x[qator][ustun] + "\t ");
        System.out.println();
        }
    }


/*        // Ko'p o'lchovli massivlar:
        int firsArray[][] = {{10,11,12,13,14,15},
                                {16,17,18,19},
                                 {20,21,22,23,24}};
        System.out.printf("%d", firsArray[1][0]);*/



/*
//  Massiv ichidagi elementlarni 5 ga oshirib chiqish.
        int massiv[] = {0, 1, 2, 3, 4, 5, 6, 47, 8, 9, 10};
        uzgartirish(massiv);
        for (int y : massiv) {
            System.out.printf("%d, ",y);
        }
    }
    public static void uzgartirish(int x[]){
        for (int sanoq = 0; sanoq<x.length; sanoq++)
            x[sanoq] += 5;

*/


/*// Massivni yig'indisini xisoblash;
        int massiv[] = {10,10,10,10,10};
        int sum = 0;
        for(int x:massiv){
            sum += x;
        }
        System.out.printf("%d",sum);*/



/*
 // Massivlarni saralash :(To'g'ri tartibda joylashtirish.)
        int massiv[] = {2,0, 1,2, 3, 5, 200, 6, 7, 1, 10, 88, 0};
        for (int i = 0; i < massiv.length; i++) {
            System.out.printf("%d,", massiv[i]);
        }System.out.println();
        int temp;
        for (int i = 0; i < massiv.length; i++)
            for (int j = 0; j < i; j++)
                if(massiv[i] < massiv[j]){
                    temp = massiv[i];
                    massiv[i]= massiv[j];
                    massiv[j] = temp;
                }
        for (int i = 0; i < massiv.length; i++) {
            System.out.printf("%d, ",massiv[i]);
        }
*/



//O'rin almashtirish:

/*        int a = 4, b = 5;
        System.out.printf("a = %d, b = %d%n", a,b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.printf("a = %d, b = %d", a, b);*/


// Massivdan eng katta elementni va u joylashgan indexni topish.
/*
        int massiv[] = {2, 3, 5, 200, 6, 7, 1, 10, 88, 0};

        int engKattaQiymat = massiv[0];
        int kattaQiymatIndexi = 0;

        for (int i = 0; i < massiv.length; i++) {
            if (engKattaQiymat < massiv[i]) {
                engKattaQiymat = massiv[i];
                kattaQiymatIndexi = i;
            }
        }
        System.out.printf("Eng katta qiymat: %d u %d-indexda joylashgan",
                engKattaQiymat, kattaQiymatIndexi);
*/


// Elementni qaysi indexda ekanini topish
/*        int massiv[] = {3,2,1,0,5,6,8,9,0};
        int index =-1, qidiruvRaqami = 3;
        for (int i = 0; i < massiv.length; i++) {
            if(massiv[i]==qidiruvRaqami) index=i;
        }
        System.out.printf("%d massivning %d-elementida joylashgan.",
                                qidiruvRaqami,index);*/

/*        int massiv[] = {1,2,4,7,5,55};
        int jami=0;
        for (int i = 0; i < massiv.length; i++) {
            jami += massiv[i];

        }
        System.out.printf("%d, ", massiv[i]);*/


/*//        int[] massiv = new int[5];
        int massiv[] = new int[5];
        massiv[0] = 1;
        massiv[1] = 9;
        massiv[2] = 2;
        massiv[3] = 3;
        massiv[4] = 4;

        for(int i=0; i<5; i++)
            System.out.println(massiv[i]);*/


    }

