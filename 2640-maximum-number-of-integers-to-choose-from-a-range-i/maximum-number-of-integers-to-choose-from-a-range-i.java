class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int b=banned.length;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<b;i++){
            set.add(banned[i]);
        }
        int sum=0;
        int count=0;
        for(int i=1;i<=n;i++){
            if(set.contains(i)) continue;
                
                if(sum+i>maxSum) break;
                sum+=i;
                count++;
            
           
        }
        return count;
    }
}