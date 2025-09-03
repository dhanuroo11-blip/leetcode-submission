class Solution {
    public static boolean isPalindrome(int x) {
        int rev=0;
        int b=x;
        while(x>0){
            rev=rev*10+x%10;
            x/=10;
        }
        if(rev!=b){
return false;
}
return true;
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(isPalindrome(x));
        
    }
}