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
        //temp variables
        int response;
        //FROM USER POV

        //All soccer players
        Player freddyJackson = new Player("Freddy Jackson", "Soccer",17,38);
        Player michealJackson = new Player("Micheal Jackson", "Soccer",21,38);
        Player georgeWashingless = new Player("George Washingless ", "Soccer",52,21);
        Player sierraJones = new Player("Sierra Jones", "Soccer",31,24);
        Player biancaBruh = new Player("Bianca Bruh", "Soccer",51,26);
        Player teddyBez = new Player("Teddy Bez", "Soccer",31,24);
        Player jacksonDub = new Player("Jackson Dub", "Soccer",36,31);
        Player imRunning = new Player("Im Running", "Soccer",43,25);
        Player outOf = new Player("Out Of", "Soccer",2,32);
        Player namesToput = new Player("Names Toput", "Soccer",58,21);

        //FROM USER POV
        System.out.println("u want play soccer? (1:yes)(0:no)" );
        response = sc.nextInt();
        if (response==1){
            Soccer soccer = new Soccer(freddyJackson,michealJackson,georgeWashingless,sierraJones,biancaBruh,teddyBez,jacksonDub,imRunning,outOf,namesToput);
            System.out.println("How much do you want to wager?");
            double bet = sc.nextDouble();
            sc.nextLine();
            System.out.println("home or opposition?");
            String selectedTeam = sc.nextLine();
            soccer.runGame(bet, selectedTeam);
        }

    }
}
