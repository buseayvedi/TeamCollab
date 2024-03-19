package java_practices.week01.bonusTask;

import java.util.Scanner;

public class TipCalculator {
/*
    Write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75
 */
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    tipCalculatorBuse(new Scanner(System.in));
    tipCalculatorMelike(new Scanner(System.in));

}
    public static void tipCalculatorBuse(Scanner scan){
        System.out.println("Split or No split (Yes or No)");
        String split = scan.next();

        System.out.println("Enter the number of people (number)");
        int numberOfPeople = scan.nextInt();

        System.out.println("Enter the check amount (number)");
        int checkAmount = scan.nextInt();

        System.out.println("Service Quality (Poor, Fair, Good, Great, Excellent");
        String quality = scan.next();
        scan.close();

        double totalTip = 0;

        if (quality.equalsIgnoreCase("Poor")) {
            totalTip = checkAmount * 0.05;
        } else if (quality.equalsIgnoreCase("Fair")) {
            totalTip = checkAmount * 0.1;
        } else if (quality.equalsIgnoreCase("Good")) {
            totalTip = checkAmount * 0.15;
        } else if (quality.equalsIgnoreCase("Great")) {
            totalTip = checkAmount * 0.2;
        } else if (quality.equalsIgnoreCase("Excellent")) {
            totalTip = checkAmount * 0.25;
        } else {
            System.out.println("Invalid quality");
        }

        double totalPay = totalTip + checkAmount;
        double totalPerPerson = totalPay / numberOfPeople;
        double tipPerPerson = totalTip / numberOfPeople;

        if (split.equalsIgnoreCase("Yes")) {

            System.out.println("Number of people entered " + numberOfPeople + "\nTotal to pay: $" + totalPay + "\n Total tip: $" + totalTip + "\nTotal per person: $" + totalPerPerson + "\nTip per person: $" + tipPerPerson);

        } else if (split.equalsIgnoreCase("No")) {
            System.out.println("Number of people entered " + numberOfPeople + "\nTotal to pay: $" + totalPay + "\nTotal tip: $" + totalTip);

        } else {
            System.out.println("Invalid answer");
        }

    }
    public static void tipCalculatorMelike(Scanner input){

        System.out.println("Split or No split (Yes or No)");
        String yesNo = input.next().toLowerCase();

        System.out.println("Enter the number of people: ");
        int numberOfPeople = input.nextInt();

        System.out.println("Enter check amount: ");
        double amount = input.nextDouble();

        System.out.println("How was the service quality? (Excellent * Great * Good * Fair * Poor");
        String service = input.next().toLowerCase();

        input.close();


        double totalTip = (service.equals("excellent")) ? amount * 0.25
                : (service.equals("great")) ? amount * 0.2
                : (service.equals("good")) ? amount * 0.15
                : (service.equals("fair")) ? amount * 0.1
                : amount * 0.05;
        //Kahskaal
        //lAJKSALHJLqdj

        double totalPay = amount + totalTip;

        System.out.println("Number of people: " + numberOfPeople);
        System.out.println("Total to pay: " + totalPay);
        System.out.println("Total tip: " + totalTip);

        if (yesNo.equals("yes")) {
            System.out.println("Total per person: " + (totalPay / numberOfPeople));
            System.out.println("Tip per person: " + (totalTip / numberOfPeople));
        }
    }
}
