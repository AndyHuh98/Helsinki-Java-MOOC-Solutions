public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        balance = balanceAtStart;
    }
    
    public void payEconomical() {
    	if (!(balance < 2.50)) {
    		balance -= 2.50;
    	}
    }

    public void payGourmet() {
    	if (!(balance < 4.00)) {
    		balance -= 4.00;
    	}
    }
    
    public void loadMoney(double amount) {
        if (amount > 0) {
        	balance += amount;
        } 
        if (balance > 150) {
        	balance = 150;
        }
    }
    
    public double balance() {
        return this.balance;
    }
        
    public boolean pay(double amount){
        // the method checks if the balance of the card is at least the amount given as parameter
    	if (balance >= amount) {
    		balance -= amount;
    		return true;
    	} else {
    		return false;
    	}
     }
    
    public String toString() {
        return "The card has " + balance + " euros.";
    }
    
    public static void main(String[] args) {
        LyyraCard cardOfPekka = new LyyraCard(10);

        System.out.println("money on the card " + cardOfPekka.balance() );
        boolean succeeded = cardOfPekka.pay(8);
        System.out.println("money taken: " + succeeded );
        System.out.println("money on the card " + cardOfPekka.balance() );

        succeeded = cardOfPekka.pay(4);
        System.out.println("money taken: " + succeeded );
        System.out.println("money on the card " + cardOfPekka.balance() );
    }
}
