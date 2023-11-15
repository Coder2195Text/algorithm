public class Cooking {
  public static int digits(int i) {
    return Integer.toString(i).length();
  }

  public static boolean divisible(int a, int b) {
    return a % b == 0;
  }

  public static int sumOddInRange(int a, int b) {
    if (a > b) {
      throw new IllegalArgumentException("a must be less than or equal to b");
    }
    int sum = 0;
    for (int i = a; i <= b; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
    }
    return sum;
  }

  public static int sum10Range(int a, int b) {
    if (a > b) {
      throw new IllegalArgumentException("a must be less than or equal to b");
    }
    int sum = 0;
    for (int i = a; i <= b; i++) {
      if (i % 10 == 0) {
        sum += i;
      }
    }
    return sum;
  }

  public static int sumDigits(int a) {
    int sum = 0;
    while (a > 0) {
      sum += a % 10;
      a /= 10;
    }
    return sum;
  }

  public static int largestPower(int a) {
    int power = 0;
    while (true) {
      if (Math.pow(2, power) > a) {
        return (int) Math.pow(2, power-1);
      }
      power++;
    }
  }
}