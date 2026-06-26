class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<senders.length;i++){
            int word=messages[i].split(" ").length;
            map.put(senders[i],map.getOrDefault(senders[i],0)+word);
        }
        int max=0;
        int count=0;
        String result="";
        for(String s:map.keySet()){
            count=map.get(s);
            if(count>max||count==max&&s.compareTo(result)>0){
                max=count;
                result=s;
            }
        }
        return result;
    }
}