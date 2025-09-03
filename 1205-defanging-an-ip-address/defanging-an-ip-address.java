class Solution {
    public static String defangIPaddr(String address) {
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<address.length();i++){
            char ch=address.charAt(i);
            if(ch=='.'){
                sb.append("[.]");
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String address=sc.nextLine(); 
    }
}