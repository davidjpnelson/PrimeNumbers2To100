public class PrimeNumbers2To100 {

  public static void main(String[] args) {
    boolean prime = true;
    for (int i = 2; i < 100; i++) {
      for (int j = 2; j <= i/j; j++)
        if (i % j == 0) {
          prime = false;
          break;
        }
      if (prime)
        System.out.println(i);
      prime = true;
    }
  }
}
