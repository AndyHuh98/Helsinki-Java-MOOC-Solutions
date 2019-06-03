
public class Player {
	//Attributes
	private String name;
	private int goalsScored;
	
	//Getters
	public String getName() { return name; }
	public int getGoalsScored() { return goalsScored; }
	
	//Overridden toString Method
	@Override
	public String toString() {
		return "Player: " + getName() + ", goals " + getGoalsScored();
	}
	
	//Constructor(s)
	public Player(String playerName) {
		name = playerName;
	}
	
	public Player (String playerName, int goalsScored) {
		name = playerName;
		this.goalsScored = goalsScored;
	}
	
    public static void main(String[] args) {
    Team barcelona = new Team("FC Barcelona");
    System.out.println("Team: " + barcelona.getName());

        Player brian = new Player("Brian");
        System.out.println("Player: " + brian);

        Player pekka = new Player("Pekka", 39);
        System.out.println("Player: " + pekka);
    }
}
