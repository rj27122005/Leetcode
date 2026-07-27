class Solution {
    public int maxProduct(int[] nums) {
        // Initialize variables to keep track of the two largest numbers
        int max1 = 0, max2 = 0;

        for (int num : nums) {
            if (num > max1) {
                // Update max1 and shift max1 to max2
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                // Update max2
                max2 = num;
            }
        }

        // Compute the product
        return (max1 - 1) * (max2 - 1);
    }
}
