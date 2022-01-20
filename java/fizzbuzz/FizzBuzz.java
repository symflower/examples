package fizzbuzz;

public final class FizzBuzz
{
  public static String fizzBuzz(int x)
  {
    String str = "";
    for (int i = 1; i <= x; i++) {
      str += fizzBuzzN(i) + "\n";
    }
    return str;
  }

  public static String fizzBuzzN(int x)
  {
    if (x < 1)
      throw new IllegalArgumentException("x < 1");
    if (x % 15 == 0)
      return "FizzBuzz";
    if (x % 3 == 0)
      return "Fizz";
    if (x % 5 == 0)
      return "Buzz";
    return Integer.toString(x);
  }
}
