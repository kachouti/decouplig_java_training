package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class Simulation {
    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        this.player=player;
       ;
        //TODO implement me
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess=numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */



    private boolean nextRound() {


        Scanner scan = new Scanner(System.in);

        int guess;

        logger.log("Enter a guess: ");

        guess = scan.nextInt();

        logger.log("Your guess is " + guess);

        if (guess == numberToGuess){
       logger.log("Your guess is correct. Congratulations!");

        return true;
        }

        else {
            if (guess < numberToGuess) {
                logger.log("Your guess is smaller than the secret number.");


            }
            else if (guess > numberToGuess){

                logger.log("Your guess is greater than the secret number.");
            }

            return false;
        }




    }

    public void loopUntilPlayerSucceed() {

        do {



        } while (nextRound() != true);

    }
}
