package arrayQuestion;

public class merge_Two_Array_InONe {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6};
        int [] b = {7,8,9,10,11,12,13,14};
        int a1 = a.length;
        int b1 = b.length;
        int c = a1+b1;
        int [] c1 = new int[c];
//        System.arraycopy(a,0,c1,0,a1);
//        System.arraycopy(b,0,c1,a1,b1);
//        System.out.println(" print the element present in array one and two");
//        for(int no : c1){
//            System.out.print(no+" ");
//        }
        for(int j =0; j<a1; j++){
            c1[j] = a[j];
        }
        for(int j=0; j<b1; j++){
            c1[a1+j] = b[j];
        }
        System.out.println(" print the element present in array one and two");
        for(int no : c1){
            System.out.print(no+" ");
        }
    }
}