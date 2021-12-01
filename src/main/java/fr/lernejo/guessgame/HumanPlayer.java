package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

  public class HumanPlayer implements Player {
    Logger logger = LoggerFactory.getLogger("player");

      public long askNextGuess(){
          long numberToGuess=0;
          return numberToGuess;
      }

    public void respond(boolean lowerOrGreater){
        Scanner scan = new Scanner(System.in);
        logger.log("Enter a guess: ");
       long  numberToGuess=14;
        int guess = scan.nextInt();


        logger.log("Your guess is " + guess);


            if (guess <numberToGuess) {
                lowerOrGreater=false;
                logger.log("Your guess is smaller than the secret number.");


            }
            else if (guess > numberToGuess){
                lowerOrGreater=true;
                logger.log("Your guess is greater than the secret number.");
            }


        }

    }





