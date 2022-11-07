package arrayQuestion;

public class findSingleElementINArray {
    public static void main(String[] args) {
        int [] a ={5,3,4,5,2,3,4};
        int result = a[0];
        for(int i = 1; i<a.length; i++){
            result = result^a[i];
        }
        System.out.println(" single element in array in present ones : "+result);
    }
}