package arrayQuestion;

public class find_Duplicate_Element_In_Array {
    public static void main(String[] args) {
        /*
    Find duplicate element in array.
    brute force method

         */
        int[] nums = {1,2,4,2,2};
        System.out.println(dup(nums));
    }
    public static int dup(int[] nums) {
        int len = nums.length;
        int result =0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {

                if (nums[i] == nums[j] && (i != j)) {
                     result = nums[j];
                }
            }
        }
        return result;
    }
}
