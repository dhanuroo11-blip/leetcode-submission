class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
      int countp=0;
      int countg=0;
      int countm=0;
      int lastp=0;
      int lastg=0;
      int lastm=0;
      for(int i=0;i<garbage.length;i++){
        String s=garbage[i];
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(ch=='M'){
                countm+=1;
                lastm=i;
            }
            else if(ch=='P'){
                countp+=1;
                lastp=i;
            }
            else{
                countg+=1;
                lastg=i;
            }
            }
        }
        int travelp=0;
        int travelm=0;
        int travelg=0;
        for(int i=0;i<lastp;i++){
            travelp+=travel[i];
        }
        for(int i=0;i<lastm;i++){
            travelm+=travel[i];
        }
        for(int i=0;i<lastg;i++){
            travelg+=travel[i];
        }
        int ans=travelp+countp+travelg+countg+travelm+countm;

        return ans;
      }  
    }
