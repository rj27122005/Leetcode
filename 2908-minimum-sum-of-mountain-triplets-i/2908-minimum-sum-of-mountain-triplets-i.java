class Solution {
    public int minimumSum(int[] nums) {
        int s=Integer.MAX_VALUE;
        for(int i=0; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k< nums.length;k++){
                    if(nums[i]< nums[j] && nums[k] < nums[j]){
                        s= Math.min(s, nums[i] + nums[j] + nums[k]);
                    }
                }
            }
        }if(s==Integer.MAX_VALUE){
            return -1;
        }
        return s;
    }
}