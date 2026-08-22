class Solution {
    public boolean checkDivisibility(int n) {
        int s=0,p=1;
        int ori= n;
        while(n>0){
            s+= n%10;
            n/=10;
        }
        n=ori;
        while(n>0){
            p*=n%10;
            n/=10;
        }
        int dig= s+p;
        if(ori%dig==0){
            return true;
        }else
        return false;
    }
}