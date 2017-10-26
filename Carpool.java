// @author John Calderaio

import java.util.*;

class Carpool {
    public static void main(String args[]) {
        Gas gas = new Gas();
        gas.calculatePricePerPerson();
    }
}

class Gas {

    public void calculatePricePerPerson() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many passengers do you have?");
        int pass = scan.nextInt();

        System.out.println("How many miles is the round trip?");
        double rtd = scan.nextDouble();

        System.out.println("What gas mileage does your car get?");
        double gm = scan.nextDouble();

        System.out.println("What are the current gas prices?");
        double gp = scan.nextDouble();

        double cost = ((rtd/gm)*gp)/pass;
        System.out.println("\nEach passenger should pay $" +cost);
    }
}
