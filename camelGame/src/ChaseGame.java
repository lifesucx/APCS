import java.util.Scanner;
import java.util.Random;

public class ChaseGame
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rando = new Random();
        String answer = input.nextLine();

        final int DESERT_SIZE = 200;
        int distanceTravelled = 0;
        int nativesTravelled = -30;
        int camelEnergy = 10;
        int hydration = 10;
        int water = 20;



        System.out.println("You have storlen a camel. " +
                "You are running from the natives who want to get it back and eat you. " +
                "Make sure to rest so your camel doesn't die, and drink water so you don't die.");


        boolean done = false;
        //done will always equal true for right now, because the end game is not written.
        while (!done)
        {
            //Status report
            System.out.println("You have travelled " + distanceTravelled + " miles of " + DESERT_SIZE);
            System.out.println("The natives are " + (distanceTravelled - nativesTravelled) + " miles behind you.");
            System.out.print("Your hydration level is " + hydration + " / 10.");
            System.out.println("Your camel's energy level is " + camelEnergy + " / 10.");

            //get user input
            System.out.println("What would you like to do ?");
            System.out.println("a) Run");
            System.out.println("b) Walk");
            System.out.println("c) Drink water");
            System.out.println("d) Rest");
            System.out.println("e) Quit");
            System.out.println(">>>>> ");
            answer = input.nextLine();

            //Handle user input
            if (answer.equalsIgnoreCase("a")) {
                camelEnergy -= 3;
                hydration -= 2;
                distanceTravelled += rando.nextInt(8) + 13;
            } else if (answer.equalsIgnoreCase("b")) {
                camelEnergy--;
                hydration--;
                distanceTravelled += rando.nextInt(8) + 1;
            } else if (answer.equalsIgnoreCase("c")) {
                int amount = 0;
                boolean hasNumber = false;
                while (!hasNumber) {
                    System.out.println("How much would you like to drink? You have %d water left. " + water);
                    if (input.hasNextInt()) {
                        amount = input.nextInt();
                        if (amount >= water) {
                            System.out.println("You drank the rest of your water--you need to get more water FAST!");
                            hydration += water;
                            water = 0;
                        } else {
                            hydration += amount;
                            water -= amount;
                            System.out.println("You drank " + water + "liters of water");
                        }
                        hasNumber = true;
                    } else System.out.println("\nPlease inout an integer number!");
                }
            }

        } if (answer.equalsIgnoreCase("d"))
        {
            camelEnergy += 5;
            System.out.println("You and your camel rest. Your camel restores 5 energy");
            if (rando.nextInt(100) < 33) {
                System.out.println("The place you hunker down also happens to "
                        + "have an oasis of water. Your canteen is "
                        + "completely filled! Lucky you.");
                water += 20;
            }else
                {
                    System.out.println("That is not a valid life choice" +
                            "--please enter from the choices above.");
                }
            }
             else if (answer.equalsIgnoreCase("e") || answer.equalsIgnoreCase("q"));
            {
                System.out.println("Your will weakens and you succumb to the difficulty " +
                        "of the chase. Thanks for playing!");
                done = true;
            }

            //handle random events, winning, and dying
            if (rando.nextInt(100) < 10)
            {
                System.out.println("You fell into quick sand." +
                        "It takes all but the last bit of the camel's energy to get out.");
                camelEnergy = 1;
            } else if (rando.nextInt(100) < 1)
            {
                System.out.println("You run through a mirage and it turns out to be a portal to the end of the desert. " +
                        "You find yourself magically transported 1 mile from it's border.");
                distanceTravelled = DESERT_SIZE - 1;
            }

            //handle winning and dying
            if (camelEnergy <= 0 || hydration <= 0 || nativesTravelled >= distanceTravelled)
            {
                System.out.println("Your camel rand out of energy and died. " +
                        "Good luck out-running the natives on foot! Muhhahahahha!");
                done = true;

                System.out.println("You ran out of water and passed out due to thirst. " +
                        "The natives caught you while you were comatose. " +
                        "You tasted delicious and barely work up while they were cooking you.");
                done = true;
                if (nativesTravelled >= distanceTravelled)
                {
                    System.out.println("The natives caught up with you and ate you. Nice try though.");
                    done = true;
                } else if (distanceTravelled > DESERT_SIZE)
                {
                    System.out.println("You made it out!");
                }
            }
            //the end game stuff

        }