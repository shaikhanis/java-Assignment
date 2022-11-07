package arrayQuestion.bubbleSort;
import java.util.*;
public class salectinSort {
    public static void main(String[] args) {
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
        int main;
        for(i=0; i<a.length; i++){
            main = i;
            for(j=i+1; j<a.length; j++){
                if(a[j] < a[main]){
                    main = j;
                }
            }
            temp = a[i];
            a[i] = a[main];
            a[main] = temp;
        }

        System.out.println("After Sorting ");
        for(i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
