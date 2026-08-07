class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hp.containsKey(nums[i])){
                hp.put(nums[i],1);
            }
            else{
                hp.put(nums[i],hp.get(nums[i])+1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && hp.get(nums[i])==1){
                return nums[i];

            }
        }
        return -1;
    }
}