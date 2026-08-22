class Solution {
    public int mirrorDistance(int n) {
        int dig=0,rev=0;
        int ori=n;
        while(n>0){
            dig= n%10;
            rev= rev*10+dig;
            n/=10;
        }
        int diff= rev-ori;
        return Math.abs(diff);
    }
}