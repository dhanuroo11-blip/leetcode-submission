class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=0;
        Arrays.sort(costs);
        int sum=0;
        for(int i=0;i<costs.length;i++){
           if(coins<costs[i]) {
            break;
           }
           coins-=costs[i];
           max++;
        }
        return max;
    }
}