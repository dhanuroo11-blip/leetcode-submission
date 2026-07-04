class Solution {
    public String sortVowels(String s) {
        HashSet<Character> vowelSet= new HashSet<>(Arrays.asList('a','e','i','o','u'));
        Map<Character,Integer> freq=new HashMap<>();
        Map<Character,Integer> ind=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(vowelSet.contains(ch)){
                freq.put(ch,freq.getOrDefault(ch,0)+1);
                if(!ind.containsKey(ch)){
                    ind.put(ch,i);
                }
            }
        }
       PriorityQueue<Character> pq=new PriorityQueue<>((a, b)->{
            int freqA=freq.get(a);
            int freqB=freq.get(b);
            if (freqA!=freqB) {
                 return freqB-freqA; 
            }
           return ind.get(a)-ind.get(b); 
        });
        pq.addAll(freq.keySet());
        
        StringBuilder vowel=new StringBuilder();
        while(!pq.isEmpty()){
            char c=pq.poll();
            int count=freq.get(c);
            for(int i=0;i<count;i++){
                vowel.append(c);
            }
        }
        StringBuilder last=new StringBuilder();
        int countv=0;
        for(int i=0;i<s.length();i++){
            char l=s.charAt(i);
            if(vowelSet.contains(l)){
                last.append(vowel.charAt(countv++));
            }else{
                last.append(l);
            }
        }
        return last.toString();
    }
}