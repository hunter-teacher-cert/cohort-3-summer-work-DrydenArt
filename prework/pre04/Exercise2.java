public class Exercise2 {

  public static void nLines(int n) {
    if (n > 0) {
      System.out.println();
      nLines(n - 1);
    }
  }

  public static void main(String[] args) {

    nLines(4);
  }
}