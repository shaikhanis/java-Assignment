package arrayQuestion.bubbleSort;
import java.util.*;
public class string_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter size of array");
        int size = sc.nextInt();
        int temp = 0;
        String[] a = new String[size];
        for (int i = 0; i<a.length; i++){
            a[i] = sc.next();
        }
        for(String j : a){
            System.out.print(j+" , ");
        }
        System.out.println(" ");
        System.out.println(" Enter the Element You want to find");
        String element = sc.next();
        for(int i = 0; i<a.length; i++){
            if(a[i].equals(element)){
                System.out.println("Element Present At "+i+" Index Position");
                temp += 1;
            }
        }
        if(temp==0){
            System.out.println(" Element is NOT Present In This Array");
        }
    }
}
