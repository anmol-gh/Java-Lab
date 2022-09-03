// 2)	Write a program to add two number using command line arguments.

import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        int a, b, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two digits you want to add");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        result = a + b;
        System.out.println("The sum of " + a + "& " + b + " is " + result);
    }
}
