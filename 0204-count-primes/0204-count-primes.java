class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0; 
        boolean[] prime = new boolean[n];
        int cnt = 0;
    
        for (int i = 2; i < n; i++) {
            if (!prime[i]) { 
                cnt++;
                
                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        prime[j] = true; 
                    }
                }
            }
        }
        return cnt;
    }
}
