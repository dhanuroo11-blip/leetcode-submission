class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set=new HashSet<>();
        int length=0;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                length+=2;
            }
            else{
                set.add(s.charAt(i));
            }
        }
        if(!set.isEmpty()){
            length+=1;
        }
        return length;
    }
}