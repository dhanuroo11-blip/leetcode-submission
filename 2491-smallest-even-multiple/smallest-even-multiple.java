class Solution {
    public static int smallestEvenMultiple(int n) {
        int ans=n*2;
        if(n%2==0){
            return n;
        }else{
              return ans;
        }
        

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(smallestEvenMultiple(n));
    }
}