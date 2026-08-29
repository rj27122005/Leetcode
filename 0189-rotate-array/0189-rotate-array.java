class Solution {
    public void rotate(int[] nums, int k) {
        k= k%nums.length;
        int l=0,r= nums.length-1;
        while(l<=r){
            int temp =nums[l];
            nums[l]= nums[r];
            nums[r]= temp;
            l++;
            r--;
        }
        int x=0,t=k-1;
        while(x<=t){
            int tui= nums[x];
            nums[x] = nums[t];
            nums[t] = tui;
            x++;
            t--;
        }
        int e= k, w= nums.length-1;
        while(e<=w){
            int q = nums[e];
            nums[e]= nums[w];
            nums[w] = q;
            e++;
            w--;
        }

    }
}