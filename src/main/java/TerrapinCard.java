public class TerrapinCard {
  private double balance;

  public TerrapinCard(double balance) {
  // write code here
    this.balance = balance;
  }

  public void payEconomical() {
// write code here
    if (balance >= 2.5) {
      balance = balance - 2.5;
    }
  }

  public void payGourmet() {
  // write code here
   if (balance >= 4.0) {
    balance = balance - 4.0;
   }
  }

  public void loadMoney(double amount) {
    if (amount > 150){
      balance = 150;
    }
    if (amount < 0){
      balance = balance;
    }else if((amount + balance) < 150){
      balance += amount;
    }
   }
//getter method
   public double getBalance(){
     return balance;
   }

  public String toString() {
  // write code here
    return "The card has " + balance + " dollars";
  }

}