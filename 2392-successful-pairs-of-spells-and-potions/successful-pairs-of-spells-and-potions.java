class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int result[]=new int[spells.length];
        for(int i=0;i<spells.length;i++){
            long l=(spells[i]+success-1)/spells[i];
            int firstIndex=firstValidIndex(potions,l);
            result[i]=potions.length-firstIndex;
        }
        return result;
    }
        private static int firstValidIndex(int potions[],long target){
            int low=0;
            int high=potions.length;
            while(low<high){
                int mid=low+(high-low)/2;
                if(potions[mid]>=target){
                    high=mid;
                }else{
                    low=mid+1;
                }
            }
            return low;
        }
    
}