class Solution {
    public String convertToTitle(int columnNumber) {
        int remainder=0;
        StringBuilder result=new StringBuilder();
        while(columnNumber>0){
            remainder=(columnNumber-1)%26;
            char c=(char)(remainder+'A');
            result.append(c);
            columnNumber=(columnNumber-1)/26;
        }
        return result.reverse().toString();
    }
}