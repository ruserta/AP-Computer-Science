import java.util.Scanner;

public class Prog54a {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is the model of the car: ");
        String model = keyboard.nextLine();

        System.out.print("How many miles were driven: ");
        double miles = keyboard.nextInt();

        System.out.print("How many gallons were used: ");
        double gallons = keyboard.nextInt();


        double mpg = (double)miles /(double)gallons;
        System.out.println("The average MPG used by the " + model + " are " + mpg + " m/g ");
    }
}

/*
        what is the model of the car: Ford Focus
        How many miles were driven: 256
        How many gallons were used: 12
        THe average MPG used by the Ford Focus are 21.333333333333332 m/g

*/
