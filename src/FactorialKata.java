public class FactorialKata
{

  public static String Factorial(int n) {
    String result = "1";
    String temp;
    int currentDigit;
    int edge;
    for (int i = 1; i <= n; i++) {
      temp = result;
      result = "";
      edge = 0;
      for (int j = temp.length() - 1; j >= 0; j--) {
        currentDigit = Character.getNumericValue(temp.charAt(j)) * i + edge;
        result = currentDigit % 10 + result;
        edge = currentDigit / 10;
      }
      if (edge != 0) result = edge + result;
    }
    return result;
  }

}