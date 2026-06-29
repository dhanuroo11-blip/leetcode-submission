class Solution {
    public int prefixConnected(String[] words, int k) {
        Map<String,Integer>map=new HashMap<>();
        
        for(int i=0;i<words.length;i++){
            String word=words[i];
            if(word.length()<k) continue; 
            String pre=word.substring(0,k);
            map.put(pre,map.getOrDefault(pre,0)+1);

        }
        List<Integer> list=new ArrayList<>(map.values());
        int count=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>1){
                count++;
            }
        }
        return count;
    }
}