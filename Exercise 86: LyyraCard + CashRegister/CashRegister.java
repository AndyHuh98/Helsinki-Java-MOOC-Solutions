public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister() {
    	cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // the price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
    	if (cashGiven >= 2.50) {
    		 //the price of lunch is added to register
    		cashInRegister += 2.50;
            //the amount of the sold lunches is incremented by one
    		economicalSold++;
    		 //the method returns cashGiven - lunch price
    		return cashGiven - 2.50;
    	} else {
            //if not enough money is given, all is returned and nothing else happens
    		return cashGiven;
    	}
    }

    public double payGourmet(double cashGiven) {
        // the price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
    	if (cashGiven >= 4.00) {
        //    the price of lunch is added to the register
    		cashInRegister += 4.00;
        //    the amount of the sold lunches is incremented by one
    		gourmetSold++;
        //    the method returns cashGiven - lunch price
    		return cashGiven - 4.00;
    	}  else {
            // if not enough money is given, all is returned and nothing else happens
    		return cashGiven;
    	}
    }
    
    public boolean payEconomical(LyyraCard card) {
    	if (card.balance() > 2.50) {
    		economicalSold++;
    		card.payEconomical();
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public boolean payGourmet(LyyraCard card) {
    	if (card.balance() > 4.00) {
    		gourmetSold++;
    		card.payGourmet();
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
    	if (sum > 0) {
    	   card.loadMoney(sum);
    	   cashInRegister += sum;
    	} 
    }

    public String toString() {
        return "money in register: "+cashInRegister+"\neconomical lunches sold: "+economicalSold+" \ngourmet lunches sold: "+gourmetSold;
    }
    
    public static void main(String[] args) {
        CashRegister unicafeExactum = new CashRegister();
        System.out.println( unicafeExactum );

        LyyraCard cardOfJim = new LyyraCard(2);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        unicafeExactum.loadMoneyToCard(cardOfJim, 100);

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        System.out.println( unicafeExactum );
    }
}
  
