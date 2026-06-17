class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int count=0;
        int dif[]=new int[capacity.length];
        for(int i=0;i<rocks.length;i++){
            dif[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(dif);
        for(int i=0;i<dif.length;i++){
            if(additionalRocks>=dif[i]){
                additionalRocks-=dif[i];
                count++;
            }
        }
        return count;
    }
}