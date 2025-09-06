import java.time.LocalDate;
class Solution {
    public static int dayOfYear(String date) {
       LocalDate d=LocalDate.parse(date);
       return d.getDayOfYear(); 
    }
}