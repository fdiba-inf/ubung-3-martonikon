package exercise3;

import java.util.Scanner;
import java.lang.Math;

public class Triangle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean flag = true;
    do{
      int a = input.nextInt();
      int b = input.nextInt();
      int c = input.nextInt();

      if(a > 0 || b > 0 || c > 0) {
        
        if((a+b) > c && (a+c) > b && (b+c) > a) {
          double p = (a+b+c)/2;
          double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
          System.out.println("Area: " + area);

          if(a==b && a==c && b==c) {
            System.out.println("Triangle: equilateral");
          } else if (a==b || a==c || b==c) {
            System.out.println("Triangle: isosceles");
          } else {
            System.out.println("Triangle: scalene");
          }

        } else {
          System.out.println("Values are not correct!");
          flag = !flag;
        }

      } else {
        System.out.println("Values are not correct!");
        flag = !flag;
      }

    }while(flag);

  }
}