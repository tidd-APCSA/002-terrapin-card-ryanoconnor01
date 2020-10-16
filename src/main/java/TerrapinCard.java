public class TerrapinCard {
  private double balance;

  public TerrapinCard(double balance) {
  // write code here
    this.balance = balance;

  }


  public void payEconomical() {
// write code here
    if (balance > 2.5) {
      balance = balance - 2.5;
    }
  }

  public void payGourmet() {
  // write code here
   if (balance > 4.0) {
    balance = balance - 4.0;
   }
  }

  public String toString() {
  // write code here
    return "The card has " + balance + " dollars";
  }

}