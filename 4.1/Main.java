public class Main {
  public static void main(String[] args) {
    // Test Cooking.digits
    assert Cooking.digits(123) == 3;
    assert Cooking.digits(0) == 1;
    assert Cooking.digits(987654321) == 9;
    System.out.println("Cooking.digits OK");

    // Test Cooking.divisible
    assert Cooking.divisible(9, 3);
    assert Cooking.divisible(10, 2);
    assert !Cooking.divisible(10, 3);
    assert Cooking.divisible(0, 1);
    System.out.println("Cooking.divisible OK");

    // Test Cooking.sumOddInRange
    assert Cooking.sumOddInRange(1, 1) == 1;
    assert Cooking.sumOddInRange(4, 9) == 21;
    assert Cooking.sumOddInRange(1, 12) == 36;
    assert Cooking.sumOddInRange(0, 1) == 1;
    assert Cooking.sumOddInRange(0, 69) == 1156;
    System.out.println("Cooking.sumOddInRange OK");

    // Test Cooking.sum10Range
    assert Cooking.sum10Range(1, 1) == 0;
    assert Cooking.sum10Range(4, 9) == 0;
    assert Cooking.sum10Range(0, 10) == 10;
    assert Cooking.sum10Range(0, 100) == 550;
    System.out.println("Cooking.sum10Range OK");

    // Test Cooking.sumDigits
    assert Cooking.sumDigits(0) == 0;
    assert Cooking.sumDigits(1) == 1;
    assert Cooking.sumDigits(321) == 6;
    assert Cooking.sumDigits(987654321) == 45;
    System.out.println("Cooking.sumDigits OK");

    // Test Cooking.largestPower
    assert Cooking.largestPower(0) == 0;
    assert Cooking.largestPower(800) == 512;
    assert Cooking.largestPower(1024) == 1024;
    assert Cooking.largestPower(1025) == 1024;
    System.out.println("Cooking.largestPower OK");

  }
}