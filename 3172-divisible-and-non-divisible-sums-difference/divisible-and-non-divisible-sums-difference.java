import java.util.Scanner;

class Solution {
    
    public static int differenceOfSums(int n, int m) {
        int sum1 = 0; 
        int sum2 = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sum1 += i;
            } else {
                sum2 += i;
            }
        }
        return sum2 - sum1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = differenceOfSums(n, m); 
        System.out.println(result);

        sc.close();
    }
}