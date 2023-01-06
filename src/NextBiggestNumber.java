import java.util.Arrays;

public class NextBiggestNumber {
    public static long nextBiggerNumber(long n) {
        System.out.println(n);
        StringBuffer number = new StringBuffer(String.valueOf(n));
        char digit0;
        char digit1;
        char temp;
        if (number.length() < 2) {
            return -1;
        }
        for (int i = number.length() - 1; i > 0; i--) {
            digit0 = number.charAt(i - 1);
            digit1 = number.charAt(i);
            if (digit0 < digit1) {
                number.replace(i, number.length(), sortString(number.substring(i)));
                for (int j = i; j < number.length(); j++) {
                    if (number.charAt(j) > digit0) {
                        temp = number.charAt(j);
                        number.setCharAt(i - 1, temp);
                        number.setCharAt(j, digit0);
                        return Long.parseLong(number.toString());
                    }
                }
            }
        }
        return -1;
    }

    public static long nextBiggerNumberTest(long n) {
        System.out.println(n);
        StringBuffer number = new StringBuffer(String.valueOf(n));
        char tempI;
        char tempJ; 
        for (int i = number.length() - 1; i > 0; i--) {
            tempI = number.charAt(i);
            for (int j = i - 1; j >= 0; j--) {
                tempJ = number.charAt(j);
                if (Long.parseLong(tempJ + "") < Long.parseLong(tempI + "")) {
                    number.setCharAt(i, tempJ);
                    number.setCharAt(j, tempI);
                    number.replace(j + 1, number.length(), sortString(number.substring(j + 1)));
                    return Long.parseLong(number.toString());
                }
            }
        }
        return -1;
    }

    private static String sortString(String string) {
        char[] charArray = string.toCharArray();
        Arrays.sort(charArray);
        String result = new String(charArray);
        return result;
    }
}