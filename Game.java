public class Game {
    /* Attributes */

    /** list of players in the game */ 
    private User[] players; 

    /** players' bets on the game */ 
    private double[] bets;

    /** identification number of the game */ 
    private int gameID; 

    /*
    Constructors 
    */

    /** 
    Creates a basic Game 
    @param players[] players in the game
    @param bet players' bets on the game
    @param gameID identification number of the game
    */ 
    public Game(User[] players, double[] bets, int gameID) {
        this.players = players;
		this.bets = bets;
		this.gameID = gameID; 
		
    }

    //Accessors

    /**
    Gets the list of players' usernames as a string
    @return the players' usernames, space separated 
    */ 

    public User[] getPlayers() {
	return this.players;
    }

    /**
    Gets the list of bets as a string
    @return the players' bets, space separated
    */
    public double[] getBets() {
	return this.bets;
    }

    /**
    Gets the game id
    @return the game id 
    */
    public int getGameID() {
        return this.gameID; 	
    }

    //Mutators
	
    /**
    Updates a certain players' bet amount
    @param username the username of the players' bet to be updated
    @param val the value that the bet is updated to
    */ 
    public void updateBet(String username, int val) 	{
	for (int i = 0; i < this.players.length; i++) {
		if ((this.players[i].getUsername()).equals(username)) {
			this.bets[i] = val;
		}
	}
    }

    /**
    Takes the players bets from their wallets
    */
    public void takeMoney() {
	for (int i = 0; i < this.players.length; i++) {
		Wallet wallet = this.players[i].getWallet();
		wallet.changeMoney(-this.bets[i]);
	}
    }
    /**
    Returns the players winning to their respective wallets
    */ 
    public void returnMoney() {
	for (int i = 0; i < this.players.length; i++) {
		Wallet wallet = this.players[i].getWallet();
		wallet.changeMoney(this.bets[i]);
	}
    }
}
