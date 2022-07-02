package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    int expected = 5;
    assertEquals(expected, Calculate.sum(2, 3));
  }

  @Test
  public void testSumArray() {
    int[] numbers = { 2, 3, 4 };
    int expected = 9;
    assertEquals(expected, Calculate.sum(numbers));
  }

  @Test
  public void testAverage() {
    int[] numbers = { 2, 3, 4, 5 };
    double expected = 3.5;
    assertEquals(expected, Calculate.average(numbers), 0.0);
  }

  @Test
  public void testSumOdd() {
    int[] numbers = { -2, -1, 1, 2, 3, 4 };
    int expected = 3;
    assertEquals(expected, Calculate.sumOdd(numbers));
  }

  @Test
  public void testSumEven() {
    int[] numbers = { -2, -1, 1, 2, 3, 4 };
    int expected = 4;
    assertEquals(expected, Calculate.sumEven(numbers));
  }
}
