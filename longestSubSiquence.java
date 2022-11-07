package arrayQuestion;

import java.util.HashSet;

public class longestSubSiquence {
    public static void main(String[] args) {
        int[] a = {3,9,1,4,10,20,2};
        HashSet<Integer> hs = new HashSet<>();
        for (int j : a) {
            hs.add(j);
        }
        int long_length = 0;
        for (int j : a) {
            if (!hs.contains(j - 1)) {
                int no = j;

                while (hs.contains(no)) {
                    no++;
                }
                if (long_length < no - j) {
                    long_length = no - j;
                }
            }
        }
        System.out.println("longest sub siquence is : "+long_length);
    }
}
