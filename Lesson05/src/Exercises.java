import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*        System.out.print("Enter a four-digit number: ");
        int number = scanner.nextInt();

        int num1 = number % 10;
        int num10 = number / 10 % 10;
        int num100 = number / 100 % 10;
        int num1000 = number / 1000;

        System.out.println(num1000 + "," + num100 + "," + num10 + "," + num1);
    */


/*        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        int num1 = number % 10;
        int num10 = number / 10 % 10;
        int num100 = number / 100 % 10;

        System.out.println(num100 + " hundred,");
        System.out.println(num10 + " tens,");
        System.out.println(num1 + " unity,");*/




 /*       int number = scanner.nextInt();
        int num =0;
        if (number >= 1) {
            number++;
            System.out.println(number);

        }else {
            System.out.println(number);
        }
*/

/*        int number = scanner.nextInt();
        int num =0;
        if (number >= 1) {
            number++;
            System.out.println(number);

        }else {
            System.out.println(number-2);
        }*/


/*      int number = scanner.nextInt();
        int b = 0;
        if (number > 0) {
            System.out.println(number++);
        } else if (number == 0) {
            System.out.println(number + 10);
        }else {
            System.out.println(number-2);
        }*/


/*        int[] numbers = {-4,-9,2};
        int nums = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0 ){
                 nums++;
            }
        }System.out.println(nums);*/


/*        int num1 = 7;
        int num2 = 6;
        if (num1 > num2) {
            System.out.println(num1 + " katta " + num2 + " dan");
        } else if (num1 == num2) {
            System.out.println("Sonlar teng");
        } else {
            System.out.println(num1 + " kichik " + num2+ " dan");
        }*/


/*
        int num1 = 8;
        int num2 = 3;
        int num3 = 6;
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " big");
        } else if (num2 > num3 && num2 > num1) {
            System.out.println(num2+ " big");
        }else {
            System.out.println(num3+" big");
        }
*/

//7
/*      int num1 = 14;
        int num2 = 9;
        int num3 = 6;
        if (num1 > num2 && num1 > num3) {
            System.out.println(num2+ ","+num3);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num1+","+num3);
        }else {
            System.out.println(num1+","+num2);
        }*/


/*        System.out.println("What day of the week is today? ");
        System.out.println("Enter a number from one to eight: ");
        int Weekday = scanner.nextInt();

        if (Weekday < 8) {


            switch (Weekday) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Sunday");
                case 7 -> System.out.println("Saturday");
            }
        }else {
            System.out.println("You entered the wrong number!!!");
        }*/


/*        System.out.print("Price result: ");
        int k = scanner.nextInt();

        if (k >= 1 && k <= 5) {

            switch (k) {
                case 1 -> System.out.println("Bad");
                case 2 -> System.out.println("Unsatisfactory");
                case 3 -> System.out.println("Satisfaxtory");
                case 4 -> System.out.println("Good");
                case 5 -> System.out.println("Excellent");

            }
        } else {
            System.out.println("Error");
        }*/

/*
        System.out.print("What month is it now: ");
        int month = scanner.nextInt();

        if (month >= 1 && month <= 12) {

            switch (month) {
                case 12, 1, 2 -> System.out.println("Winter");
                case 3, 4, 5 -> System.out.println("Spring");
                case 6, 7, 8 -> System.out.println("Summer");
                case 9, 10, 11 -> System.out.println("Autumn");
            }
        } else {
            System.out.println("No such month exists!!!");
        }
*/


/*        System.out.print("Enter the month number: ");
        int k = scanner.nextInt();

            switch (k) {
                case 1 -> System.out.println("January 31 days");
                case 2 -> System.out.println("February 28 days");
                case 3 -> System.out.println("March 31 days");
                case 4 -> System.out.println("April 30 days");
                case 5 -> System.out.println("May 31 days");
                case 6 -> System.out.println("June 30 days");
                case 7 -> System.out.println("July 31 days");
                case 8 -> System.out.println("August 31 days");
                case 9 -> System.out.println("September 30 days");
                case 10 -> System.out.println("October 31 days");
                case 11 -> System.out.println("November 30 days");
                case 12 -> System.out.println("December 31 days");
                default -> System.out.println("No such month exists!!!");
            }*/
// 11
 /*
    System.out.print("Enter the month number: ");
        int k = scanner.nextInt();

        switch (k) {
            case 2 -> System.out.println(28);
            case 4, 6, 9, 11 -> System.out.println(30);
            case 3, 5, 7, 8, 10, 12 -> System.out.println(31);
            default -> System.out.println("No such month exists!!!");
        }*/
//        12 Homework
/*

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer number: ");
        int number = scanner.nextInt();

        String sign = "";
        if (number < 0) {
            sign = "minus ";
            number = -number;
        }

        if (number < 100 || number > 999) {
            System.out.println("Wrong number");
            return;
        }

       int r1 = number % 10;
        int r10 = number / 10 % 10;
        int r100 = number / 100;
        // 429 => to'rt yuz yigirma to'qqiz

        String[] oneRooms = {"", "bir", "ikki", "uch", "to'rt",
                "besh", "olti", "yetti", "sakkiz", "to'qqiz"};
        String[] tenRooms = {"", "o'n", "yigirma", "o'ttiz", "qirq",
                "ellik", "oltmish", "yetmish", "sakson", "to'qson"};

        String str = oneRooms[r100] + " yuz " + tenRooms[r10] + " " + oneRooms[r1];

        System.out.println(sign + str);*/
//        13 Task



    }

}


