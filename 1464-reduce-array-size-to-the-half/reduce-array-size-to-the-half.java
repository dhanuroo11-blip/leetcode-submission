class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        /*List<Integer> list=new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());
        int sum=0;
        int tar=arr.length/2;
        int count=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
              count++;
             if(sum>=tar) break;     
        }*/
        int bucket[]=new int[arr.length+1];
        for(int freq:map.values()){
            bucket[freq]++;
        }
        int sum=0;
        int count=0;
        for(int i=arr.length;i>=1;i--){
            while(bucket[i]>0){
                sum+=i;
                count++;
                bucket[i]--;
                if(sum>=arr.length/2) return count;
            }
        }
        return count;
    }
}