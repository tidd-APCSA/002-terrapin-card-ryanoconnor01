public class TerrapinCard {
  private double balance;

  public TerrapinCard(double balance) {
  // write code here
    this.balance = balance;
  }

  public void payEconomical() {
// write code here
    if (this.balance >= 2.5) {
      this.balance = balance - 2.5;
    }
  }

  public void payGourmet() {
  // write code here
   if (this.balance >= 4.0) {
    this.balance = balance - 4.0;
   }
  }

  public void loadMoney(double amount) {
    if (amount < 0){
      balance = balance;
    }
    if((amount + balance) <= 150){
      balance += amount;
    }
   }
//getter method
   public double getBalance(){
     return this.balance;
   }

  public String toString() {
  // write code here
    return "The card has " + this.balance + " dollars";
  }

}