class Solution {
    public String reversePrefix(String s, int k) {
        int i=0;
        k=k-1;
        char []arr= s.toCharArray();
        while(i<k){
            char temp = arr[i];
            arr[i]= arr[k];
            arr[k]= temp;
            i++;
            k--;
        }
        return new String(arr);
    }
}