package exercise3;

import java.util.Scanner;

public class NumberSearch {
  public static void main(String[] args) {
    int br = 1;
    for (int i = 100; i <= 1000; i++) {
      if (i % 30 == 0) {
        if(br == 10) {
          System.out.println(i);
          br = 1;
        } else {
          System.out.print(i + " ");
          br++;
        }
      }
    }
  }
}