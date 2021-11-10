package exercise3;

import java.util.Scanner;
import java.lang.Math;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;

        do{
          double grad = input.nextInt();
          char type = input.next().charAt(0);
          if(type == 'd') {
            double r = grad*Math.PI/180;
            System.out.println("Angle: " + String.format("%.2f", r));
          } else if(type == 'r') {
            double d =  grad*180/Math.PI;
            System.out.println("Angle: " + String.format("%.2f", d));
          } else {
            flag = !flag;
          }
        }while(flag);
    }
}