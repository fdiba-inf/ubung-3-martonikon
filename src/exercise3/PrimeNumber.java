package exercise3;

import java.util.Scanner;

public class PrimeNumber{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n =input.nextInt();
        boolean prime = true;
        int a = 2;
        while (n>2){
          if (n % a == 0 && n!= a){
            prime= false;
            break;
          }
          if (a == 99){
            break;
          }
          a++;

        }
        System.out.println("Prime number:"+ prime);

    }
}