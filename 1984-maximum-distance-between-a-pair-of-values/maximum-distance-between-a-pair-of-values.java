class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int maxlen=0;
        //int len=0;
        int i=0,j=0;
       while(i<n1&&j<n2){
        if(nums1[i]<=nums2[j]){
            maxlen=Math.max(maxlen,j-i);
            j++;
        }else{
            i++;
        }
       }
        return maxlen;
    }
}