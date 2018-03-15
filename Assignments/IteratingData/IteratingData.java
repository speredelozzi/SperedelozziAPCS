class IteratingData {

    public static void main(String args[]) {
        // int[] nums = new int[202];

        // nums[0] = -101;

        // for(int i = 1; i < nums.length; i++) {
        //     nums[i] = nums[i - 1] + 1;
        // //     System.out.println(nums[i]);

        //     if(nums[i] < 0) {
        //         System.out.println(nums[i] * -1);
        //     }
        //     else {
        //         System.out.println(nums[i]);
        //     }
        // }

        // int[] fibonacci = new int[40];
        // fibonacci[0] = 0;
        // fibonacci[1] = 1;
        // for(int i = 1; i < fibonacci.length-1; i++) {
        //     System.out.println(fibonacci[i+1] = fibonacci[i] + fibonacci[i-1]);
        // }

        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        
        for( int value : nums) {
            int x = value;
            if( x % 2 != 0) {
                System.out.println("odd number " + x + " found");
                x++;
            }
        }

        // String[] messages = {"hello", "goodbye", "salamanders", "superfluous", "chrysanthemums"};
        // for(String m : messages) {
        //     int length = m.length();
        //     if(length > 10) {
        //         System.out.println(m);
        //     }
        // }
    }
}