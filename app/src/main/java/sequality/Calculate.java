package sequality;

public class Calculate {
  public static int sum(int... numbers) {
    var t = 0;
    for (var n : numbers) {
      t += n;
    }
    return t;
  }

  public static double average(int... numbers) {
    return sum(numbers) / (double) numbers.length;
  }

  public static int sumOdd(int... numbers) {
    var t = 0;
    for (var n : numbers) {
      if ((n & 1) != 0) {
        t += n;
      }
    }
    return t;
  }

  public static int sumEven(int... numbers) {
    var t = 0;
    for (var n : numbers) {
      if ((n & 1) == 0) {
        t += n;
      }
    }
    return t;
  }
}
