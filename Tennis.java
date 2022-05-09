/**
 Name: Matthew
 <p>
 Date: April 28, 2022
 Description: The Sports super class. Sports are like minigames that we make to simulate real games, featuring random possibilities,
 resulting in goals, commentary and what not. Has overall result win or loss because the user is betting on the sport after all.
 */
import java.util.*;
import java.util.Random;

public class Tennis extends Sports{
    //Attributes
    private int homeRound=0;
    private int opposingRound=0;
    private int homePoints=0;
    private int opposingPoints=0;
    private int homeSet=0;
    private int opposingSet=0;


    //Constructor to make a tennis game
    public Tennis(Player player1, Player player2, Player player3, Player player4, Player player5, Player player6,
                  Player player7,Player player8,Player player9,Player player10){
        super(player1, player2, player3, player4, player5, player6, player7,player8,player9,player10);
    }

    public void runTennis(double wager, String chosenTeam, User gambler){
        Player[] homeTeam=getHomeTeam();
        Player[] opposingTeam=getOpposingTeam();

        int result = 0; // 2 is win, 1 is tie, 0 is lose lol loser
        Wallet wallet = gambler.getWallet();
        wallet.changeMoney(-wager);
        //3 sets
        //5 rounds each set (Bo3)
        //4 points to win 1 round
        for(int i=0; i<3; i++){
            if (homeSet==2||opposingSet==2){
                break; //Break cuz of Bo2
            }
            for(int j=0; j<5; j++) {
                if (homeRound==3||opposingRound==3){
                    break; //Break cuz of Bo3
                }
                for(int k=0;k<4;k++) {
                    //Running one round
                    Random rand = new Random();
                    int randomNum = rand.nextInt(5);
                    int secondRandomNum = rand.nextInt(5);
                    if (homeTeam[randomNum].successRate(homeTeam[randomNum]) > opposingTeam[secondRandomNum].successRate(opposingTeam[secondRandomNum])) {
                        homePoints += 1;
                        System.out.println("home team scored a point!");
                    }
                    else if (homeTeam[randomNum].successRate(homeTeam[randomNum]) < opposingTeam[secondRandomNum].successRate(opposingTeam[secondRandomNum])) {
                        opposingPoints += 1;
                        System.out.println("opposing team scored a point!");
                    }
                    else if(k==4){
                        System.out.println("The players are tied in points, but they both give up because they are tired");
                    }
                    else {
                        System.out.println("*tennis ball bouncing noises*");
                    }
                }
                //Updating Rounds won
                if(homePoints>opposingPoints){
                    homeRound+=1;
                    System.out.println("Home team won 1 round!");
                    System.out.println("");
                }
                else if(opposingPoints>homePoints){
                    opposingRound+=1;
                    System.out.println("Opposing team won 1 round!");
                    System.out.println("");
                }
                else{
                    System.out.println("This round is tied!");
                    System.out.println("");
                }
                //Resetting points for next round
                homePoints=0;
                opposingPoints=0;
            }
            //Updating Sets won
            if(homeRound>opposingRound){
                homeSet+=1;
                System.out.println("Home team won 1 set!");
                System.out.println("");
            }
            else if(opposingRound>homeRound){
                opposingSet+=1;
                System.out.println("Opposing team won 1 set!");
                System.out.println("");
            }
            else{
                System.out.println("This set is tied!");
                System.out.println("");
            }
            //Resetting rounds for next set
            homeRound=0;
            opposingRound=0;
        }


        System.out.println("The final score of home vs opposing sets won is "+homeSet+" : "+opposingSet);

        //winning
        if (chosenTeam.equals("home") && homeSet>opposingSet){
            result = 2;
            System.out.println("You won the bet and gained $"+ wager );
        }
        else if (chosenTeam.equals("opposition") && opposingSet>homeSet){
            result = 2;
            System.out.println("You won the bet and gained $"+ wager );
        }
        //losing
        else if (chosenTeam.equals("home") && opposingSet>homeSet){
            result = 0;
            System.out.println("You lost the bet and lost $"+ wager );
        }
        else if (chosenTeam.equals("opposition") && homeSet>opposingSet){
            result = 0;
            System.out.println("You lost the bet and lost $"+ wager );
        }
        else{
            result = 1;
            System.out.println("The game was tied, your wager is returned.");
        }

        wallet.changeMoney(wager * result);
    }

    //Just testing
    public static void main(String[] args) {

    }
}
