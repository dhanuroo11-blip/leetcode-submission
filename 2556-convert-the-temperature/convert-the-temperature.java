import java.util.Scanner;

class Solution {
    public static double[] convertTemperature(double celsius) {
        double k = celsius + 273.15;
        double f = celsius * 1.80 + 32.00;
        return new double[]{k, f};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
         
        System.out.println(convertTemperature(celsius));
        
        sc.close(); 
    }
}