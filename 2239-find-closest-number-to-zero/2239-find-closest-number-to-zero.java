class Solution {
    public int findClosestNumber(int[] nums) {
        int min= Integer.MAX_VALUE;
        int closest=0;
        int diff=0;
        for(int i=0; i <nums.length;i++){
            diff = Math.abs(nums[i]);
            if(diff<min){
                min= diff;
                closest = nums[i];
            }
            else if(min == diff && closest<nums[i] ){
                closest= nums[i];
            }
            
        }
        return closest;
    }
}