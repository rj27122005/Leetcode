class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int c=0,rem=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                rem= nums[i]%10;
                nums[i]/=10;
                if(rem==digit){
                    c++;
                }
            }
        }
        return c;
    }
}