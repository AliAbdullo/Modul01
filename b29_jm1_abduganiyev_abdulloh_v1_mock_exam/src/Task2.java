import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//2)	Foydalanuvchi tomonidan butun sonlar kiritilaveradi. Bu jarayon klaviaturadan 0 (nol soni) kiritilguncha davom etadi.
//      Bunda kamida bitta noldan farqli son kiritiladi. Nol sonini inobatga olmagan holda kiritilgan sonlarning
//      eng kattasini va u necha marta kiritilganini aniqlovchi dastur tuzing.
//
//  Input: 10, 25, 10, -45, 6, 25, -100, 25, 8, 0m
//  Output: max=25, count=3
//
//  Input: -10, 0
//  Output: max=-10, count=1

        int[] arr = {10, 25, 10, -45, 6, 25, -100, 25, 8, 0};

        max(arr);

//        newArray();


    }

    private static void max(int[] array) {
        int big = 0;
        int counter=0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i]< array[j]){
                    big= array[j];
                }
                if(big==big){
                    counter++;
                }
            }
        }
        System.out.println("max="+big+" count="+counter);
    }

/*
    private static int[] newArray() {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[9];
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + 1 + "-sonni kiriting: ");
            array[i] = scanner.nextInt();

        }
    } ret;*/
}

