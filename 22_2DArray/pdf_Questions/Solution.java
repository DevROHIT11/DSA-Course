
class Solution {

    public static int removeDuplicates(int[] nums) {
        int narr[] = new int[nums.length];
        int currpos = 0;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                narr[0] = nums[0];
                currpos = i;
                counter++;
            } else if (narr[currpos] != nums[i]) {
                currpos++;
                narr[currpos] = nums[i];
                counter++;
            }
        }
        for (int i = 0; i < narr.length; i++) {
            System.out.print(narr[i] + " ");
        }
        return counter;
    }

    public static void main(String[] args) {
        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

}
