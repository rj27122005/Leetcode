public class Solution {
    public int LengthOfLongestSubstring(string s) {
        int l=0,sum=0,m=0;
        HashSet<char> hs= new HashSet<char> ();
        for(int r=0;r<s.Length;r++){
            while(hs.Contains(s[r])){
                hs.Remove(s[l]);
                l++;
            }
            hs.Add(s[r]);
            m= Math.Max(m, r-l+1);
        }
        return m;

    }
}