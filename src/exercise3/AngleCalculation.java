package exercise3;

import java.util.Scanner;

public class AngleCalculation{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double winkel= input.nextDouble();
        char ch = input.next().charAt(0);
        double grad = (winkel * 180.0) / 3.14;
        double radiant =(winkel *3.14) /180.0;

        do{
          if (ch == 'r'){
            radiant = (winkel * 3.14)/180.0;
            System.out.println("Angle: " + radiant + ch);
          }else{
            grad = (winkel * 180.0)/3.14;
            System.out.println("Angle: " + grad + ch);

          }
          ch = input.next().charAt(0);
          winkel= input.nextDouble();
        }while (ch ==  'r' || ch == 'd');
    }
}