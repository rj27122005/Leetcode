class Solution {
    public int minimumSwaps(int[] nums) {
        int c=0;
        int l=0, r= nums.length-1;
        while(l<=r ){
            if(nums[r]==0){
                r--;
                continue;
            }
            if(nums[l]==0){
                int temp= nums[l];
                nums[l]= nums[r];
                nums[r] = temp;
                c++;
                r--;
            } l++;
        }
        return c;
    }
}