/**
 Name: Matthew
 <p>
 Date: April 28, 2022
 Description: Player class, registers new players that will be competing
 */

public class Player {
    // attributes

    /**
     * player's name
     */
    private String name ;

    /**
     * sport the player plays
     */
    private String sportPlayed ;

    /**
     * amount of wins the player has
     */
    private int wins ;

    /**
     * amount of wins the player has
     */
    private int losses ;

    /**
     * fun facts about the player
     */
    private String funFact ;

    //constructors

    /**
     * Default constructor
     */
    public Player(){
        this.name="";
        this.sportPlayed="";
        this.wins=0;
        this.losses=0;
        this.funFact="";
    }

    /**
     * Registers a player
     * @param name name
     * @param sportPlayed sport the player plays
     * @param wins player's wins
     * @param losses player's losses
     * @param funFact player's fun fact
     */
    public Player(String name, String sportPlayed, int wins, int losses, String funFact){
        this.name= name;
        this.sportPlayed = sportPlayed;
        this.wins= wins;
        this.losses= losses;
        this.funFact= funFact;
    }

    //getter methods

    /**
     * gets name
     * @return name of player
     */
    public String getName(){
        return this.name;
    }

    /**
     * gets sport the player plays
     * @return sport the player plays
     */
    public String getSportPlayed(){
        return this.sportPlayed;
    }

    /**
     * gets player's wins
     * @return player's wins
     */
    public int getWins(){
        return this.wins;
    }

    /**
     * gets player's losses
     * @return player's losses
     */
    public int getLosses(){
        return this.losses;
    }

    /**
     * gets player's fun fact
     * @return player's fun fact
     */
    public String getFunFact(){
        return this.funFact;
    }

    //setter methods

    /**
     * changes player's wins
     * @param newWins new wins
     */
    public void setWins(int newWins){
        this.wins = newWins;
    }


    /**
     * changes player's losses
     * @param newLosses new losses
     */
    public void setLosses(int newLosses){
        this.losses = newLosses;
    }

    /**
     * changes player's fun fact
     * @param newFunFact new fun fact
     */
    public void setFunFact(String newFunFact){
        this.funFact = newFunFact;
    }

    //toString

    public String toString() {
        return ("Name: " + this.name + "\nSport: " + this.sportPlayed + " \nWins: " + this.wins + "\nLosses: " + this.losses + "\nFun fact: "+ this.funFact + "\n");
    }

    public static void main(String[] args) {
        Player freddyJackson = new Player("Freddy Jackson", "Soccer",17,38,"Lost all five of his kids in a divorce battle");
        System.out.println(freddyJackson.toString());
    }
}
