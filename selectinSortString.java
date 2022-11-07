package arrayQuestion.bubbleSort;
import java.util.Scanner;
public class selectinSortString {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of Array");
            int size = sc.nextInt();
            int i,j;
            String temp;
            System.out.println("Enter the Array Element");
            String [] a = new String[size];
            for(i = 0; i<size; i++){
                a[i] = sc.next();
            }
            for(i = 0; i<a.length; i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
            System.out.println("Before Sorting");
            System.out.println();
            int main;
            for(i = 0; i<a.length; i++){
                main = i;
                for (j = i+1; j<a.length; j++){

                    if(a[j].compareTo(a[main])<0){
                        main = j;
                    }
                }
                temp = a[i];
                a[i]= a[main];
                a[main] = temp;
            }
            System.out.println("After Sorting ");
            for(i = 0; i<a.length; i++){
                System.out.print(a[i]+" ");
            }
        }
}
