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

  public void loadMoney(double amount) {
    //write code here
    if (amount > 150) {
      //amount > 150 not balance>150 - but why???
    balance = 150;
    //this truncates it to 150 if only this method ran.
   }else if (amount<0){
     balance = balance;
     }else if (amount>0){
     balance+=amount;
   }
  }

  public String toString() {
  // write code here
    return "The card has " + balance + " dollars";
  }

}