package com.company;
import java.util.Scanner;

public class PracticeSet4 {
    public static void main(String[] args) {
        int a = 10;
        if(a == 11) {
            System.out.println("I am 11");
        }
        else {
            System.out.println("I am not 11");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your marks in Physics: ");
        byte m1 = sc.nextByte();
        System.out.println("Enter Your marks in Chemistry: ");
        byte m2 = sc.nextByte();
        System.out.println("Enter Your marks in Maths: ");
        byte m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your percentage is: " +avg);
        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulation on Passing");
        }
        else {
            System.out.println("Fail");
        }

       int day =2;
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
        

    }
}
