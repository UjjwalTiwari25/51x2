//package com.tcs.NumberSystem;
//
//public class isEvenOrOdd {
//    public static void main(String[] args) {
//        int num=68;
//        System.out.println(isOdd(num));
//    }
//    private static boolean isOdd(int num){
//        return (num & 1)==1;
//
//    }
//}
package com.tcs.NumberSystem;

import java.util.Scanner;

public class isEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("The number is " + (isOdd(num) ? "Odd" : "Even"));
    }

    private static boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}

