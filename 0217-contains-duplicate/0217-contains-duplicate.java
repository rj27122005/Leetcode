class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hp= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hp.containsKey(nums[i])){
                hp.put(nums[i],1);
            }
            hp.put(nums[i], hp.get(nums[i])+1);
        }
        for(int i=0;i<nums.length;i++){
            if(hp.get(nums[i])>2){
                return true;
            }
        }
        return false;
    }
}