package arrayQuestion;

import java.util.Arrays;

public class _Reverse_An_String_Or_Number_In_Array {
    public static void main(String[] args) {
        int [] a= {50,40,30,20,100,10,5,4,3,2,1};
//        String [] a = {"a", "b","c","z", "d","f"};
//       String temp;
        int temp;
        int store = a.length-1;
        for (int i =0; i<a.length-i; i++){
            temp = a[i];
            a[i] = a[store-i];
            a[store-i] = temp;
        }
        System.out.println(Arrays.toString(a));
        for (int i =0; i<a.length; i++){
            System.out.print(a[i]+", ");
        }
    }
}
