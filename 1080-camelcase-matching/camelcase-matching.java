class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> result=new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            result.add(isMatch(queries[i],pattern));
        }
        return result;

    }
    private boolean isMatch(String Q,String pattern){
        int p2=0;
        for(int p1=0;p1<Q.length();p1++){
            char ch=Q.charAt(p1);
            if(p2<pattern.length()&&ch==pattern.charAt(p2)){
                p2++;
            }
            else if(Character.isUpperCase(ch)){
                return false;
            }
        }
        return p2==pattern.length();
    }
}