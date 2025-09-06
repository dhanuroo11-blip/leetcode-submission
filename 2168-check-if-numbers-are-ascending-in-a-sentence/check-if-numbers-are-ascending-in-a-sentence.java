class Solution{
public boolean areNumbersAscending(String s) {
    String[] tokens = s.split(" ");
    int prev = -1;
    for (int i = 0; i < tokens.length; i++) {
        String token = tokens[i];
        if (isNumeric(token)) {
            int num = Integer.parseInt(token);
            if (num <= prev) {
                return false;
            }
            prev = num;
        }  
        }
    return true;
}
         private boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return str.length() > 0;
    }
}

  
