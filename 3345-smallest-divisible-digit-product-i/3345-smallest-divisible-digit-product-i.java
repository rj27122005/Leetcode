class Solution {
    public int smallestNumber(int n, int t) {
        while(n<=100){
            int i=n;
            int rem=0;
            int pro= 1;
            while(i>0){
            rem= i%10;
            pro*= rem;
            i/=10;
            }
            if(pro %t==0){
                return n;
            }
            n++;
            
        }
    return 0;

    }
}