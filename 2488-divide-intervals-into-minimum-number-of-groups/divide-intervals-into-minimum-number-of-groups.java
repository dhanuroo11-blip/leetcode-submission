class Solution {
    public int minGroups(int[][] intervals) {
     Arrays.sort(intervals,(a,b)->a[0]-b[0]);
     PriorityQueue<Integer> pq=new PriorityQueue<>();
     for(int[] interval:intervals){
        int s=interval[0];
        int e=interval[1];
        if(!pq.isEmpty()&&pq.peek()<s){
            pq.poll();
        }
        pq.add(e);
     }
     return pq.size();
    }
}