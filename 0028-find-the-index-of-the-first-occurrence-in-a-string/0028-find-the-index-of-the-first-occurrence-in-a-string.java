class Solution {
    public int strStr(String haystack, String needle) {
        int windowLength = needle.length();
        int res = -1;
        for(int i=0;i<=haystack.length()-windowLength;i++){
            if(haystack.substring(i,i+windowLength).equals(needle)){
                res = i;
                break;
            }
        }
        return res;
    }
}