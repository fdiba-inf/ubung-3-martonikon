package exercise3;

import java.util.Scanner;

public class NumberSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int counter = 0;
        for(number=100; number >1000; number++){

          if(number % 5 == 0 && number % 6 == 0){
            if(counter>9){
              System.out.print(number + " ");
              counter++;
            }else{
              System.out.println(number);
              counter++;
            }
          }
        }





    }
}
