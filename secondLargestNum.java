package arrayQuestion;

import java.util.Scanner;

public class secondLargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please Enter the size of the Array");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Please enter the array element");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int j : a) {
            System.out.print(j + " ,");
        }
        System.out.println();
        int largest = a[0];
        int sec_largest = 0;
        int smallest = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                sec_largest = largest;
                largest = a[i];
            }
            if (a[i] < largest) {
                sec_largest = largest;
                largest = a[i];
            }
            System.out.println("Largest : " + smallest);
            System.out.println("Largest  : " + sec_largest);
        }
    }
}

