import java.io.*;
import java.util.*;

public class Ackermann {

  public static int ack(int m, int n) {
    if (m == 0) {
      return n + 1;
    }else if (m > 0 && n == 0) {
      int recurse = ack(m - 1, 1);
      return recurse;
      }else if (m > 0 && n > 0) {
        int recurse = ack(m - 1, ack(m,n - 1));
        return recurse;
      }
    return ack(m, n);
    }
  

  public static void main(String[] args) {
    System.out.println(ack(3, 4));
  }
}
