class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n=answerKey.length();
        int countf=0;
        int countt=0;
        int left=0;
        int maxlen=0;
        for(int i=0;i<n;i++){
            if(answerKey.charAt(i)=='T') countt++;
            else countf++;
            while(countt>k&&countf>k){
                if(answerKey.charAt(left)=='T') countt--;
                else countf--;
                left++;
            }
            maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}