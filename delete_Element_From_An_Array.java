package arrayQuestion;
import java.util.*;
public class delete_Element_From_An_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of array ");
        int size = sc.nextInt();
        int [] a =new int[size];
        System.out.println("Please enter the array element ");
        for(int i =0; i<size; i++){
            a[i] = sc.nextInt();
        }
        for(int no : a){
            System.out.print(no+" ");
        }
        System.out.println();
        System.out.println("Enter the element you want to delete");
        int delete = sc.nextInt();
        int temp = 0;
        for(int i=0; i<a.length; i++){
            if(delete==a[i]){
                for(int j =i; j<a.length-1; j++){
                    a[j] = a[j+1];
                }
                temp = temp+1;
                break;
            }
        }
        if(temp==0){
            System.out.println("Element is not fond you want to delete");
        }else {
            System.out.println("element delete successfully");
        for(int no :a){
            System.out.print(no+" ");}
        }
    }
}
