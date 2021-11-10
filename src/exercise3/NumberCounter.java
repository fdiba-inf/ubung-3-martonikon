package exercise3;

import java.util.Scanner;

public class NumberCounter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double sum = 0;
    int positiveCounter = 0;
    int negativeCounter = 0;
    double average = 0;
    int a = input.nextInt();
    while(a != 0) {
      if(a >= 0) positiveCounter++; else negativeCounter++;
      sum += a;
      a = input.nextInt();
    }

    average = sum / (positiveCounter + negativeCounter);

    System.out.println("Positive numbers: " + positiveCounter);
    System.out.println("Negative numbers: " + negativeCounter);
    System.out.println("Sum: " + sum);
    System.out.println("Average: "+ average);
  }
}