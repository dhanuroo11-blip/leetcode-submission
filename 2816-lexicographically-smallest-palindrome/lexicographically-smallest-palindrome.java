class Solution {
    public String makeSmallestPalindrome(String s) {
        char chars[]=s.toCharArray();
        int i=0;
        int j=chars.length-1;
        while(i<j){
            char smaller=(char)Math.min(chars[i],chars[j]);
            chars[i]=chars[j]=smaller;
            i++;
            j--;
        }
        return new String(chars);
    }
}