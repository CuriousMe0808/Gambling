/**
 Name: Matthew
 <p>
 Date: April 27, 2022
 Description: this is the main class, this is what the user sees basically.
 */

import java.util.*;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //temp variable
        int response;

        //FOR SPORTS GAMES
        //Creates players
        Player freddyJackson = new Player("Freddy Jackson",17,38);
        Player michealJackson = new Player("Micheal Jackson",21,38);
        Player georgeWashingless = new Player("George Washingless ",52,21);
        Player sierraJones = new Player("Sierra Jones",31,24);
        Player biancaBruh = new Player("Bianca Bruh",51,26);
        Player evan = new Player("Evan",69,21);
        Player gary = new Player("Gary",21,69);
        Player imRunning = new Player("Im Running",43,25);
        Player outOf = new Player("Out Of",2,32);
        Player namesToput = new Player("Names Toput",58,21);

        //SOCCER
        System.out.println("u want play soccer? (1:yes)(0:no)" );
        response = sc.nextInt();
        if (response==1){
            //Creating soccer game with 10 "players"
            Soccer soccer = new Soccer(freddyJackson,michealJackson,georgeWashingless,sierraJones,biancaBruh,evan,gary,imRunning,outOf,namesToput);

            //Gets their wager
            System.out.println("How much do you want to wager?");
            double bet = sc.nextDouble();
            sc.nextLine();

            //Prints out the players on both teams
            Player[] tempHome = soccer.getHomeTeam();
            System.out.println("Home team players:");
            for(int i=0; i<5; i++){
                System.out.println(tempHome[i]);
            }
            Player[] tempOpposition = soccer.getOpposingTeam();
            System.out.println("Opposition team players:");
            for(int i=0; i<5; i++){
                System.out.println(tempOpposition[i]);
            }

            //Gets them to pick side and runs the game
            System.out.println("home or opposition?");
            String selectedTeam = sc.nextLine();
            User bary = new User("garyisbad", "garyisbad1", "696969");
            bary.getWallet().changeMoney(1000000);
            soccer.runSoccer(bet, selectedTeam, bary);
            System.out.println(bary.getWallet().getQtyUSD());
        }


        //TENNIS
        System.out.println("u want play tennis? (1:yes)(0:no)" );
        response = sc.nextInt();
        if (response==1){
            //Creating tennis game with 10 "players"
            Tennis tennis = new Tennis(freddyJackson,michealJackson,georgeWashingless,sierraJones,biancaBruh,evan,gary,imRunning,outOf,namesToput);

            //Gets their wager
            System.out.println("How much do you want to wager?");
            double bet = sc.nextDouble();
            sc.nextLine();

            //Prints out the players on both teams
            Player[] tempHome = tennis.getHomeTeam();
            System.out.println("Home team players:");
            for(int i=0; i<5; i++){
                System.out.println(tempHome[i]);
            }
            Player[] tempOpposition = tennis.getOpposingTeam();
            System.out.println("Opposition team players:");
            for(int i=0; i<5; i++){
                System.out.println(tempOpposition[i]);
            }

            //Gets them to pick side and runs the game
            System.out.println("home or opposition?");
            String selectedTeam = sc.nextLine();
            User jary = new User("garyisbad", "garyisbad1", "696969");
            jary.getWallet().changeMoney(1000000);
            tennis.runTennis(bet, selectedTeam, jary);
            System.out.println(jary.getWallet().getQtyUSD());
        }
    }
}
