class IteratingData {

    public static void main(String args[]) {
        // int[] nums = new int[202];

        // nums[0] = -101;

        // for(int i = 1; i < nums.length; i++) {
        //     nums[i] = nums[i - 1] + 1;
        //     System.out.println(nums[i]);
        // }

        int[] nums = new int[202];

        nums[0] = -101;

        for(int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + 1;
            java.lang.Math.abs(nums[i]);
            System.out.println(nums[i]);
        }
    }
}