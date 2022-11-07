package arrayQuestion;

public class find_The_MissingNumber {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,9,10,};
        // int this array the 8 are missing so find it
        //this method calls by sum method
//        int expectedElement = a.length+1;
//        int total_sum = expectedElement*(expectedElement+1)/2;
//        System.out.println(total_sum);
//        //calculate sum of all the element and substrate the total_aum.
//        int sum = 0;
//        for(int i = 0; i<a.length; i++){
//            sum = sum+a[i];
//        }
//        System.out.println("missing number is "+(total_sum-sum));

        //this is second method is calls the XOR method.
        int xor1=a[0];
        for (int i =1; i<a.length; i++){
            xor1=xor1^a[i];
        }
        int xor2 =1;
        for(int i=2; i<=(a.length+1); i++){
            xor2 =xor2^i;
        }
             System.out.println("missing number is "+(xor1^xor2));
    }
}
