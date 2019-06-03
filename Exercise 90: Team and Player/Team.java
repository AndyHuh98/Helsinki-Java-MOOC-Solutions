import java.util.ArrayList;

public class Team {
	//Attributes
	private String name;
	private ArrayList<Player> players = new ArrayList<Player>();
	private int maxSize;
	private int currentSize = 0;
	
	//Getters
	public String getName() { return name; }
	public int size() { return currentSize; }
	public int goals() { 
		int goals = 0;
		for (Player player : players) {
			goals += player.getGoalsScored();
		}
		return goals;
	}
	
	//Attribute Manipulators
	public void addPlayer(Player player) {
		if (currentSize < maxSize) {
			players.add(player);
			currentSize++;
		} 
	}
	
	public void setMaxSize(int size) {
		maxSize = size;
	}
	
	//Printers
	public void printPlayers() {
		for (Player player : players) {
			System.out.println(player.toString());
		}
	}
	
	
	//Constructor(s)
	public Team(String teamName) {
		name = teamName;
		maxSize = 16;
	}
	
	//Main method
    public static void main(String[] args) {
        Team barcelona = new Team("FC Barcelona");

        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

        System.out.println("Total goals: " + barcelona.goals());
    }
}
