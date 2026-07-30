class Solution {
    public int countKeyChanges(String s) {
        int c=0;
        String w= s.toLowerCase();
        for(int i=0;i<w.length()-1;i++){
            if(w.charAt(i)!=w.charAt(i+1)){
                c++;
            }
        }
        return c;
    }
}