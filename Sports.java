import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    //Constructor to make a sports team
    public Sports(Player player1, Player player2, Player player3, Player player4, Player player5, Player player6,
                  Player player7,Player player8,Player player9,Player player10){
        Player[] totalPlayers={player1,player2,player3,player4,player5,player6,player7,player8,player9,player10};

        //Shuffling the 10 players
        List<Player> list = Arrays.asList(totalPlayers);
        Collections.shuffle(list);
        list.toArray(totalPlayers);

        //Splits into two random teams because the total players have been shuffled
        this.homeTeam= new Player[]{totalPlayers[0], totalPlayers[1], totalPlayers[2], totalPlayers[3], totalPlayers[4]};
        this.opposingTeam= new Player[]{totalPlayers[5], totalPlayers[6], totalPlayers[7], totalPlayers[8], totalPlayers[9]};
    }

    public Player[] getHomeTeam(){
        return homeTeam;
    }
    public Player[] getOpposingTeam(){
        return opposingTeam;
    }

}
