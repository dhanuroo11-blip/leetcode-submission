class Solution {
    public long countOfSubstrings(String word, int k) {
       return atMost(word,k)-atMost(word,k-1);

    }
    private long atMost(String word,int k){
        if (k<0)
            return 0;
        int[] last=new int[5];
        Arrays.fill(last,-1);
        int l=0;
        int cons=0;
        long ans=0;
        for (int right=0;right<word.length();right++) {
            char ch=word.charAt(right);
            switch(ch) {
                case 'a':
                    last[0]=right;
                    break;
                case 'e':
                    last[1]=right;
                    break;
                case 'i':
                    last[2]=right;
                    break;
                case 'o':
                    last[3]=right;
                    break;
                case 'u':
                    last[4]=right;
                    break;
                default:
                    cons++;
            }
            while(cons>k) {
                if (!isVowel(word.charAt(l)))
                    cons--;
                l++;
            }
            int minLast=Integer.MAX_VALUE;
            for (int x:last)
                minLast=Math.min(minLast,x);
            if (minLast>=l)
                ans+=minLast-l+1;
        }
        return ans;
    }
    private boolean isVowel(char c) {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}
    