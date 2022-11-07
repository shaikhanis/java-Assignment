package arrayQuestion;

import java.util.Scanner;

public class secondSmallestNum {
    /*
second largest element in array.
 */
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
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
               for (int i= 0; i<a.length; i++) {
                   for (int j = i+1; j < a.length; j++) {
                       if (a[j] > largest) {
                           second_largest = largest;
                           largest = a[j];
                       } else if (a[j] > second_largest && a[j] != largest) {
                           second_largest = a[j];
                      }
                   }
               }
               if(second_largest==Integer.MIN_VALUE){
                  System.out.println("there  is no second largest element in the list");
              }else{
                   System.out.println(" The second largest Element is "+second_largest);
        }
    }
}


