// We need to sum big numbers and we require your help.

// Write a function that returns the sum of two numbers. The input numbers are strings and the function must return a string.

// Example
// add("123", "321"); -> "444"
// add("11", "99");   -> "110"
// Notes
// The input numbers are big.
// The input is a string of only digits
// The numbers are positives

public class AddingBigNumbers {
    public static String add(String a, String b) {
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        String result = "";
        int edge = 0;
        int sum = 0;
        int len = a.length() > b.length() ? a.length() : b.length();
        a = String.format("%" + len + "s", a).replace(' ', '0');
        b = String.format("%" + len + "s", b).replace(' ', '0');
        for (int i = len - 1; i >= 0; i--) {
            sum = Integer.parseInt(String.valueOf(a.charAt(i))) + Integer.parseInt(String.valueOf(b.charAt(i))) + edge;
            result = sum % 10 + result;
            edge = sum / 10;
        }
        if (edge != 0) {
            result = edge + result;
        }
        if (result.charAt(0) == '0') {
            result = result.substring(1);
        }
        return result;
    }
}
