class Solution {
    public static int theMaximumAchievableX(int num, int t) {
        int result=num;
        for(int i=1;i<=t;i++){
            result+=2;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int t=sc.nextInt();
      int result=theMaximumAchievableX( num, t) ;
       System.out.println(result);
    }
}