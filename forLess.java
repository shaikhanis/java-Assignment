package arrayQuestion.bubbleSort;
import java.util.*;
public class forLess {
    public static void main(String[] args) {
        /* The code bellow is the best method of sorting but 1000s of element
            This code takes more time, so you want to some change in this code
            Fide this...
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();
        int i,temp,j;
        System.out.println("Enter the Array Element");
        int [] a = new int[size];
        for(i = 0; i<size; i++){
            a[i] = sc.nextInt();
        }
        for(i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Before Sorting");
        System.out.println();
        for(i = 0; i<a.length; i++){
            for (j = 0; j<a.length-1; j++){

                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j]= a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("After Sorting ");
        for(i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
