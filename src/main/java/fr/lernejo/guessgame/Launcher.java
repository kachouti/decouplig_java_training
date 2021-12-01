package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher {
    public static void main (String[] args) {
     HumanPlayer player=new HumanPlayer();


        Simulation simulation=new Simulation(player);
        SecureRandom random = new SecureRandom();
        long randomNumber = random.nextLong();
        simulation.initialize(randomNumber);




    }
    }
