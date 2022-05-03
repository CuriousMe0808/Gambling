/**
 Name: Matthew
 <p>
 Date: April 28, 2022
 Description: The Sports super class. Sports are like minigames that we make to simulate real games, featuring random possibilities,
 resulting in goals, commentary and what not. Has overall result win or loss because the user is betting on the sport after all.
 */
import java.util.*;
import java.util.Random;

public class Soccer extends Sports{
    //Attributes
    //private double successChance = Player.getWins/losses ;
    private int homeScore=0;
    private int opposingScore=0;
    private int winner = 0 ;
    private Player[] homeTeam;
    private Player[] opposingTeam;

    //Constructor to make a soccer game
    public Soccer(Player player1, Player player2, Player player3, Player player4, Player player5, Player player6,
                  Player player7,Player player8,Player player9,Player player10){
        Random rand = new Random();
        int randomNum = rand.nextInt(10);
        Player[] totalPlayers={player1,player2,player3,player4,player5,player6,player7,player8,player9,player10};

        //Shuffling the 10 players
        List<Player> list =Arrays.asList(totalPlayers);
        Collections.shuffle(list);
        list.toArray(totalPlayers);

        this.homeTeam= new Player[]{totalPlayers[0], totalPlayers[1], totalPlayers[2], totalPlayers[3], totalPlayers[4]};
        this.opposingTeam= new Player[]{totalPlayers[5], totalPlayers[6], totalPlayers[7], totalPlayers[8], totalPlayers[9]};

        //for testing
        for(int i=0; i<5; i++){
            System.out.println(this.homeTeam[i]);
        }
    }

    public void runGame(){

        //do possibility stuffs
        //players fight 10 times
        for(int i=0; i<10; i++){
            Random rand = new Random();
            int randomNum = rand.nextInt(5);
            int secondRandomNum = rand.nextInt(5);
            if (homeTeam[randomNum].successRate(homeTeam[randomNum])>opposingTeam[randomNum].successRate(opposingTeam[randomNum])){
                homeScore +=1;
                System.out.println("home team scored a gooall!");
            }
            else if (homeTeam[randomNum].successRate(homeTeam[randomNum])<opposingTeam[randomNum].successRate(opposingTeam[randomNum])){
                opposingScore +=1;
                System.out.println("opposing team scored a gooall!");
            }
            else{
                System.out.println("After duking it out none of the teams were able to score");
            }
        }

        System.out.println("The final score of home vs opposing is "+homeScore+" : "+opposingScore);


        //Print out final result and give values to this.homeScore and this.opposingScore
        //print which team won or tie and then need to run wallet interaction

        //If home won, then change winner to 1. If oppose win then change winner to 2. If tie change to 3.
        // This is for wallet interaction. ^^
        winner=1;
    }

    //Just testing
    public static void main(String[] args) {

    }
}
