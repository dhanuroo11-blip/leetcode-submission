class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int rev1=0;
        int rev2=0;
       // if(num%10==0) return false;
        if(num==0) return true;
        while(temp!=0){
          rev1=rev1*10+temp%10;
          temp/=10;  
        }
        int temp1=rev1;
        while(temp1!=0){
            rev2=rev2*10+temp1%10;
            temp1/=10;
        }
if(rev2!=num){
    return false;
}
return true;
    }
}