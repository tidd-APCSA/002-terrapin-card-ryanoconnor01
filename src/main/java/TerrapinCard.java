public class TerrapinCard {
  private balance;

  public TerrapinCard(double balance) {
  // write code here
    this.balance = balance;

  }
  

  public void payEconomical() {
// write code here
    balance = balance - 2.5;
  }

  public void payGourmet() {
  // write code here
    balance = balance - 4.0;
  }

  public toString() {
  // write code here
    return "The card has " + balance + " dollars";
  }

}