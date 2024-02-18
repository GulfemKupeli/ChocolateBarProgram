import java.util.Scanner;

public class ChocolateBarProgram {
    public static void main(String[] args){
        /**

         Program description: Chocolate Bar Program

         Author: Gülfem Küpeli

         E-mail address: 210401024@ogr.ikcu.edu.tr

         Homework Number: 03

         Last Changed: 10/11/2023

         */


        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the initial amount in dollars: ");
        int N = scanner.nextInt();

        scanner.close();
        int chocolate = 0;
        int coupons = 0;

        // I used a loop to redeem chocolate bars until coupons ran out.
        while (N >= 1 || coupons >= 6) {
            // Buy a chocolate bar for $1
            N = N - 1;
            chocolate = chocolate + 1;
            coupons += 1;

            // This if statement checks if you have enough coupons to redeem for a free chocolate bar
            if (coupons >= 6) {
                chocolate += 1;
                coupons -= 5;
            }
        }
        System.out.println("You can consume " + chocolate + " chocolate bars and have " + coupons + " coupons left.");
    }
}
