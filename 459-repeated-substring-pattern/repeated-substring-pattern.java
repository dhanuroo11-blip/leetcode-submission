class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;  // join the string with itself
        String sub = doubled.substring(1, doubled.length() - 1);
        return sub.contains(s);
    }
}
