class Solution {
    public int longestPalindrome(String[] words) {
        int length=0;
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            String ch=words[i];
            String rev=""+ch.charAt(1)+ch.charAt(0);
            if(map.getOrDefault(rev,0)>0){
              length+=4;
              map.put(rev,map.getOrDefault(rev,0)-1);
            }else{
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        for(int i=0;i<26;i++){
            char ch=(char) ('a'+i);
            String dou=""+ch+ch;
            if(map.getOrDefault(dou,0)>0){
                length+=2;
                break;
            }
        }
        return length;
    }
}