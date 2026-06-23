class Solution {
    public int minimumRounds(int[] tasks) {
        int total=0;
        Map<Integer,Integer> map=new HashMap<>();
        Arrays.sort(tasks);
        for(int i=0;i<tasks.length;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
       List<Integer> freq=new ArrayList<>(map.values());
       for(int i=0;i<freq.size();i++){
        int count=freq.get(i);
        if(count<2){
            return -1;
        }
        else{
            int rounds=count/3;
            if(count%3!=0){
                total++;
            }
            total+=rounds;
        }
       }
       return total;
    }
}