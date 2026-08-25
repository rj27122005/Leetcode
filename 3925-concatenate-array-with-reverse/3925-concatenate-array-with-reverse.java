class Solution {
    public int[] concatWithReverse(int[] nums) {
        int [] ans= new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
        }
        int l=0,r=nums.length-1;
        while(l<r){
            int temp=nums[l];
            nums[l]= nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        for(int i=0;i<nums.length;i++){
            ans[nums.length+i]= nums[i];
        }
        return ans;
    }
}