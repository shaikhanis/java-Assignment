package arrayQuestion.bubbleSort;
import java.util.*;
public class bubbleSortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int size = sc.nextInt();
        String temp;
        int i,j;
        String [] a = new String[size];
        System.out.println("Enter the Array Name");
        for (i = 0; i<size; i++){
            a[i] = sc.next();
        }
        for(i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Before Sorting of String");
        for(i =0; i<a.length; i++){
            for(j = 0; j<a.length-1-i; j++){

                if(a[j].compareTo(a[j+1])>0){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("After sorting ");
        for(i =0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
/*

1234567890qwertyuiop[]asdfghjkl;'\
zxcvbnm,.///
*/
