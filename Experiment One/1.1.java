// 1) Write a program to find the largest of 3 numbers.

import java.util.Scanner;

class LargestNumber {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three digits one by one");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int greater;
        if (a > b) {
            greater = a;
        } else {
            greater = b;
        }
        if (greater > c) {
            System.out.println(greater + " is the biggest number");
        } else {
            System.out.println(c + " is the biggest number");
        }

    }

}