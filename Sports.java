/**
 Name: Matthew
 <p>
 Date: April 28, 2022
 Description: The Sports super class. Sports are like minigames that we make to simulate real games, featuring random possibilities,
 resulting in goals, commentary and what not. Has overall result win or loss because the user is betting on the sport after all.
 */

public class Sports {
    //Attributes
    private int homeScore;
    private int opposingScore;
    private Player[] homeTeam;
    private Player[] opposingTeam;
    private String name ;
    private int wins ;
    private int losses ;

    //Default constructor
    public Sports(){
    }

    //Constructor to make a sports game
    public Sports(Player[] homeTeam, Player[] opposingTeam){
        this.homeTeam = homeTeam ;
        this.opposingTeam = opposingTeam ;
    }

    public void walletInteraction(int result){
        //If winner =1 win, etc etc
        //If tie give back money, else lose money.

    }
}
